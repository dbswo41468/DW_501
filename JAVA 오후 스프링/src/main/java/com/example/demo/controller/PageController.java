package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Contrller는 페이지 주소를 작성할 때 사용 하는 어노테이션
@Controller
public class PageController {
	@GetMapping("/")
	public String callIndexPage() {
		// return 에 html 파일 이름을 작성
		return "index";
	}
	
	// 사용자가(클라이언트) 가 /hoem라고 주소를 입력하면
	// home 이름을 가진 html을 return 한다는 걸 의미
	@GetMapping("/home")
	public String callHomePage(HttpServletRequest request) {
		
		String ip = request.getRemoteAddr(); // IP 추적
		System.out.println("요청 받은 IP : "+ ip);
		
		return "home";
	}
	
	// html 이름 같게 해줘야한다
	@GetMapping("/younjae")
	public String callyounjaePage() {
		return "younjae";
		// html 이름 같게 해줘야한다;
		// 옳지 잘한다 재영이 화이띵;
		
		
		
	}
	
	@GetMapping("/movie")
	public String callmoviePage() { //집에가 임마
		return "movie";
	}
	
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}
	
	@GetMapping("/login2")
	public String callLogin2Page(HttpServletRequest request) {
		String ip = request.getRemoteAddr(); // IP 추적
		System.out.println("요청 받은 IP : "+ ip);
		return "login2";
	}
	
	@GetMapping("/emp")
	public String callEmpPage() {
		return "emp";
	}
	
	@GetMapping("/dept")
	public String callDeptPage() {
		return "dept";
	}
	
}