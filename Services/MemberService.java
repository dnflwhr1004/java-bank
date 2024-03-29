package com.bitcamp.Services;
import com.bitcamp.Domains.AdminBean;
import com.bitcamp.Domains.CustomerBean;
import com.bitcamp.Domains.MemberBean;
public interface MemberService {
	
	public void join(CustomerBean param);
	public void register();
	public CustomerBean[] findAllCustomers();
	public AdminBean[] findAllAdmins();
	public MemberBean[] findByName(String name); // 고객, 사원 공용메소드
	public MemberBean findById(String id); // 고객, 사원 공용메소드
	public boolean login(MemberBean param);
	public int countCustomers(); // 고객수
	public int countAdmins(); // 직원수
	public boolean existId(String id);
	public void updatePass(MemberBean param);
	public void deleteMember(MemberBean param);
	
}
