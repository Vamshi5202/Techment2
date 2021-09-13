package com.techment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dao.ILoanApplicationdao;
import com.techment.dao.IUserdao;
import com.techment.dto.LoanApplicationDto;
import com.techment.dto.UserDto;
import com.techment.entity.User;
import com.techment.exception.InvalidTokenException;
import com.techment.exception.LoanApplicationAlreadyExist;
import com.techment.exception.LoanApplicationNotFound;
import com.techment.service.ILoanApplicationService;
import com.techment.service.IUserService;

@RestController
@RequestMapping(value = "/loanApplication")
public class LoanApplicationController {

	@Autowired
	ILoanApplicationService loanApplicationImpl;
	IUserService userService;

	@Autowired
	ILoanApplicationdao loanApplication;

	@Autowired
	IUserdao userDao;

	@PostMapping("/ApplyLoan")
	public ResponseEntity<String> LoanApplication(@RequestBody LoanApplicationDto applicationDto,
			@RequestHeader String token) throws InvalidTokenException {
		try {
			User user = userDao.findByToken(token).get();

			if (user == null) {

				return null;
			} else {
				try {
					loanApplicationImpl.saveLoanApplicationToDb(applicationDto);
					return new ResponseEntity<String>("New Loan Application Has Forwarded Now Wait For Response",
							HttpStatus.OK);
				} catch (Exception e) {

					throw new LoanApplicationAlreadyExist("Already Exists");
				}

			}

		}
		/*
		 * catch(InvalidTokenException exception) { throw new
		 * InvalidTokenException(token); }
		 */
		catch (Exception e) {

			throw new InvalidTokenException("Invalid Token");
		}

	}

	@PutMapping(value = "/ApproveApplicationById/{id}")
	public ResponseEntity<LoanApplicationDto> ApproveApplication(@PathVariable int id, @RequestHeader String token)
			throws InvalidTokenException {
		try {

			User user = userDao.findByToken(token).get();

			if (user == null) {

				return null;

				// return new ResponseEntity<String>(, null)
			} else {
				try {
					LoanApplicationDto applicationDto = loanApplicationImpl.approveLoanApplication(id);
					return new ResponseEntity<LoanApplicationDto>(applicationDto, HttpStatus.ACCEPTED);
				} catch (Exception e) {
					throw new LoanApplicationNotFound(" id not found for rejecting Application");
				}
			}
		}

		catch (Exception e) {
			throw new InvalidTokenException("Invalid Token");
		}
	}

	@PutMapping(value = "/RejectApplicationById/{id}")
	public ResponseEntity<LoanApplicationDto> RejectApplication(@PathVariable int id, @RequestHeader String token)
			throws InvalidTokenException {
		try {

			User user = userDao.findByToken(token).get();

			if (user == null) {

				return null;

				// return new ResponseEntity<String>(, null)
			} else {
				try {
					LoanApplicationDto applicationDto = loanApplicationImpl.approveLoanApplication(id);
					return new ResponseEntity<LoanApplicationDto>(applicationDto, HttpStatus.ACCEPTED);
				} catch (Exception e) {
					throw new LoanApplicationNotFound(" id not found for rejecting Application");
				}
			}
		}

		catch (Exception e) {
			throw new InvalidTokenException("Invalid Token");
		}

	}

	@GetMapping("/AllApplication")
	public ResponseEntity<List<LoanApplicationDto>> AllApplications() {
		return new ResponseEntity<List<LoanApplicationDto>>(loanApplicationImpl.viewAllApplications(),
				HttpStatus.ACCEPTED);

	}

}
