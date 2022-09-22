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
	
	public static int 짝수개수구하기() {
		int val = 0;
		for(int i=1; i<21; i++) {
			if(i%2 ==0) {
				val++;
			}
		}
		
		return val;
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
	
	/*
	 * 문제3. 이 추측은 주어진 수(n)가 1이 될 때까지 다음 작업을 반복하면,
	 * 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
	 * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
	 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
	 * 2.결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
	 * 주어진 수(n)가 6 이라면
	 * 6->3->10->5->16->8->4->2->1 이 되어 총 8번 만에 1이 됩니디ㅏ.
	 * 위 작접을 몇 번이나 반복해야 하는지 리턴 하는 메소드 solution을 완성해주세요.
	 * 단, 주어진 수(n)가 1인 경우에는 0을
	 * 작업을 500번 반복할 때까지 1이 되지 않는다면 -1을 리턴해주세요.
	 * 힌트) While문 사용 
	 * 	 
	 * */
		
//	class Solution {
	    public static int solution(int num) {
	        int answer = 0;
	        if(num == 1){
	            return answer = 0;
	        }
	        while(true){ // while : () <= 안에 있는 조건이 만족할 때 까지 실행 , true <= 무한 반복
	            if(answer == 500){
	                answer = -1;
	                break;
	            }
	            if(num == 1){
	                break;
	            }
	            else if(num % 2 == 0){
	                num = num / 2;
	               
	            }	
	            else if(num % 2 == 1){
	                num = num * 3 + 1;
	            }	
	            
	            answer++;
	        }
	        return answer;
	    }
//	    
//	}
	    public static int solution(int n) {
	    	// 1비트에 표연할 수 있는 수가 8자리
	    	int snswer = 0; // int는 4바이트
	    	long x = n; // long 는 8바이트
	    	if(x ==1) return answer;
	    	while(x != 1) {
	    		if (n%2 == 0) { //입력된 수가 짝수라면
	    			 x=x /2;
	    			 ++answer;
	    		}else {//입력된 수가 홀수라면
	    			x = (x*3) + 1;
	    			++answer
	    		}
	    		if(answer > 500) return -1;
	    	}
	    	return answer;
	    }
	
	
//	-----------------
	
	    
	
	    
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=일부터십합까지합구하기();
		System.out.println(x); 
		
		int xx = 짝수개수구하기();
		System.out.println(xx);
		
		
		System.out.println(solution(626331));
}

}
