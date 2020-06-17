package com.callor.hello;

public class VarGuGu_03 {

	// 가. 정수형 변수 num1, num2를 선언하고 num1에 2, num2에 0을 저장
	// 나. 두 변수를 사용하여 구구단 2, 3, 4, 5단을 연속으로 Console에 출력하시오.

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 0;
		int j = 0;

		// 2단
		for (int i = 2; i < 10; i++) {
			num2++;
			System.out.printf("%d단 구구단\n", i);
		
			
			// 위에 포문 2단을 몇번 반복하냐 통째로??
			for(j=1; j<10; j++) {
				
				System.out.printf("%d * %d =%d\n", i,j,i*j);
				
			}

		}

	}

}
