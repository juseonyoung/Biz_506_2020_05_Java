package com.biz.addr.exec;

import com.biz.addr.service.AddrService01;

public class AddrEx_01 {

	public static void main(String[] args) {
		
		// 클래스 이용하여 객체 선언, 생성
		AddrService01 addrservice01 = new AddrService01();
		
		// makeAddr 메소드 호출 주소록 생성
		addrservice01.makeAddr();
		
		// addrList 메소드 호출 주소록 출력
		addrservice01.addrList();
				
	}
}
