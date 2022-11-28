package test1;

//member 연동
public class study3 {

	public static void main(String[] args) {
		// 이름, 연락처, 주소, 생년월일, 성별, 아이디, 
		// 회원정보 저장하기
		
		member m1 = new member(); // new 연산자를 통해 member 클래스의 공간을 메모리에 생성
		// m1 은 참조 변수라고 한다. 참조변수는 메모리 주소를 저장 할 수 있는 변수를 참조변수라고 한다.
		// ex) m1은 member()의 메모리 주소를 알고있다.
		System.out.println(m1);
		
		m1.성별 = "여자";
		m1.아이디 = "limit";
		m1.이름 = "이순자";
		m1.주소 = "대전 중구 선화동";
		
		m1.output();

		
		member m2 = new member();
		
		m2.성별 = "남자";
		m2.아이디 = "eternal";
		m2.이름 = "장보고";
		m2.주소 = "대전 동구 가양동";
		
		m2.output();
	}
	
	
	static void output(member m ) {
		System.out.println("아이디 : "+m.아이디 +" 이름 : "+m.이름 + " 주소 : "+m.주소 + " 성별 : "+ m.성별);
	}
	
	

}

/*
 * 	member 클래스는 지금 study3 클래스와 같은 패키지 안에 있는 클래스이기 때문에 import 안해도 된다.
 * 	만약 member 클래스가 study3 클래스와 다른 패키지에 있다면 import 해야한다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
struct member{
	String 이름;
	String 연락처;
	String 주소;
	String 성별;
	String id;
	int 생년월일;
	int age
	
	void getAge() {
		age = 생년월일 계산 하여 나이 구하기
	}
}

member m1;
m1.ae = getAge(m1.생년월일);

int getAge(int birth) {
	// 생연월일 계산 후 나이구하기
	return 계산 결과
}


m1.gerAge();









member[] m1 = new member[5];

//구조체 사용안할것이라면
String[] = name = new String[5];
String[] = tel = new String[5];
String[] = addr = new String[5];
String[] = gen = new String[5];
String[] = id = new String[5];
int[] = birth = new int[5];










// . = 접근 연산자
member m1;

m1.이름 = "김유신";
m1.연락처 = "010-1234-1234";
m1.주소 = "대전 중구 선화동";
m1.성별 = "남자";
m1.id = "limit";
m1.생년월일 = 990102;

*/





























