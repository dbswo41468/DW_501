package test1;

// 패키지가 다른 클래스에서도 사용하려면 public 를 써야한다
public class member {
	
	// 클래스 변수 - 변수 앞에 클래스 이름이 붙어있다 ex) static
	// 해당 프로그램에서 해당 이름으로 유일하게 하나만 있다 객체 개수와 상관없이
	// 생성 : 프로그램 로드
	// 종료 : 프로그램 종료
	static int count; // 클래스 변수
	
	// 인스턴스 변수 - 클래스 내부에서 만들어진 변수
	// 객체 수와 동일
	// 생성 : 클래스 객체 생성시
	// 종료 : 클래스 객체 종료시
	public String 아이디; // 인스턴스 변수
	public String 이름; // 인스턴스 변수
	public String 주소; // 인스턴스 변수
	public String 성별; // 인스턴스 변수
	
	public member() {} // 생성자 메서드
	public member(String 아이디, String 이름, String 주소, String 성별) {
		this.성별 = 성별;
		this.아이디 = 아이디;
		this.이름 = 이름;
		this.주소 = 주소;
	}
	
	public void output() {
			System.out.println("아이디 : "+ 아이디 +" 이름 : "+ 이름 + " 주소 : "+ 주소 + " 성별 : "+ 성별);
	}
}