package cafe.control;

public class exit implements menu_able{

	@Override
	public boolean menu_active() {
		System.out.println("감사합니다");
		return false;
	}

}