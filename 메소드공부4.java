package 자바0913;

public class 메소드공부4 {

	/*
	 *  public static : 접근 제어자
	 *  String : 리턴 타입
	 *  getWord : 메소드(혹은 함수) 이름
	 *  String x : 파라미터 타입(혹은 매개변수)
	 * */
	
	public static String getWord(String x) {
		return x;
	}

	/*
	 * 메소드 사용하는 이유
	 * 1. 업무 분담
	 * 2. 유지보수
	 * */

	
	public static int getCount(int startNum, int endNum) {
		//문제1 startNum이 endNum보다 크면 startNum을 리언
		// endNum이 startNum보다 크면 endNum을 리턴하는 로직을 구현하시오.
		if(startNum > endNum) return startNum;
		if(startNum < endNum) return endNum;
		
		return 0;
	}
	
	
	public static int 일부터십합까지합구하기() {
		// 1~10까지 합을 구하는 로직을 구현 후 합을 리턴하시오
		
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum = sum + i;
		}
		
		return sum;
		// return : 메서드는 여기서 멈춘다는 뜻
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=일부터십합까지합구하기();
		System.out.println(x); 
	}

}
