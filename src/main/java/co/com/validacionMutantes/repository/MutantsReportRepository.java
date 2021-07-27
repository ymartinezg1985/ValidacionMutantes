package co.com.validacionMutantes.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.com.validacionMutantes.dto.ReportADN;
import co.com.validacionMutantes.entitie.CadenasMutantes;

public interface MutantsReportRepository extends CrudRepository<CadenasMutantes, Integer> {
	@Query(name = "reportADN", nativeQuery = true)
	public ReportADN reportADN();
}
