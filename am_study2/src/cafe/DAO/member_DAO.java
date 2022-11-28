package cafe.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cafe.VO.member;
import cafe.main.cafe_main;

public class member_DAO extends base_DAO {
	
	public member_DAO() { // 기본생성자 메서드
		table_check();
	}
	
	// 로그인 
	public boolean login(String id, String pw) {
		String sql="select * from member where id=? and tel=?";
		// member 테이블에서 id와 tel 일치 하는가 확인
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pw);
			rs = pt.executeQuery();
			if(rs.next()) {  // id와 tel이 일치하는 정보라면 로그인 성공
				cafe_main.user = new member(rs.getString(2),
						rs.getString(3),rs.getString(4), rs.getString(5), rs.getInt(6),
						rs.getString(7));
				return false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return true;// 아이디 비번이 잘못되어서  로그인 실패;
	}
	
	
	// 아이디,이메일 중복 확인
	public boolean id_check(String id, String email) {
		String sql="select * from member where id=? or email=?";
		//  member 테이블에서 입력받은 id 또는 email 이 있냐?
		
		try {
			pt =conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2,  email);
			rs = pt.executeQuery();
			if(rs.next()) { // id또는 email이 있다면 rs.next()에는 값이 있다 ,그럼 중복
				return true;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;  // rs에 값이 없다면 가입하지않은 아이디 또는 이메일 
	}
	
	
	public boolean member_insert(String id, String name, String tel, String email, String allergy) {
		String sql="insert into member(id,name,tel,email,allergy) values(?,?,?,?,?) ";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, name);
			pt.setString(3, tel);
			pt.setString(4, email);
			pt.setString(5, allergy);
			pt.executeUpdate(); // query - select,조회    , update - 변경,추가,삭제
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private void tablemake() {
		String sql="create table member( member_seq int auto_increment primary key , "
				+ "id varchar(50) not null, name varchar(20) not null, "
				+ "tel varchar(20) not null, email varchar(255) not null)";
		
		try {
			st = conn.createStatement();
			int result = st.executeUpdate(sql);
			System.out.println("member 테이블 생성");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	private void table_check() {
		String sql="select COUNT(*) as cnt from information_schema.tables ";
		sql += "where table_schema='dw_501' and table_name='member'";
		
		try {
			st = conn.createStatement(); //접속정보로 질의문 저장할수있는 객체 생성
			rs = st.executeQuery(sql); // 만들어놓은 질의문을 저장해서 연결되 데이터베이스에 전달 하고 결과받기
			if( rs.next() ) {  // rs.next() : rs에 결과값이 있는가? 없는가? 확인 하고 rs에서 값 가져오기해야한다.
				int cnt =rs.getInt("cnt");
				if(cnt==0)
					tablemake();
			}
			rs.close();
			st.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}


/*
 	자바- 데이터베이스 연결
 	
 	1. 연결할 데이터베이스의 드라이버 로드 - 
 	   많이 사용되는 데이터베이스의 드라이버는 해당 데이터베이스 웹사이트에서 얻을수있다.
 	
 	2. 드라이버 로드를 하면  데이터베이스와 자바프로그램간의  연결이 이루어진다.
 	
 	3. 데이터베이스와 연결을 하였다면 데이터베이스에  로그인을 시도한다.
 	4. 데이터베이스 계정을 가지고 로그인을 해야한다.
 	5. 데이터베이스 주소와 계정명, 비밀번호가 필요하다.
 
 
 */





