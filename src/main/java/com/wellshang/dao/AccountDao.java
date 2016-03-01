package com.wellshang.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.wellshang.model.Account;

public class AccountDao {

	private SqlSessionFactory sessionFactory;

	public AccountDao() {

	}

	public SqlSessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SqlSessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insert(Account account) {

		SqlSession session = sessionFactory.openSession();
		session.insert("account.add", account);
	}

	public Account getAccountById(Integer id) {

		SqlSession session = sessionFactory.openSession();
		Account accountFromDb = (Account) session.selectOne("account.get",
				id);
		return accountFromDb;
	}
}