package com.capgemini.bankapp.repository.impl;
import com.capgemini.bankapp.repository.BankRepository;


import java.util.HashSet;

import org.springframework.stereotype.Repository;

import com.capgemini.bankapp.entities.*;

@Repository

public class BankRepositoryImpl implements BankRepository  {
	private HashSet<BankAccount> bankAccounts;
	
	public BankRepositoryImpl() {
		super();
		bankAccounts=new HashSet<>();
		bankAccounts.add(new BankAccount(1234,"Sameera","SAVING",35000));
		bankAccounts.add(new BankAccount(2373, "Poudel", "SAVING", 56000));
		bankAccounts.add(new BankAccount(3990, "Malyka", "CURRENT", 89000));
	}
	
	@Override
	public double getBalance(long accountId) {
		for(BankAccount bankAccount : bankAccounts) {
			if(bankAccount.getAccountId()==accountId)
				return bankAccount.getAccountBalance();
		}
	
		return -1;
	}

	@Override
	public boolean updateBalance(long accountId, double newBalance) {
		for (BankAccount bankAccount : bankAccounts) {
			if(bankAccount.getAccountId() == accountId) {
				bankAccount.setAccountBalance(newBalance);
				return true;
			}
		}
		return false;
	}

}
	

	


