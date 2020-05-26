package com.biz.grade;

import java.util.Random;

public class Grade_12 {

	public static void main(String[] args) {

		int[] intnum = new int[10];

		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			intnum[i] = rnd.nextInt(50) + 51;
		}

		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			if (intnum[i] % 2 == 0) {
				intSum += intnum[i];

			}
		}
		System.out.println(intSum + "는 짝수들의 합");

	}
}
