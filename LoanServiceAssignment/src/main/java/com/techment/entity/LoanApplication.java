package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "loan100")
public class LoanApplication {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id; 
	private String bankName;
	private int minLoanAmount;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	private int maxLoanAmount;
	private int minInterestRate;
	private int minCreditScore;
	private int termLength;
	private int processingFee;
	private String rating;
	private String Status;
	public LoanApplication(String bankName, int minLoanAmount, int maxLoanAmount, int minInterestRate,
			int minCreditScore, int termLength, int processingFee, String rating, String status) {
		super();
		this.bankName = bankName;
		this.minLoanAmount = minLoanAmount;
		this.maxLoanAmount = maxLoanAmount;
		this.minInterestRate = minInterestRate;
		this.minCreditScore = minCreditScore;
		this.termLength = termLength;
		this.processingFee = processingFee;
		this.rating = rating;
		Status = status;
	}
	public LoanApplication() {
		super();
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getMinLoanAmount() {
		return minLoanAmount;
	}
	public void setMinLoanAmount(int minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}
	public int getMaxLoanAmount() {
		return maxLoanAmount;
	}
	public void setMaxLoanAmount(int maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}
	public int getMinInterestRate() {
		return minInterestRate;
	}
	public void setMinInterestRate(int minInterestRate) {
		this.minInterestRate = minInterestRate;
	}
	public int getMinCreditScore() {
		return minCreditScore;
	}
	public void setMinCreditScore(int minCreditScore) {
		this.minCreditScore = minCreditScore;
	}
	public int getTermLength() {
		return termLength;
	}
	public void setTermLength(int termLength) {
		this.termLength = termLength;
	}
	public int getProcessingFee() {
		return processingFee;
	}
	public void setProcessingFee(int processingFee) {
		this.processingFee = processingFee;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
}
