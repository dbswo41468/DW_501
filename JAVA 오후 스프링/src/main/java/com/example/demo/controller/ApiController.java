package com.example.demo.controller;

import java.util.ArrayList;
/*
 * Controller는 페이지 이동
 * 
 * 
 */
import java.util.HashMap;
/*
 *  RestController 와 Controller 차이점
 *  
 *  Controller는 페이지(html) 이동
 *  RestController 데이터(JSON) 전송
 */
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.ApiService;
import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVo;
import com.example.demo.vo.Login;
import com.example.demo.vo.Login2;
import com.example.demo.vo.Movie;

// Rest : 자원 ( == 데이터 )
@RestController
public class ApiController {
	
	@Autowired
	ApiService apiService;
	
	@Autowired
	EmpMapper empMapper;
	
	
	
	/*
	 * 클래스 이름 : 앞에 대문자로 시작 ex) Apple (o) apple (x)
	 * 변수 명 : 상수를 제외한 변수 이름은 소문자 : String name (o) String Name (x)
	 * 상수 : final double PI = 3.14 (o), final double pi = 3.14 (x)
	 * 함수 이름 : 명사 (x) 동사 (ㅇ) function makeData(o) function data(x)
	 */
	
	// 페이지가 아닌 데이터
	@GetMapping("/api/v1/sample")
	public List<String> callData(){
		List<String> list = new ArrayList<String>();
		list.add("삼겹살");
		list.add("오리고기");
		list.add("목살");
		
		return list;
	}

	// Get : 조회
	// Mapping : URL 연결
	// v1 : 버전을 의미
	@GetMapping("/api/v1/movie")
	public Movie callMovie() {
		
		Movie movie = new Movie();
		
		movie.setTitle("Just Friends");
		movie.setYear("2005");
		movie.setRuntime("96 min");
		movie.setGenre("Comdy, Romance");
		// movie 라는 객체를 전달함
		return movie;
	}
	
	// URL은 중복될 수 없다
	@GetMapping("/api/v1/movies")
	public List<Movie> callMovies(){
		ApiService service = new ApiService();
		
		return service.makeMovies();
	}
	
	// 데이터 받는 방법 2가지
	
	// 1. 데이터 전송량이 적을 때
	// URL을 이용해서 데이터를 받는 방법
	// Path 길(주소 or 경로)로 데이터 받기
	// Path(경로) + Variable (값)
	@GetMapping("/api/v1/sports/qatar2022/article/{articleNumber}")
	public int callAtricle(@PathVariable int articleNumber) {
		return articleNumber;
	}
	
	// 2. 데이터 전송량이 클 때
	// ? = 쿼리스트링
	// /api/v1/webtoon/list?titleId=758037&weekday=mon
	// Request( 요청 ) + Param( 파라미터 )
	
	@GetMapping("/api/v1/webtoon/list")
	public Map<String, Object> callWebtoon(@RequestParam int titleId, @RequestParam String weekday){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);
		
		return map;
	}
	
	// 문제) 웹툰 주소를 Path 로 실행
	@GetMapping("/api/v1/webtoon/list/titleId/{titleId}/weekday/{weekday}")
	public Map<String, Object> callWebtoon2(@PathVariable int titleId, @PathVariable String weekday){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("titleId", titleId);
		map.put("weekday", weekday);
		
		return map;
		
	}
	
	// Post: 데이트를 받아서 생성할 때 사용
	@PostMapping("/api/v1/join")
	public boolean callJoin(@RequestBody Login login) {
		System.out.println("HTML 에서 서버로 받아온 데이터 입니다");
		System.out.println("아이디 : "+login.getI_d() );
		System.out.println("비밀번호 : "+login.getP_w() );
		System.out.println("이메일 : "+login.getE_m() );
		return true;
	}
	
	/* * C(Create) R(Read) U(Update) D(Delete)  *
	 * 		CRUD
	 *  Get : 데이터 조회 == select
	 *  Post : 데이터 생성(입력) == insert
	 *  Patch : 데이터 업데이트 == update
	 *  Delete : 데이터 삭제 == delete
	 */
	
	@PostMapping("/api/v1/join2")
	public boolean callJoin(@RequestBody Login2 login2, HttpServletRequest request) {
		
		String ip = request.getRemoteAddr();
		System.out.println("요청 받은 IP : "+ ip);
		
		System.out.println("HTML에서 서버로 받아온 데이터 입니다");
		System.out.println("회사이름 : "+login2.getCompanyName() );
		System.out.println("사용자 이름 : "+login2.getUserName() );
		System.out.println("연락처 : "+login2.getPhone() );
		return true;
	}
	
	@GetMapping("/api/v1/emp")
	public List<EmpVo> calEmp(){
		return empMapper.selectEmp();
	}
	
	
	@GetMapping("/api/v1/dept")
	public List<DeptVO> callDept(){
		return empMapper.selectDept();
	}
	
	
	@PostMapping("/api/v1/emp/join")
	public int callEmpjoin(@RequestBody EmpVo emp) {
		return empMapper.insertEmp(emp);
		
	}
	
	
	
	
	
}
