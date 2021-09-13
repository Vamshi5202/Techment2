package com.techment.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.techment.dto.LoanApplicationDto;
import com.techment.entity.LoanApplication;

public interface ILoanApplicationService {

	String saveLoanApplicationToDb(LoanApplicationDto applicationDto );	
	
	LoanApplicationDto approveLoanApplication(int id);
	
	LoanApplicationDto rejectLoanApplication(int id);
	
	List<LoanApplicationDto> viewAllApplications();
	
}
