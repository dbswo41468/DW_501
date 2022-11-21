package house;
//extends - 확장,상속
public class aircon extends house_item{
	// 자동으로 자식 태그에 super이 적용된다
		// 부모 클래스의 기본 생성자 메서드가 실행이된다
	// 자식태그에서 부모를 호출 하려면 앞에 super 을 붙이면 좋다
	public int area;
	
	public aircon() {}
	public aircon(String brand, int price, int area) {
		super(brand,price); // super - super는 부모이다.
		this.area =area;
	}
	// 부모가 가진 buy클래스를 자식들이 재해석 한것
	public void buy() {
		System.out.println("에어컨 구매하였습니다.");
	}
}
