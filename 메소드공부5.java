package 자바0913;

 

public class 메소드공부5 {

 

	public static int getSum(int x, int y) {

		return x + y;

	}

	/*

	 * public static : 접근 지정자

	 * int : 리턴 타입

	 * getSum : 메소드 (함수) 이름

	 * int x, int y : 파라미터 값 (매개변수, 인수 값...)

	 */

	

	public static boolean isLogin(boolean isLogin) {

		return isLogin;

	}

	/*

	 * public static : 접근 지정자

	 * boolean : 리턴타입

	 * isLogin : 메소드 (함수) 이름

	 * boolean isLogin : 파라미터 값

	 */

	

	public static String getWord (String word) {

		return word;

	}

	/*

	 * public static : 접근 지정자

	 * String : 리턴타입

	 * getWord : 메소드 (함수) 이름

	 * String word : 파라미터 값

	 */

	public static void main(String[] args) {

		int result = getSum(10,10);

		//문제 1. 예상되는 result 값은 ? = 20

		System.out.println("문제 1. 결과 : " + result);

		//

		boolean isResult = isLogin(true);

		//문제 2. 예상되는 isResult 값은 ? = true

		System.out.println("문제 2. 결과 : " + isResult);

		//

		String word = getWord("치즈돈까스");

		//문제 3. 예상되는 word의 값은 ? = 치즈돈까스

		System.out.println("문제 3. 결과 : " + word);

 

	}

 

}