package 자바0913;

import java.util.Scanner;

//import java.util.Scanner;

public class 자바기초2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl + shift + o : 자동 임포트
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은 "+num);
		
		// 받아온 값이 짝수면 짝수입니다. 아니면 홀수입니다. 출력해보시오!
		
		if ((num%2) ==0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
		
		
		
		
		
	}
}