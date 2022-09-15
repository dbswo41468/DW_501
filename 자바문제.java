package 자바0913;

public class 자바문제 {
	public static void main(String[] args) {

		String name[] = {"Brian","kim"};
		/*
		 * 문제1. 배열 name에 있는 원소(element)중 "kim"의 위치를 찾아
		 * "kim은 x에 있습니다." 출력나오게 로직 구현하기.
		 * 정답) kim은 배열 1번째에 있으므로 "kim은 1번에 있습니다." 정답입니다.
		 * hint) 오늘배운 equals와 for문을 이용해서 풀 것!
		 */
		//방법 1.
		for(int i=0; i<name.length; i++) {
			boolean isCheck = name[i].equals("kim");
			if(isCheck == true) {
				System.out.println("kim은 " + i + "번에 있습니다.");
				break;
			}
		}
		//방법2. (쌤이 선호하는 방법)
		for(int i=0; i<name.length; i++) {
			if(name[i].equals("kim")) {
				System.out.println("kim은 " + i + "번에 있습니다.");
				break;
			}
		}
		
		
		/*
		 * 문제2. 홍길동 번호는 010-3333-9999 입니다. 길동이는 개인정보 유출을 생각해
		 * 핸드폰 번호를 010-****-****로 보이게 하고 싶습니다.
		 * 010-3333-9999 -> 010-****-**** 변경 하고 출력하시오.
		 * hint) 오늘배운 split과 for문을 이용해서 풀 것!
		 */
		String phone = "010-3333-9999";
		String array[] = phone.split("-");
		for(int i=1; i<=2; i++) {
			array[i] = "****";
		}
		String 결과 = array[0]+"-"+array[1]+"-"+array[2];
		System.out.println("홍길동 번호 => "+결과);
		
		
	}

}
