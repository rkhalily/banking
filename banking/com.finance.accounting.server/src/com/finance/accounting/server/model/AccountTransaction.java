package com.finance.accounting.server.model;

public class AccountTransaction {
	long debitTransaction;
	long creditTransaction;
	String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
}
