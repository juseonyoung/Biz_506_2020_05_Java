package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_04 {

	public static void main(String[] args) {
		
		Address address = new Address();
		
		// address.city="광주광역시"
		// city 변수는 private코드이므로 인스턴스 통해서 직접접근 불가
		// 따라서 city변수에 값을 저장하기 위한 setter메서드 통해서 값 저장해 달라고요청
		address.setCity("광주광역시");
		
		// city변수로부터 값을 읽기위해 getter 메서드 통해 값을 읽어들임
		String city = address.getCity();
		
		address.setCity("서울특별시");
		
		
		System.out.println(city);
		
		
		
	}
}
