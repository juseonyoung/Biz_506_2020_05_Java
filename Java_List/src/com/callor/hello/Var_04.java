package com.callor.hello;

import java.util.Random;

public class Var_04 {

	public static void main(String[] args) {
		
		int num2=0;
		
		Random rnd = new Random(); //random클래스 rnd객체 만들고 초기화
		
		num2= rnd.nextInt(100)+1;
		
		if(num2%3==0 || num2%5==0) {
			System.out.println(num2+"3의 배수 또는 5의 배수이다");
		}
		
		else {
			System.out.println(num2+"은 3의 배수도 5의배수도 아님");
		}
		}
}
