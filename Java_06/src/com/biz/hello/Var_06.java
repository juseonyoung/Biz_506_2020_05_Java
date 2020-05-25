package com.biz.hello;

import java.util.Random;

public class Var_06 {

	public static void main(String[] args) {

		// 2부터 100까지 반복하는 코드
		int index = 0;
		for (int i = 2; i <= 100; i++) {

			int j = 2;
			// 2부터 i-1까지 반복되는 코드
			for (j = 2; j < i; i++) {
				if (i % j == 0) {
					break;
				}

			}
			if (i == j) {
				System.out.println(i + "는 소수");
			}
		}
	}
}