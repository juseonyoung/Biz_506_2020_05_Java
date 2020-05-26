package com.biz.grade;

import java.util.Random;

public class Grade_13 {

	public static void main(String[] args) {

		int[] intnum = new int[100];

		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			intnum[i] = random.nextInt(100) + 1;
		}

		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			if (intnum[i] % 3 == 0 || intnum[i] % 5 == 0) {
				intSum += intnum[i];
			}
		}

		System.out.println("3 또는 5의 배수의합:" + intSum);
	}
}
