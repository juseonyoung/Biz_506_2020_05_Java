package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class Ex_02 {

	public static void main(String[] args) {
		
	AddressVO[] address = new AddressVO[5];

	// 다시한번 객체로 초기화 시켜줌
	
	for(int i =0; i<address.length; i++) {
		address[i]=new AddressVO();
	}
	
	
	address[0].setAddr("서울");
	address[1].setAddr("광주");
	address[2].setAddr("부산");
	address[3].setAddr("인천");
	address[4].setAddr("대구");
	
	
	address[0].setAge(55);
	address[1].setAge(25);
	address[2].setAge(35);
	address[3].setAge(55);
	address[4].setAge(45);
	
	address[0].setName("김하나");
	address[1].setName("김주찬");
	address[2].setName("박건주");
	address[3].setName("최정");
	address[4].setName("정수빈");

	
	address[0].setTel("021");
	address[1].setTel("051");
	address[2].setTel("058");
	address[3].setTel("062");
	address[4].setTel("044");
	
	AddrServiceV1 addrservice = new AddrServiceV1();
	// 배열을 매개변수를 통해 method에게 전달할 때는 이름만 붙여주면 된다.
	addrservice.address(address);

	}	
}
