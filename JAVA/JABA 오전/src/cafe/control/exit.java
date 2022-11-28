package cafe.control;

public class exit implements menu_able{

	@Override
	public boolean menu_active() {
		System.out.println("잘가 ~ ㅜㅜ 고생했어 목발 안녕");
		return false;
	}

}