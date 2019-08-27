package com.bitcamp.ServiceImpls;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bitcamp.Domains.AccountBean;
import com.bitcamp.Services.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountBean[] accounts; // 서버구축 저장소만들기 
	private int count; // 서버구축 저장소만들기 
	
	public AccountServiceImpl() {
		accounts = new AccountBean[10];
		count = 0;
	}
	
	@Override
	public void createAccount(int money) {
		AccountBean accountBean = new AccountBean(); // 나중에 문제가 되지 않기위해 로컬로..
		accountBean.setAccountNum(createAccountNum());
		accountBean.setMoney(money+"");
		accountBean.setToday(findDate());
		accounts[count] = accountBean;
		count++;
	}

	@Override
	public String createAccountNum() {
		// 1234-5678
	/*	Random ran = new Random();
		String accountNum = "";
		for(int i = 0; i < 9; i++) {
			accountNum += (i==4)?"-": 
		}*/
		return null;
	}

	@Override
	public AccountBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findDate() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date());
	}

	@Override
	public void depositMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

	
	
}
