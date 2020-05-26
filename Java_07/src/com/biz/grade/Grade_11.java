package com.biz.grade;

import java.util.Random;

public class Grade_11 {

	public static void main(String[] args) {

		int[] intnum = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			intnum[i] = rnd.nextInt(100) + 1;

			if (intnum[i] % 2 == 0) {
				System.out.println(intnum[i] + "는 짝수");

			}
			else {System.out.println(intnum[i]+"는 홀수");
			
			}

		}
		// intnum 배열에 저장된 정수가 짝수인지 판별하여 콘솔에 나타내라
	}
}
