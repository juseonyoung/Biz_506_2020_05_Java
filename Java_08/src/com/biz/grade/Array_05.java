package com.biz.grade;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		// 100개의 배열을 만들고 1~100까지 임의의 수를 배열요소에 저장
		// 100개의 배열을 콘솔에 표시하되
		// 한줄에 5개씩 출력하라
		int[] num = new int[100];
		Random rnd = new Random();

		// 10개의 배열에 값을 저장
		for (int i = 0; i < 100; i++) {
			num[i] = rnd.nextInt(100) + 1;
		}
		for (int i = 0; i < 100; i++) {

			System.out.printf("%d \t ", num[i]);
			if ((i + 1) % 5 == 0) {
				System.out.println();

			}

		}

	}

}
