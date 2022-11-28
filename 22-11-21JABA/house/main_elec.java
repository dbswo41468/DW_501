package house;

import java.util.List;
import java.util.Scanner;

public class main_elec {
	
	static List<house_item> list = null;
	// 인스턴스 와 스태틱은 생성 시간이 다르다
	// 인스턴스 - 동적,프로그램 실행중 할당 
	// 스태틱 - 정적, 프로그램 시작시 할당
	
	
	public static void init(){
		// 클래스 참조변수명 = new 클래스명(); -> 클래스명() 은 클래스 생성자 메서드 호출이다.
		file f = new file("c:/test/electronic.txt");
			
		list = f.load();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		init();
		
		buyer jyj = new buyer();
		
		
//		for(house_item item : list)
//			System.out.println(item.toString() );
		
		// 1. tv 2. 에어컨 3. 컴퓨터 라는 선택 할 수 있는 메뉴를 띄우고
		// 	  3개 중에서 하나 선택 하면 해당 제품들만 출력되게 만들기
		
		// *** instanceof ***
		
		while(true) {
			System.out.println("1. tv 2. 에어컨 3. 컴퓨터");
			int select = sc.nextInt();
			
			int i = 1;
//			List<Integer> num = new ArrayList();
			for( house_item item : list) {
				switch(select) {
				case 1:
					if(item instanceof tv)
						System.out.println(i+". "+	item.toString());
					break;
				case 2:
					if(item instanceof aircon)
						System.out.println(i+". "+	item.toString());
					break;
				case 3:
					if(item instanceof computer)
						System.out.println(i+". "+	item.toString());
					break;
				}
				i++;
			}
			
			boolean flag = false; // 구매 제품이 선택한 제품 종류 와 일치 하는가?
			do {
				System.out.print("구매 할 제품 선택(구매X - 0) : ");
				int item_num = sc.nextInt();
				
				if(item_num == 0) continue; // continue 동작시 그 위칭에서 반복문 상위 부분으로 돌아가 다음부분을 실행한다
				else {
					
					// 1. 답
					switch(select) {// 구매 제품이 선택한 제품 종류 와 일치 하는가?
					case 1:
						if(! (list.get(item_num -1) instanceof tv))
							flag = true;
							break;
					
					case 2:
						if(! (list.get(item_num -1) instanceof aircon))
							flag = true;
							break;
					
					case 3:
						if(! (list.get(item_num -1) instanceof computer))
							flag = true;
							break;
					}
					if(flag)continue; // 구매 제품이 선택한 제품 종류와 맞지 않다면 다시 처음부터
					jyj.buy(	list.get(item_num -1)	);
				}
			}while(flag);
			
			System.out.println("추가 구매(0,1) : ");
			int end = sc.nextInt();
			if(end==0)break;
			
			
			// 1. tv 제품을 구매 하는데 제품 번호가 tv가 아니면 다시 선택하게 만들기 
			
			// 2. 제품 구매 후에 추가로 구매 할 것인지 의사를 물어보고 계속 구매, 구매 중지 선태
			
			// 3. 구매를 더 이상 하지 않는다면 지금까지 구매한 제품을 모두 출력하기
			
		}// 제품 구매 반복문 
		
		jyj.buylist();
	}
}

// static 메서드에서 사용가능 한것
// 	-> static 메서드, static 변수

// instance(인스턴스) 메서드에서 사용가능 한것
// -> 인스턴스 메서드, 인스턴스 변수, static 변수, static 메서드

// 실체화 하여 실행 할 것인가, 실체화 하지 않고 호출 할 것인?
// ex)
// 아파트를 건설 하기 위해 설계도롤 작성 한다. -> 클래스 구현
// 아파트를 분양하기 위해 모델 하우스를 짓는다. -> static은 클래스 객체 생성 하지 않아도 사용가능
// 설계도를 보고 아파트를 짓는다. -> 인스턴스는 클래스 객체 생성 해야 사용가능

// 인스턴스 메서드는 인스턴스 객체가 생성되어야 호출 가능
// 그렇게 호출 되도록 코드를 구별 해주었고 그렇게 동작 하도록 자바 머신에서 인식하기 때문에
// jvm - 자바 가상머신 
