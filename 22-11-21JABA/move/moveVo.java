package move;

import java.io.BufferedReader;

public class moveVo {
	private String title;
	private int year;
	private int age;
	
	
	public moveVo() {}
	public moveVo(String title, int year, int age) { // 오버로딩으로 추가 된것
		// 초기화 시켜주는 작업
		this.title = title;
		this.year = year;
		this.age = age;
	}
	
	// 해당 데이터가 가진것을 출력 할 때
	@Override // 오버라이드, 컴퓨터 용 주석, 
			  // 부모가 가진 메서드를 자식이 내용만 다른 내용으로 바꾼것
			  // toString을 사용 할 때 Override를 사용하면 좋지만 안써도 된다
	public String toString() {// toString 메서드는 자바에서 일반적인 출력 용 메서드 이다
		return "제목 : "+title+" 개봉 : "+year+" 등급 : "+age+"세 이상";
	}
	
	// private 된 변수를 확인 할 때, 이걸 사용 하지 않으면 db에 자동 저장 못 함
	public void out() {
		System.out.println("제목 : "+title+" 개봉 : "+year+" 등급 : "+age);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}


/*
 * 영화제목, 개봉년도, 관람등급
 * 
 * 생성자 메서드를 통해 데이터 저장 가능하게 만들기
 * 출력 메서드 (제목,년도,등급 출력되어야함)
 */
