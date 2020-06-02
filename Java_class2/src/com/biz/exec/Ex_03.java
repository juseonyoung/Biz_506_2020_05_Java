package com.biz.exec;

import com.biz.service.MethodService;

public class Ex_03 {

	public static void main(String[] args) {
		
		int num1=30;
		MethodService mService = new MethodService();
		
		// 메소드를 호출하려면 인스턴스(점.)연산자 만나서 호출
		// 반드시 인스턴스를 만들어놔야 한다.
		mService.print(num1);
		mService.print(50); //메소드서비스 클래스의 메소드로 이동
		
		
	}
}
