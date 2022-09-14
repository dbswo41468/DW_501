package 자바0913;

import java.util.Scanner;

public class For문 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/*for문 실행 순서
//		 * 1. int i=0
//		 * 2. i<10;
//		 * 3. 코드실행
//		 * 4. i++; 
//		 */
//		int i = 0;
//		for(i=0; i<10; i++) {
//			
//		}
//		System.out.println(i);  //i는 이미 for문 끝날 때 생을 마감함
		
		/*
		 	문제 1. : num에 값을 입력 받았을 때 num을 x로 나눈 나머지가 1이 되도록
			하는 가장 작은 자연수 x을 출력하시오.
			ex)num이 10이라고 가정하면 가장 작은 자연수는 3입니다.
			제한 사항: num은 3 <= num <= 1000 입니다.
			hint : while or for문을 이용해서 풀어보세요
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은"+num);
		
//		int x=0;
//		if(num >= 3 && num <= 1000) {
//			for(x=1; x<=num; x++) {
//				if(num % x == 1) {
//					System.out.println("가장 작은 수 => "+x);
//					break;
//				}
//			}
//		}
//		else {
//			System.out.println("3~1000 사이의 숫자를 입력해주세요");
//		}
//		
		
		/*
		 * 문제 2번 3~6 숫자 총합 for문으로
		 * 
		 * 3+4+5+6 = 18
		 * 
		 * */
		
//		int j=0;
//		for(int i=3; i<7; i++) {
//				j += i;
//		}
//		
//		System.out.println(j);
//		
		
		int answer = 0;
        while(true){
            if(num % 2 == 0){
            num = num / 2;
            }
            if(num % 2 == 1){
                num = num * 3 + 1;
            }
            if(num == 1){
                answer = num;
                System.out.println(answer);
                break;
            }
        }
		
	}

}
