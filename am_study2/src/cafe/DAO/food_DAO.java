package cafe.DAO;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cafe.VO.food;

public class food_DAO extends base_DAO{

	
	public Map<Integer,food> food_list() {
		
		Map<Integer,food> food_map = new HashMap<>();
		
		String sql = "select * from food";
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next() ){ // 여러 레코드를 조회 했다면 반복문 처리
				food data = new food( rs.getInt("food_seq"), rs.getString("food_name"),
				rs.getInt("cost"), rs.getInt("cook_time"), rs.getInt("cal"),
				rs.getString("allergy"), rs.getInt("order_quantity") );
				
				food_map.put(data.getFood_seq(), data);
				
			}
			
			return food_map;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}




/*
 * 	자바 컬렉션
 * 
 *  Collection (인터페이스)
 *  	1. List	(인터페이스)
 *  		1). ArrayList (클래스)
 *  			장점 - 배열중 속도가 가장 빠름
 *  			단점 - 추가 삽입, 삭제 느림
 *  					추가 : 
 *  					삭제 : 
 *  
 *  		2). LinkedList (클래스)
 *  			ArrayList가 가진 단점을 보완하기위해 만듬 공간이 연속적으로 되어있지 않음,
 *  			데이터가 가진 공간을 링크한 형태,
 *  			다음 순서의 메모리 주소를 저장하고있다
 *  			삭제 : 삭제 하려는 인덱스 연결을 끊고 그 다음 순서를 링크한다
 *  			추가 : 새로운 인덱스를 만들고 새롭게 연결 시켜줌
 *  
 *  		3). vector
 *  			속도,시간,방향
 *  
 *  		4). stack
 *  			FLIO : 처음에 들어온게 마지막에 나간다 ex) 뒤로가기 버튼
 *  			LIFO : 마지막에 들어온게 먼저 나간다
 *  
 *  		5). queue 들어온 대로 순차적으로 내보낸다
 *  			FIFO : 처음에 들어온게 처음에 나간다
 *  			LILO : 마지막에 들어온게 마지막에 나간다
 *  
 *  	2. Set (인터페이스)
 *  			중복을 허용하지않음,
 *  			순차적으로 데이터를 저장하지 않음
 *  			값 -> Hash 함수 저장 -> 값
 *  			
 *  		1). HashSet
 *  			데이터를 그룹화 할 때
 *  			집합
 *  
 *  		2). TreeSet
 *  			검색 할 때
 *  			이진 Tree 구조 사용
 *  			데이터가 들어가는 공간 - node
 *  			최상위 node - root , root 아래로 두개씩만 생성가능함
 *  			기준점의 데이터보다 크면 오른쪽 배치
 *  			기준점의 데이터보다 작으면 왼쪽 배치
 *  
 *  			전위 : 가운데 출력 -> 왼쪽 이동 -> 오른쪽
 * 				중위 : 왼쪽 -> 가운데 -> 오른쪽 , 정렬되서 출력
 * 				후위 : 왼쪽 -> 오른쪽 -> 가운데
 * 
 * 	Map (인터페이스)
 * 		1. HashMap
 * 		2. HasTable
 * 		3. TreeMap
 * 		4. Properties
 * 		문자열로만 사용
 * 
 * 
 * 	map 인터페이스는 키와 값의 쌍을 하나의 데이터로 저장한다
 *  데이터 접근은 키를 찾아 데이터를 리턴한다
 *  그래서 키는 중복으로 사용하지않는 데이터로 지정해야한다. (회원의 고유번호, 도서관의 책 번호, 주민번호 등등)
 *  
 *  Map 인터페이스의 메서드
 *  V put( k key, v value)	- k,v 는 제네릭 타입 <키,값> 으로 저장된다
 *  boolean containsKey(Object k) 맵에 키가 있다면 true , 없다면 false
 *  boolean containsValue(Object v)	맵에 value가 있다면 true, 없다면 false
 *  V get(Object k)	- 키에 대칭되는 값을 리턴
 *  
 *  예시)
 *  Map<String, member> m = new HashMap<String, member>();
 *  	
 *  m.put("10rk1234", new member("김유신) );
 *  	V put(k key, V value)
 *  	k - String, V - member
 *  
 *  m.containskey("20사1234");
 *  	boolean containsKey(Object k)
 *  	Object - String
 * 	
 */








