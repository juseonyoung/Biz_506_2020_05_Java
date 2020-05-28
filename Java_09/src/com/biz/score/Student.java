package com.biz.score;

public class Student {

	public String strName = "홍길동";
	public int intAge = 33;
	public String strTel = "010-111-1111";
	
	public void make() {
		
		strName = "성춘향"; 
		intAge = 16;
		strTel = "010-222-2222"; //Grade07에서는 make 호출하지 않았으므로 무시함
	}
	
	public String getName() {
		return strName;
	}
	public int getAge() {
		return intAge;
	}
	public String getTel() {
		return strTel;
	}
	
	
}
