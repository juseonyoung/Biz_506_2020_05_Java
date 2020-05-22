package com.biz.hello;

import java.util.Random;

public class Var_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int i =50;
		int num1 = rnd.nextInt(i)+i;
		int num2 = rnd.nextInt(i)+i;
	
		System.out.println(num1+num2);
		
				
	}
}
