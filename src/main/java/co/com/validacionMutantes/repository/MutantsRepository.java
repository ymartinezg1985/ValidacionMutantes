package co.com.validacionMutantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.validacionMutantes.entitie.CadenasMutantes;

public interface MutantsRepository extends JpaRepository<CadenasMutantes, Integer> {

}