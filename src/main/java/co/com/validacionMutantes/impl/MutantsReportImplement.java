package co.com.validacionMutantes.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.validacionMutantes.dto.ReportADN;
import co.com.validacionMutantes.repository.MutantsReportRepository;
import co.com.validacionMutantes.services.MutantsReportService;

@Service
public class MutantsReportImplement implements MutantsReportService {
	@Autowired
	MutantsReportRepository mutantsReportRepository;

	@Override
	public ReportADN reportADN() {
		// TODO Auto-generated method stub
		return mutantsReportRepository.reportADN();
	}
}
