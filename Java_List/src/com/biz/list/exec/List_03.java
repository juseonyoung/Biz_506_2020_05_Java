package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_03 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();

		Random rnd = new Random();

		// 난수 100개 생성하여 리스트에 추가
		for (int i = 0; i < 100; i++) {
			int num1 = rnd.nextInt(100) + 1; // num1을 선언

			intList.add(num1);
		}

		// 추가된 100개 정수중 짝수들만 출력
		// 개수 구하려면 int count=0; 선언하고 count++
		for (int i = 0; i < 100; i++) {
			// 여기서 sysout 하면 값이 먼저 다 출력되버려서
			// if문을 먼저 써주기
			int num2 = intList.get(i); // 저장된 값을 num2에 복사
			if (num2 % 2 == 0) {
				System.out.println(num2);

			}
		}
		int count = 0;
		// 짝수들의 개수출력하고 한줄에 5개씩
		for (int i = 0; i < 100; i++) {
			int num = intList.get(i);
			if (num % 2 == 0) { // if안의 if 문이므로 짝수 5개만!! 홀수 만나면 명령무시
				System.out.printf("%d\t", num);
				count++; // 여기까지 개수 구함
				if (count % 5 == 0) {
					System.out.println();
					// 다시 for문 올라가서 홀수를 만나면 if문 무시하고 내려가서
					// 짝수를 만날 때까지 엔터침
				}
			}
		}
		System.out.println("\n짝수의 개수:"+count);
	}

}
