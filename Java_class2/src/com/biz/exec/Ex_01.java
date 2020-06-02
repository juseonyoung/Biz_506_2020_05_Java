package com.biz.exec;

import com.biz.model.AddressVO;

public class Ex_01 {

	// run을 사용해서 프로젝트를 run하려면 반드시 main() method있어야 한다.
	
	public static void main(String[] args) {
		
		AddressVO address1 = new AddressVO();
		AddressVO address2 = new AddressVO();
		AddressVO address3 = new AddressVO();
		
		address1.setName("홍길동");
		address2.setName("이몽룡");
		address3.setName("성춘향");
		
		address1.setAddr("광주");
		address2.setAddr("부산");
		address3.setAddr("서울");
		
		address1.setTel("010-111");
		address2.setTel("010-222");
		address3.setTel("010-333");
		
		address1.setAge(33);
		address2.setAge(44);
		address3.setAge(34);

		// address* 인스턴스에 저장된 주소들을
		// 별도의 문자열 변수에 복사하여 콘솔에 출력 하거나
		String addr1 = address1.getAddr();
		String addr2 = address2.getAddr();
		String addr3 = address3.getAddr();

		// 직접 get method가 리턴한 값을 콘솔에 출력
		System.out.println(address1.getAge());
		System.out.println(address2.getAge());
		System.out.println(address3.getAge());
		
		
	}
}
