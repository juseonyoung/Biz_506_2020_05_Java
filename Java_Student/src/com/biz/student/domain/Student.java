package com.biz.student.domain;

public class Student {

	// VO클래스는 실제로 프로젝트에서 주로 다루게 될 data를 추상화한 클래스
	// 주요항목 : 필드변수가 매우 중요한 클래스
	// method 역할보다는 필드변수 역할이 주로 사용되는 클래스
	
	private int num; //String으로 해야 001 002라고 할 수 있다.
	private String name;
	private int grade;
	private String dept;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int intNum) {
		this.num = intNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
