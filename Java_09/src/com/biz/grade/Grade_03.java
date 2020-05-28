package com.biz.grade;

import java.util.Random;

public class Grade_03 {

	public static void main(String[] args) {

		int num1 = 0;
		Random rnd = new Random();

		num1 = rnd.nextInt();

		int num2 = 0;
		num2 = num1 * 55;

		System.out.println(num2);
	}
}
