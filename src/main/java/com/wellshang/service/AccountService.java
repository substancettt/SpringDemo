package com.wellshang.service;

import com.wellshang.dao.AccountDao;
import com.wellshang.model.Account;

public class AccountService {

	private AccountDao accountDao;

	public void insertAccount(Account account) {
		accountDao.insert(account);
	}


	public Account getAccountById(Integer id) {
		return accountDao.getAccountById(id);
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
