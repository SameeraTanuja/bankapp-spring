package com.capgemini.bankapp.repository;

public interface BankRepository {
	public double getBalance(long accountId);
	public boolean updateBalance(long accountId, double newBalance);

}
