package com.biz.model;

// 데이터를 담아서 메서드들 간에 이동할 때 사용하는 클래스
public class AddressVO {

	// 명명규칙
	// 1. 클래스: 첫글자는 대문자, 파일이름과 같게
	// 2. 변수 : 첫글자가 소문자
	// 3. method :첫글자가 소문자
	
	// 공통사항
	// 두번째부터는 숫자와 언더바 가능 , 빈칸안됨(X)
	// 2개단어 이상으로 조합하는 것 권장
	// 단어조합시 두번째 단어부터는 첫글자를 대문자로
	// 클래스: StudentClass
	// 변수: studentName
	// method : studentList()
	
	private String name;
	private String tel;
	private String addr;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
