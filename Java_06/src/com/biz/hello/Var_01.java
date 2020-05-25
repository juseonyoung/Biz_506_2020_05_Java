package com.biz.hello;

import java.util.Random;

public class Var_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int num = rnd.nextInt(100) + 1;

		if (num % 3 == 0 || num % 5 == 0);
		
		System.out.println("3의 배수 또는 5의 배수:" + num);
	}
}
