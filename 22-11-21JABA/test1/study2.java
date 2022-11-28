package test1;

public class study2 {
	public static void main(String[] ars) {
		System.out.println(" 나는 자바다. 너는? ");
		
		System.out.println(" 출력방법 1 "); //한줄 출력 (추가 출력시 옆에 안뜨고 밑으로 출력됨)
		System.out.print(" 출력방법 2 "); //그냥 출력 (추가 출력시 옆으로 출력됨)
		System.out.printf(" 출력방법 3 ");
		
		System.out.printf(" %d  %f  %s  \n  줄바꿈도 된다. \n\n ㅋ", 100, 3.14, "자바");
		// %d - 정수
		// %f - 실수
		// %s - 문자열
		System.out.println(" "+ 100+ "  "+3.14+"  자바  ");
		System.out.println(" 줄바꿈도 된다");
		
		int age = 27;
	      
	    System.out.println("너는 "+age+"살이냐?");

		
		
		
		// 한줄 주석
		/*
		 * 여
		 * 러
		 * 줄
		 * 주
		 * 석
		 * */
	}
}