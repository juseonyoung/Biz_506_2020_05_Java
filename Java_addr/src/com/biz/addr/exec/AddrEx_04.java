package com.biz.addr.exec;

import com.biz.addr.service.AddrService03;

public class AddrEx_04 {

	public static void main(String[] args) {
		
		AddrService03 addrService = new AddrService03();
		
		// 무한 반복 코드
		// 숫자 1은 당연히 1==1 은 영원히 true
		// break 이전까지 계속 무한 반복됨
		while(1==1) {
			/*
			 * addrService객체의 inputAddr() method를 호출하고
			 * 그 결과를 메모리 어딘가에 보관하라
			 * 메모리에 보관된 값이 false(!)이면 break 실행하라
			 */
			if( !addrService.inputAddr() ) {
				break;
			}
			
		}
		
		addrService.addrList();
		System.out.println("업무 종료");
		
		
	}
}
