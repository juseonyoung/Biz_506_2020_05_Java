package com.callor.hello;

public class VarGuGu_01 {

	//가. 2개의 정수형 변수 num1, num2 를 선언하여 각각 7과 0을 저장
	//나. 저장된 두 변수를 사용하여 구구단 7단을 Console에 출력하시오.
	
	public static void main(String[] args) {
		
		int num1=7;
		int num2=0;
		
		for(int i = 1; i<10 ; i++) { //9번 돌 동안
			num2 ++; // 0부터 시작하여 1씩 값을 늘림
			System.out.println(num1+ "*"+num2+ "="+ (num1 * num2));
		}
		
	}
}
