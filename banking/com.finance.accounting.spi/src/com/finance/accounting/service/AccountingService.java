package com.finance.accounting.service;

import com.finance.accounting.messages.TransactionRequest;

public interface AccountingService {
	public void submitDraftTransaction(TransactionRequest request) ;

}
