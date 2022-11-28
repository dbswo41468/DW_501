package house;

// tv,computer,aircon 에 상속 했다
public abstract class house_item {
	public String brand;
	public int price;
	
	// 자식태그에서 부모를 호출 하려면 앞에 super 을 붙이면 좋다
	
	// 자동으로 자식 태그에 super이 적용된다
	// 부모 클래스의 기본 생성자 메소드가 실행이된다
	
	public house_item() {// 생성자 메서드, 메서드의 실행은 반드시 메서드 명으로 실행되어야한다
		
	}
	
	public house_item(String brand, int price) {
		this.brand = brand;
		this.price = price; // this 는 현재 생성되는 객체이다.
	}
	@Override
	public String toString() {
		return "브랜드 : "+brand+"	금액 : "+price;
	}
	
	// 내용은 필요없으나 메서드는 필요하다
	// 부모가 있어야 자식들이 사용 가능하다
	// 형태만 가지고 있다 세부적인 내용은 자식 클래스에서 설정한다
	// 실행 되게끔만 한다
	public abstract void buy(); // ** 추상 메서드 ** 
	// 추상 메서드를 가진 클래스는 반드시 추상 클래스가 되어야한다
}

/*
	추상 클래스는 추상 메서드를 가질 수 없다
	추상 클래스는 객체 생성이 불가능 하다 - 자식이 필요함
	추상 클래슨느 상속이 된다(자식 클래스가 추상 메서드를 가지게 된다)
		
	추상화를 하는 이유
	클래스이 중복성을 제거(통일성을 준다)
	가독성 증가
	에러율 감소
	유지보수 시간 단축
	
*/