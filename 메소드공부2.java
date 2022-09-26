package 자바0913;

public class 메소드공부2 {
	// 리턴 타입이 void면 return을 명시하지 않는다
	public static void 캐릭터를선택하다(String 캐릭터이름) {
		System.out.println("당신이 선택한 캐릭터 이름은?"+캐릭터이름);
	}
	
	// 캐릭터 이름에 "다오"가 대입된것
	
	
	public static void 아이템을먹다(String 아이템) {
		System.out.println(아이템+"을 먹었습니다");
	}
	
	public static void main(String[] args) { // 메인 메소드
		// 정의한 아이템을 불러온다.
		
		
		캐릭터를선택하다("디즈니");
	// 캐릭터를선택하다(String 캐릭터이름)
		아이템을먹다("UFO");
	// 아이템을먹다(String 아이템)
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}

}
