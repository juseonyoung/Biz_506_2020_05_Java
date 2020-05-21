package com.biz.hello;

public class VarBoolean_04 {
	
	public static void main(String[] args) {
	
		// boolean형 변수
		// 불린형 변수는 오로지 true, false중 한 가지 값만을 가지는 특별한 변수이다
		// boolean형 변수, 값
		// 혼자서 어떤 연산을 수행하기 보다는 다른 키워드와 조합하여 연산명령을 수행한다
		
		boolean bVar1 = false;
		boolean bVar2 = false;
		
		int num1 = 34;
		bVar1 = (num1 % 2) == 0; // num1가 even OR odd?
		
		System.out.println(++num1 + "는 짝수?" 
						+ ((num1 % 2) == 0));
		
		System.out.println(++num1 + "는 짝수?" 
				+ ((num1 % 2) == 0));

		System.out.println(++num1 + "는 짝수?" 
				+ ((num1 % 2) == 0));

		System.out.println(++num1 + "는 짝수?" 
				+ ((num1 % 2) == 0));

		System.out.println(++num1 + "는 짝수?" 
				+ ((num1 % 2) == 0));

		
		
	}
}
