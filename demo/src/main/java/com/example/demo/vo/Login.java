package com.example.demo.vo;


// VO 클래스 : VO는 Value Object 의 줄임마라
// VO 클래슨즌 필드 변수와 getter, setter만 온다.
public class Login {
	
	private String i_d;
	private String p_w;
	private String e_m;
	
	
	public String getI_d() {
		return i_d;
	}
	public void setI_d(String i_d) {
		this.i_d = i_d;
	}
	public String getP_w() {
		return p_w;
	}
	public void setP_w(String p_w) {
		this.p_w = p_w;
	}
	public String getE_m() {
		return e_m;
	}
	public void setE_m(String e_m) {
		this.e_m = e_m;
	}
	
	
}
