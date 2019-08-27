package com.bitcamp.ServiceImpls;

import com.bitcamp.Domains.AdminBean;
import com.bitcamp.Domains.CustomerBean;
import com.bitcamp.Domains.MemberBean;
import com.bitcamp.Services.MemberService;

public class MemberServiceImpl implements MemberService {

	private CustomerBean[] customers;
	private AdminBean[] admins;
	private int custcount, admcount;
	
	public MemberServiceImpl() {
		customers = new CustomerBean[10];
		admins = new AdminBean[10];
		custcount = 0;
		admcount = 0;
	}

	@Override
	public void join(CustomerBean param) {
		// 마틴파울러 
		customers[custcount] = param;
		custcount++;
		}
	@Override
	public CustomerBean[] findAllCustomers() {
		
	return customers;
}

	@Override
	public AdminBean[] findAllAdmins() {
		// TODO Auto-generated method stub
		return admins;
	}

	@Override
	public MemberBean[] findByName(String name) {
	return null;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean c = new MemberBean();
		for(int i = 0; i < custcount; i++) {
			if(id.equals(customers[i].getId())) {
			c = customers[i];
				break;
			}
		}
		for(int i = 0; i < admcount; i++) {
			if(id.equals(admins[i].getId())) {
				c = admins[i];
				break;
				
			}
		}
		return c;
	}
	@Override
	public boolean login(MemberBean param) {
	
		
		
		return true;
	}
	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return custcount;
	}

	@Override
	public int countAdmins() {
		// TODO Auto-generated method stub
		return custcount;
	}

	@Override
	public boolean existId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(MemberBean param) {
		// 절대 실패하지 않는 코드를 짜라 
		String id = param.getId();
		String[] passwords = param.getPass().split(",");
		String oldPass = passwords[0];
		String newPass = passwords[1];
		for(int i = 0; i < custcount; i++) {
		
		}
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}
}
