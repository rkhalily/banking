package com.finance.accounting.server.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Account")
public class Account {
	@Column
	private long debitTransaction;
	@Column
	private long creditTransaction;
	@Column
	private String id;
	@Column
	private String serial;
	@Column
	private String hserial;
	@Column
	private List<AccountTransaction> transactions;

	public long getDebitTransaction() {
		return debitTransaction;
	}

	public void setDebitTransaction(long debitTransaction) {
		this.debitTransaction = debitTransaction;
	}

	public long getCreditTransaction() {
		return creditTransaction;
	}

	public void setCreditTransaction(long creditTransaction) {
		this.creditTransaction = creditTransaction;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getHserial() {
		return hserial;
	}

	public void setHserial(String hserial) {
		this.hserial = hserial;
	}
}
