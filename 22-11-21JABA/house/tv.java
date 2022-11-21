package house;
//extends - 확장,상속
public class tv extends house_item{
	
	public int inch; 
	
	// 자동으로 자식 태그에 super이 적용된다
	// 부모 클래스의 기본 생성자 메서드가 실행이된다
	
	public tv() {}
	// 자식태그에서 부모를 호출 하려면 앞에 super 을 붙이면 좋다
	public tv(String brand, int price, int inch) {
		super(brand,price); // super - super는 부모이다. 부모 클래스 생성자 호출 
//		super는 자식 클래스 생성자에서 가장 먼저 실행 될 수 있게 해야한다
//		객체 생성시 객체의 초기화 순서는 부모 -> 자식 순이기 때문
//		** super 은 맨 위에 있어야 한다 **
		this.inch = inch;
	}
	
	public void buy() {
		System.out.println("TV 구매 했냐??.");
	}
}


/*
 * 	변수의 초기화
 *  변수 초기화 방법
 *  	1. 생성자 메서드를 통해 초기화
 *  		- 생성자 메서드 객체 생성시 실행
 *  
 *  	2. 초기화 블럭을 통한 초기화
 *  		- 초기화 블럭은 프로그램 이 로드 된 뒤에 딱 한번 실행
 *  	
 *  	3. 명시적 초기화
 *  
 *  변수 초기화 순서
 *  인스턴스 변수 초기화 순서
 *  	명시적 초기화 -> 초기화 블럭 -> 생성자 메서드
 *  
 *  클래스 변수 초기화 순서
 *  	명시적 초기화 -> 초기화 블럭 -> 
 *  
 *  
 *  
 */

/*
 * public int ch = 2; // 명시적 초기화 , 직접 변수에 데이터 넣기
	public int sound;
	 
	
	// 초기화 블럭 2가지
	static{ // 클래스 초기화 블럭 - 클래스 변수만 초기화 가능
		
	}
		
	{ // 인스턴스 초기화 블럭 - 인스턴스 변수와 클래스 변수를 초기화
		ch =10;
		sound=8;
	}
	
	
	public tv(int p) {
		
	}
 */






