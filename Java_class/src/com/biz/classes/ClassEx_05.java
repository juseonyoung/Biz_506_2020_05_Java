package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_05 {

	public static void main(String[] args) {
		
		// Address클래스를 addr인스턴스로 생성
		Address addr = new Address();
		
		// addr인스턴스 통해서 getAge() 메서드를 호출,
		// getAge() 메서드가 리턴한 값을 age라는 변수를 선언하여 저장하기
		int age = addr.getAge(); //age값을 setting 하기 전에 읽었으므로 값은 0
		addr.setAge(22);
		
		System.out.println(age);
		// 클래스에 선언된 method들은 클래스에 선언된 순서와는 아무런 영향이 없다
		// 인스턴스를 만들고 인스턴스를 통해서 호출되는 순서대로 코드가 작동된다.
	}
}
