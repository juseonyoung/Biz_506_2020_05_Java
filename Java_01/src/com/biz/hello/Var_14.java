package com.biz.hello;

public class Var_14 {
	public static void main(String[] args) {
		
		// float는 실수형 변수
		// 소수점 이하 7자리 까지 표현하는 코드
		
		float num1 = 10.0f;
		float num2 = 3.0f;
		
		System.out.println(num1 / num2);
		
		// double은 실수형 변수이며 소수점이하 17자리까지 표현
		// 배정도 실수(float에 비해 배로 정밀함)
		double num3 =10.0;
		double num4 = 3.0;
		System.out.println(num3/num4);
		
		// integer (정수형) 변수 
		// 2의 31승 +- 범위의 정수를 취급한다(32bit, 4byte)
		
		int num5 =1000_000_000;
		int num6 = 300;
		System.out.println(num5 *num6);
		
		// 정수형변수
		// 64bit크기의 값 취급
		// 2의 63승 +- 범위의 값 취급한다
		long num7 = 1000_000_000_000_000L;
		long num8 = 3000L;
		System.out.println(num7 *num8);
		
	}
}
