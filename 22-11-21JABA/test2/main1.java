package test2;

import java.util.ArrayList;
import java.util.List;

// import 했다
import test1.member;


public class main1 {

	// 클래스 메서드
	public static void main(String[] args) {

//		member[] arr = new member[5];
		
		List<member> list = new ArrayList<>();
		
		list.add(new member() );
		list.get(0).성별 = "남자";
		list.get(0).아이디 = "end";
		
		// 클래스 타입의 배열 생성하면 배열의 각 공간은 클래스 타입의 참조변수 공간이다.
		// 참조 변수만 있을 뿐이다
		
		
//		arr[0] = new member();
//		arr[0].아이디 = "li";
//		arr[1].성별 = "여자";
//		arr[2].주소 = "대전 서구 둔산동";
//		arr[3].이름 = "윤재영";
		
		// for문 1번
//		for(int i = 0; i< arr.length; i++)
		
		// for문 2번	, 배열 전용 반복문
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i< arr.length; i++) {
//			arr[i] = new member();
//			System.out.println("아이디 : ");
//			arr[i].아이디 = sc.nextLine();
//			System.out.println("이름 : ");
//			arr[i].이름 = sc.nextLine();
//			System.out.println("주소 : ");
//			arr[i].주소 = sc.nextLine();
//			System.out.println("성별 : ");
//			arr[i].성별 = sc.nextLine();
//		}
//		
//		for(member temp : arr) {
//			temp.output();
//		}
		// final int a = 10;
		// a = 20;
	}
}

// 지역변수 
// 생성 : 선언 { 시작시 생성
// 종료 : } 종료시 종료

//클래스 변수 - 변수 앞에 클래스 이름이 붙어있다
// 해당 프로그램에서 해당 이름으로 유일하게 하나만 있다 객체 개수와 상관없이
// 생성 : 프로그램 로드
// 종료 : 프로그램 종료

//인스턴스 변수 - 클래스 내부에서 만들어진 변수
// 객체 수와 동일
// 생성 : 클래스 객체 생성시
// 종료 : 클래스 객체 종료시

// 제어자
/*
 *  final - 어느곳에든 사용 가능하고 사용 했다면 어디 있든 변경 할 수 없다
 *  static - 클래스의....
 *  
 *  	static 변수
 *  		- 모든 인스턴스에 공통적으로 사용되는 클래스 변수
 *  		- 클래스 변수는 인스턴스를 생성하지 않고도 사용 가능
 *  		  new 연산자 사용하지 않아도 사용 가능
 *  		-  클래스가 메모리에 로드될 때 생성 된다.
 *  
 *  	static 메서드
 *  		- 인스턴스를 생성하지 않고도 호출이 가능한 static 메서드
 *  ***중요	- static 메서드 에서는 인스턴스 변수와 인스턴스 메서드 사용불가 만들어지는 시점이 달라서
 *  
 *  
 * 	abstarct - 추상적인, 추상화작업
 * 
 * 	접근 제어자 ** 중요 **
 * 		public - 제한 없이 사용 가능, 클래스, 변수, 메서드
 * 		default - 같은 패키지에서만 사용 가능
 * 		protected - 같은 패키지에서만 사용 가능, 예외로 상속인 경우 예외
 * 		private - 같은 패키지라도 사용 불가, 누구든 사용 불가,
 * 				  오직 해당 클래스 내부 에서만 사용가능
 */