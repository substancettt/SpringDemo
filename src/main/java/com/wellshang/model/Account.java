package com.wellshang.model;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {

	private static final long serialVersionUID = -7970848646314840509L;

	private Integer accountId;
	private String username;
	private String password;
	private Date createTime;

	public Account() {
		super();
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", username=" + username
				+ ", password=" + password + ", createTime=" + createTime + "]";
	}

}