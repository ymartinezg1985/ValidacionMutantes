package co.com.validacionMutantes.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.validacionMutantes.entitie.CadenasMutantes;
import co.com.validacionMutantes.repository.MutantsRepository;
import co.com.validacionMutantes.services.MutantsServices;

@Service
public class MutanstImplement implements MutantsServices {


	@Autowired
	MutantsRepository mutantsRepository;
	
	@Override
	public CadenasMutantes add(CadenasMutantes cadenasMutantes) {
		// TODO Auto-generated method stub
		return mutantsRepository.save(cadenasMutantes);
	}

	@Override
	public CadenasMutantes modificar(CadenasMutantes cadenasMutantes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CadenasMutantes> listarId(CadenasMutantes cadenasMutantes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}



}
