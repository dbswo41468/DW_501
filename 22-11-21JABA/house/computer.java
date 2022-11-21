package house;
// extends - 확장,상속
public class computer extends house_item{
	// 자동으로 자식 태그에 super이 적용된다
	// 부모 클래스의 기본 생성자 메서드가 실행이된다
	// 자식태그에서 부모를 호출 하려면 앞에 super 을 붙이면 좋다
	public String vga;
	public computer() {}
	public computer(String brand, int price, String vga) {
		super(brand,price); // super - super는 부모이다.
		this.vga = vga;
	}
	// 부모가 가진 buy클래스를 자식들이 재해석 한것
	public void buy() {
		System.out.println("컴퓨터 구매하였습니다.");
	}
}
