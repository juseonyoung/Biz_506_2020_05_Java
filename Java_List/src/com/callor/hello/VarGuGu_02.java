package com.callor.hello;

public class VarGuGu_02 {

	// 가. 2개의 정수형 변수 num1, num2를 선언하여 각각 7과 1을 저장
	// 나. 저장된 두 변수를 사용하여 구구단 7단을 Console에 출력하시오

	// 클래스 01이랑 비교!!!
	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 1;

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n",num1 ,num2 ,(num1 * num2));
			num2++;
		
		}
		
	}
}
