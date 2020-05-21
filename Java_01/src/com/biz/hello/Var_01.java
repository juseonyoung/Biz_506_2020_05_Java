package com.biz.hello;

// 변수, varriable, value

public class Var_01 {

	public static void main(String[] args) {
		
		// 넘버2라는 정수를 만들 수 있는 기억장치를 만들고 40을 저장하라(변수)
		// 기억장치(메모리) 어딘가에 정수(int)값을 보관할 수 있는 곳을 만들고
		// 거기에 num1이라는 이름표를 붙여라(찾아 갈 수 있도록)
		// 그리고 30을 보관하라
		// 변수는 변하는 수가 아니라 정해진 공간에 정해진 수
		// 기억장치를 2개만 소모한다
		
		int num1 = 30;
		
		// 정수형 변수 num2를 선언하고 정수40을 할당하라
		// int : 정수형 변수를 선언하는 키워드(명령어)
		// num2 : 변수명, 기억장소에 붙여진 이름표
		// = : 할당연산자, 오른쪽 값을 왼쪽의 변수에 저장하라
		// 40 : 실제 변수에 보관될 값
		int num2 = 40;
		System.out.println(num1 +num2);
		System.out.println(num2 +num1);
		System.out.println(num1 *num2);
		System.out.println(num2 /num1);	
		
	}
}
