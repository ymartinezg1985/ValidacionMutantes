package co.com.validacionMutantes.services;

import java.util.Optional;

import co.com.validacionMutantes.entitie.CadenasMutantes;

public interface MutantsServices {

	CadenasMutantes add(CadenasMutantes cadenasMutantes);
	CadenasMutantes modificar(CadenasMutantes cadenasMutantes);
	Optional<CadenasMutantes> listarId(CadenasMutantes cadenasMutantes);
	void eliminar(Integer id);

}
