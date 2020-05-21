package com.biz.hello;

public class Var_02 {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 0;
		
		System.out.println(num1+ "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1+ "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1+ "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1+ "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1+ "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1+ "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1+ "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1+ "x" + ++num2 + "=" + (num1*num2));
		System.out.println(num1+ "x" + ++num2 + "=" + (num1*num2));
		
		System.out.println("=========================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("=========================================");
		
		// num2가 9가 되어 있는 상태이므로 ++num2를 실행하면 num2값은 10이다
		// 그러므로 이후는 8*10부터 출력 되어 버린다.

		num2 =0; // 재설정, clear
		//num2에 어떠한 값이 있던지 상관없이 0으로 클리어한다
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		System.out.println();
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d",num1,++num2,(num1*num2));
		
		
		System.out.println("=========================================");
		num2 =0;
		System.out.printf("%d * %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d\n",num1,++num2,(num1*num2));
		System.out.printf("%d * %d = %d\n",num1,++num2,(num1*num2));
		
		
	}
}
