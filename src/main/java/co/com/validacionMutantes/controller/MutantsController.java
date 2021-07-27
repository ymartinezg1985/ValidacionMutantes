package co.com.validacionMutantes.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.validacionMutantes.dto.ReportADN;
import co.com.validacionMutantes.entitie.CadenasMutantes;
import co.com.validacionMutantes.logic.BuildMatrix;
import co.com.validacionMutantes.logic.TravelMatrix;
import co.com.validacionMutantes.services.MutantsReportService;
import co.com.validacionMutantes.services.MutantsServices;
/*
 * clase controller
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class MutantsController {

	Logger logger = LoggerFactory.getLogger(MutantsController.class);

	@Autowired
	MutantsServices mutantsServices;
	private ResponseEntity<String> respuesta;
	@Autowired
	MutantsReportService mutantsReportService;

	/**
	 * End Point para validar si la cadena de adn es mutante o no
	 * recibe el parametrt
	 * @param adn
	 * @return httpStatus
	 * 
	 *
	 */
	
	@PostMapping("/mutant")
	public ResponseEntity<String> isMutant(@RequestBody String[] adn) {

		respuesta = null;
		CadenasMutantes cadenasMutantes = new CadenasMutantes();

		try {

			BuildMatrix builMatrix = new BuildMatrix();
			TravelMatrix travelMatrix = new TravelMatrix();
			String[][] matriz = builMatrix.generatMatrix(adn);

			if (travelMatrix.analyze(matriz)) {
				cadenasMutantes.setAdn(travelMatrix.convertArraytoString(adn));
				cadenasMutantes.setTypeadn(1);
				respuesta = new ResponseEntity<>(null, HttpStatus.OK);
				try {
					mutantsServices.add(cadenasMutantes);
				} catch (Exception e) {
					logger.error(e.getMessage());
					respuesta = new ResponseEntity<>("La Cadena de ADN ya existe", HttpStatus.OK);
				}

			} else {
				cadenasMutantes.setTypeadn(0);
				cadenasMutantes.setAdn(travelMatrix.convertArraytoString(adn));
				try {
					mutantsServices.add(cadenasMutantes);
				} catch (Exception e) {
					logger.error(e.getMessage());
					respuesta = new ResponseEntity<>("La Cadena de ADN ya existe", HttpStatus.OK);
				}
				respuesta = new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			respuesta = new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
		}
		return respuesta;

	}

	/**
	 * Metodo para generar un reporte de la cantidad de mutantes registrados
	 * contra la cantidad de adn registrados
	 * @return
	 */
	
	@GetMapping("/stats")
	public ReportADN report() {
		ReportADN informe = null;
		try {
			informe = mutantsReportService.reportADN();
			

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return informe;
	}

}