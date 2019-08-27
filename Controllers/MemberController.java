package com.bitcamp.Controllers;
import javax.swing.JOptionPane;
import com.bitcamp.Services.MemberService;
import com.bitcamp.Domains.MemberBean;
import com.bitcamp.ServiceImpls.MemberServiceImpl;
public class MemberController {

	public static void main(String[] args) {
		
		MemberService service = new MemberServiceImpl();
		MemberBean member = null;
		String[] arr = null;
		String temp = "";
		while(true) {
			switch(JOptionPane.showInputDialog("0. 종료\n"
					+"1. 로그인\n" 
					+"2. 계좌조회")) {
				
			case "0" : 
				JOptionPane.showMessageDialog(null, "종료");
				return;
			}
		}
	}

}
