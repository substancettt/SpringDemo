package com.wellshang.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.wellshang.model.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
@TransactionConfiguration(transactionManager="transactionManager")
@Transactional
public class TestAccountService {

	Logger logger = Logger.getLogger("TestAccountService");

	@Autowired
	AccountService service;

	@Before
	public void init() {
	}

	@Test
	public void testInsertAccount() {

		Account account = new Account();
		System.out.println("1 account id is " + account.getAccountId());
		account.setUsername("xiaolong8");
		account.setPassword("123456");

		service.insertAccount(account);

		Account accountFromDb = service.getAccountById(account.getAccountId());
		
		assertNotNull(accountFromDb);
		assertEquals(account.getAccountId(), accountFromDb.getAccountId());
	}

}