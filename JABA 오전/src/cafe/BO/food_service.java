package cafe.BO;

import java.util.Map;
import java.util.Scanner;

import cafe.DAO.food_DAO;
import cafe.VO.food;
import cafe.VO.order_list;
import cafe.main.cafe_main;

public class food_service {
	private food_DAO fdao = new food_DAO();
	private Scanner sc = new Scanner(System.in);
	
	public boolean order_food(int seq) {
		// 음식 주문 하면 실행되는 메서드
		// 주문 한 음식을 DB와 비교하여 해당 음식의 조리시간, 금액, 알러지 등등 정보 공개
		Map<Integer,food> map = fdao.food_list();
		if(map != null) {
			food my_Order = map.get(seq);
			System.out.println("주문 음식 : "+my_Order.getFood_name());
			System.out.println("조리시간 : "+my_Order.getCook_time()+"분");
			System.out.println("금액 : "+my_Order.getCost()+"원");
			System.out.println("알러지 : "+my_Order.getAllergy());
	
			String[] tmp = cafe_main.user.getAllergy().split(","); // 회원가입할 때 알러지 입력시 알러지 , 로 구분해서 입력
			
			// 알러지 구분 
			System.out.println(tmp[0]);
			for(String all : tmp) {
				if(my_Order.getAllergy().contains(all) && !(tmp.equals("x"))) {
					System.out.println("주문하신 음식은 알러지 유발 음식 입니다");
					System.out.print("계속 주문하시겠습니까?(y/n) : ");
					if( sc.nextLine().equals("n"))
						return true; // 알러지 때문에 다른 음식 주문하는 경우
					
					break; // 음식에 알러지 성분이 나왔으니 비교 하는거 멈추기
				}
			} // 반복문이 정상적으로 종료 되면 주문을 계속 진행 하겠다는것
				
			// 주문 내역 DB에 저장하기 위한 코드 계속 작성
			System.out.println("주문 요청 사항 : ");
			String memo = sc.nextLine();
			order_list cont = new order_list(my_Order.getFood_name(),
					cafe_main.user.getId(), my_Order.getCost(), memo);
			// order_list 클래스의 객체에 주문애역 저장하기
			// 주문음식 이름,주문자, 주문금액, 요청사항 순으로 저장하기
			// 주문 음식은 위에서 my_Order라는 이름으로 food_DAO를 통해 DB에서 가지고왔음
			fdao.order_insert(cont);
		}
		else {
			System.out.println("관리자에게 문의 하세요");
			return true; // 프로그램 코드가 (DB문제) 실행되지 않는 경우
		}
		return false; // 정상적으로 주문 처리가 된 경우
	}
	
}
