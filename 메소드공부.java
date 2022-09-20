package 자바0913;

public class 메소드공부 {
	// 메소드 : 뭔가를 수행하는 기능
	//javascript에 function하고 같은 개념
	// () => 파라미터 or 매개변수
	// public static : 지금 몰라도 됨
	// int : 리턴 타입
	// 더하기 : 메소드 이름(기능 이름)
	// 리턴 타임 : int, bouble, float, boolean ... 데이터 타입 + String(클래스 타입)
	public static int 더하기 (int x, int y) {
		return x+y;
		
		
	}
	public static int 빼기 (int x, int y) {
		return x-y;
	}
	
	// 나누기 메소드 만들기
	
	public static int 나누기 (int x, int y) {
		return x/y;
	}
	
	// 곱하기 메소드 만들기
	
	public static int 곱하기 (int x, int y) {
		return x * y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int 결과 = 더하기(20,10);// 30
		int 결과2 = 빼기(30,5); // 25
		int 결과3 = 나누기(50,5); // 10
		int 결과4 = 곱하기(9,3); // 27
		System.out.println(결과);
		System.out.println(결과2);
		System.out.println(결과3);
		System.out.println(결과4);
		// System.out.println(결과4); : 1번 , (int x, int y) : 2번 , return x * y; : 3번
	}

}
