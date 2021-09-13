package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.LoanApplication;

public interface ILoanApplicationdao extends JpaRepository<LoanApplication, Integer> {

}
