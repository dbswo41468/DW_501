package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {
	
	/*
	 * 어플리케이션(소프트웨어 프로그램)을 만들 때 패키지 3개부터 시작 
	 * com.emample.demo
	 * 1번째 패키지 이름 com : .net , .com, .kr (닷컴)
	 * 2번쨰 패키지 이름 : 조직이름 (dW, naner, dnb ....)
	 * 3번째 패키지 이름 : 프로젝트 이름 (admin, game, drone, app)
	 * 
	 */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

// @GetMapping = Get(조회) + Mapping(연결(내가 입력한 URL))
