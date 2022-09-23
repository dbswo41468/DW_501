package 자바0913;

public class 메소드공부7 {

	
	// boolean : true or false 만 가능 !!!!!!!!!!!!!!!!!
	
	// public static : 접근 지정자
	// int : 리턴 타입
	// getNum : 메소드 이름
	// int x, String y : 파라미터 타입
	
	
	public static int getNum(int x, String y) { // 파라미터 안에는 모든 데이터 타입 가능
		return x;
	}
	
	// 문제1 아래 메소드 main 메소드에 호출해서 결과 확인하기
	public static int getNum(int x, String y, String z) {
		return 10;
	}
	
	// 문제 2 메소드 만들기 main함수에 호출
	/*
	 * 접근 지정자 : public static
	 * 리턴 타입 : boolean
	 * 메소드 이름 : isTrue
	 * 파라미터 : boolean, String
	 * */
	
	public static boolean isTrue(boolean x, String y) {
		return false;
	}
	
	// 문제3 main 메소드 호출하고 결과 확인
	// 메소드 이름은 같으나 파라미터 타입, 개수가 다르면 메소드 이름 중복 사용가능 ( == 오버로딩_
	
	public static String getStr() {
		return "피자빵";
	}
	
	// main 메소드 호출하고 결과 확인하기!
	
	public static int 피자빵주세요(int 빵) {
		return 빵+500;
	}
	
	public static int 돈을인출하다(int 돈) {
		return 3000;
	}
	
	
	public static int 돈을인출하다(int 돈, String 계좌) { // equals : 문자 비교
		if(계좌.equals("카카오뱅크")) {
			return 돈;
		}
		if(계좌.equals("농협")) {
			return 돈;
		}
		return 0;
	}
	
	public static int 돈을해외로송금하다(int 금액, String 해외) {
		if(해외.equals("수리남")) {
			return 500;
		}
		return 금액;
	}
	
	public static int 섯다패를돌리다(String 결과) {
		if(결과.equals("장땡")) {
			return 500;
		}
		if(결과.equals("38")) {
			return 1000;
		}
		return 0;
	}
	
	public static boolean 말해YexOrNo(String 가수) {
		if("지코".equals(가수)) {
			return true;
		}
		if("지코".equals("지코")) {
			return false;
		}
		return true;
	}
	
	public static void 무한도전(String 멤버이름) {
		if(멤버이름.equals("박명수")) {
			System.out.println("hello");
		}
		if(5 == 5) {
			System.out.println("hello");
		}
	}
	
	public static int 용돈을드리다(int 용돈금액,String 가족) {
		가족 = "아빠";
		if(가족.equals("엄마")) {
			return 용돈금액;
		}
		if(가족.equals("아빠")) {
			return 용돈금액;
		}
		return 1000;
	}
	
	
	
	public static void main(String[] args) { // 메인 함수
	int x =	getNum(10,"붕어빵"); // 메소드 호출
	// 메소드에 리턴이 있으면 대입이 가능하다. , x = return 리턴?
	System.out.println("결과"+x);
	int y =	getNum(10,"붕어빵","피자 붕어빵");
	System.out.println("결과"+y);
	boolean isX = isTrue(true,"붕어빵");
	System.out.println("결과 : "+isX);
	String word = getStr();
	System.out.println("결과 : "+word);
	int 빵 = 피자빵주세요(100);
	System.out.println(빵);
	int money = 돈을인출하다(1000);
	System.out.println(money);
	int 돈 = 돈을인출하다(3000, "농협");
	System.out.println(돈);
	
	
	}

}
