package com.biz.addr.exec;

public class Number_ex {

	public static void main(String[] args) {
		
		// Integer.valueOf() : 숫자형 문자열을 정수로 변환시키는 method
		
		/*
		 * 숫자형 wrapper class의 valueOf() method를 사용하면
		 * 숫자형 문자열을 숫자형 데이터로 변환 시킬 수 있다.
		 * 
		 * 오래된 java 버전에서는 valueOf(), parse*() method의 성능차이가 있었으나
		 * java 1.6 이상에서는 내부 메커니즘이 같아져 성능 차이가 없다.
		 * 
		 * 
		 */
		Integer.valueOf("34"); // 정수 34가 출력
		
		Float.valueOf("34.2"); 
		Double.valueOf("35.5");
		Long.valueOf("4444444");
		
		// valueOf() method와 같지만 구버전!!
		// valueOf() 가 더 편함
		Integer.parseInt("34");
		Float.parseFloat("34.3");
		Double.parseDouble("25.9");
		Long.parseLong("342556456");
		
		// compile 거부하는 예시들 
		// 모두 NumberFormatException을 일으키는 코드가 나타남
		Integer.valueOf(""); // 사용자가 그냥 엔터만 쳐도 에러
		Integer.valueOf("34 "); // 숫자 앞 또는 뒤에 빈칸있을 때 white space문제 생김
		Integer.valueOf("A34"); // 숫자 앞 또는 뒤에 숫자형 이외의 문자(열)첨부시 컴파일 거부
		Integer.valueOf("3 4"); // 숫자 중간에 space, 숫자형 이외 문자열 있는 경우
		Integer.valueOf("3+4"); // compile거부
		
		
	}
}
