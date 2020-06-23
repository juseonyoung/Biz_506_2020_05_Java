package com.callor.hello;

import java.util.Random;

public class Var_03 {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		int num1 = random.nextInt();
		
		if(num1%2==0) {
			System.out.println(num1+"은 짝수이다");
		}
		
		else {
			System.out.println(num1+"은 홀수이다");
		}
	}
}
