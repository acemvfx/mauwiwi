package com.accenture.tcf.bars.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="billing")
public class Record {
	@Id
	@Column(name="billing_cycle")
	private int billingCycle;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="account_name")
	private String accountName;
//
//	@Column(name="last_name")
//	private String customerLastName;
//
//	@Column(name="first_name")
//	private String customerFirstName;
	
	@Column(name="amount")
	private double amount;
	
	public Record() {
		
	}

	public int getBillingCycle() {
		return billingCycle;
	}

	public void setBillingCycle(int billingCycle) {
		this.billingCycle = billingCycle;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getAccountName() {
		return accountName;
	}

//	public void setAccountName(String accountName) {
//		this.accountName = accountName;
//	}
//
//	public String getCustomerLastName() {
//		return customerLastName;
//	}

//	public void setCustomerLastName(String customerLastName) {
//		this.customerLastName = customerLastName;
//	}
//
//	public String getCustomerFirstName() {
//		return customerFirstName;
//	}
//
//	public void setCustomerFirstName(String customerFirstName) {
//		this.customerFirstName = customerFirstName;
//	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Record(int billingCycle, Date startDate, Date endDate, String accountName, double amount) {
		this.billingCycle = billingCycle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.accountName = accountName;
//		this.customerLastName = customerLastName;
//		this.customerFirstName = customerFirstName;
		this.amount = amount;
	}
	
	
}


