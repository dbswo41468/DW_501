package cafe.control;

import java.util.Scanner;

import cafe.BO.member_service;

public class login implements menu_able{

	@Override
	public boolean menu_active() {
		Scanner sc = new Scanner(System.in);
		String id=null, pw=null;
		member_service ms = new member_service();
		
		boolean chk=true;
		do {
			System.out.print("아이디 : ");
				id= sc.nextLine();
			System.out.print("비밀번호(연락처) : ");
				pw = sc.nextLine();
			chk = ms.login(id,pw);  // 로그인 시도
			if(chk) {// 로그인 실패시
				System.out.println("회원가입 하시겠습니까?(y/n) ");
				if( sc.nextLine().equals("y") ) {
					new signin().menu_active();
				}
			}
		}while(chk);
		// do ~ while  종료되려면  로그인 성공해야한다.
		
		return true;
	}

}