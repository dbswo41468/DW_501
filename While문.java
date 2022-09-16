package 자바0913;

public class While문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문은 for문 처럼 반복문 중 하나.
		// for문에 비하면 사용 빈도는 낮으나 아주 가끔?? 사용함.
		// while문은 for문 처럼 조건 없이 계속 실행됨
		int count = 0;
		while(true) {
			++count;
			System.out.println("안녕?");
			if(count == 20) {
				break; // while문 멈추기
			}
		}
		
		// 문제 while문을 이용해서 1~10 까지 합을 구하시오 답은 55
		
		int ten = 0;
		int i = 0;
		while(true) {
			++i;
			ten = ten+ i;
			System.out.println("ten =>"+ ten );
			if( ten == 55){
				System.out.println("그만");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
