package com.biz.control;

public class For_07 {

	public static void main(String[] args) {

		// 1부터 100가지 숫자중 짝수만의 합
		// 짝수만의 합
		// sum += 짝수들
		// 1씩 증가되고 있는 num변수의 값이 짝수일 때만 sum에 저장

		int num1 = 0;
		int sum = 0;

		for (num1 = 0, sum = 0; num1 < 101; num1++)

		{
			if (num1 % 2 == 0) {
				sum += num1;
			}
			System.out.println("짝수의 합:" + sum);

		}

		for (num1 = 0, sum = 0; num1 < 101; num1 += 2) {
			sum += num1;

		}
		System.out.println("짝수의 합:" + sum);

		for (num1 = 0, sum = 0; num1 < 101; num1++) {
			if (num1 % 3 == 0) {
				sum += num1;

			}
		}
		System.out.println("3의 배수의 합 :" + num1);
	}
}