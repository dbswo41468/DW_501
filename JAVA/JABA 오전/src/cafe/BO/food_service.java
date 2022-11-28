package cafe.BO;

import java.util.Map;

import cafe.DAO.food_DAO;
import cafe.VO.food;
import cafe.main.cafe_main;

public class food_service {
	private food_DAO fdao = new food_DAO();
	
	public void order_food(int seq) {
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
			for(String all : tmp) {
				if(my_Order.getAllergy().contains(all) && !(tmp.equals("x"))	)
					System.out.println("주문하신 음식은 알러지 유발 음식 입니다");
			}
		}
		else {
			System.out.println("관리자에게 문의 하세요잉~!");
		}
	}
	
}
