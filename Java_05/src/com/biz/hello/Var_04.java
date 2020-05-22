package com.biz.hello;

public class Var_04 {

	public static void main(String[] args) {
		
		int sum =0;
		int num = 7;
		
		sum = sum + num; // num:0
		sum = sum + ++num; // num:1
		sum = sum + ++num; // num:1
		sum = sum + ++num; // num:1
		sum = sum + ++num; // num:1
		sum = sum + ++num; // num:1
		sum = sum + ++num; // num:1
		sum = sum + ++num; // num:1
		sum = sum + ++num; // num:1
		
		System.out.printf("7부터 %d까지 덧셈 : %d\n",num,sum);
		
		
		
	}
}
