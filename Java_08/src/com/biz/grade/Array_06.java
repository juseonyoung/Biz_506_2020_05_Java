package com.biz.grade;

import java.util.Random;

public class Array_06 {

	public static void main(String[] args) {

		
		int[] num = new int[100];
		// Random 클래스를 사용해서
		//     rnd객체, rnd인스터스를 선언
		//           rnd인스터스를 사용할 수 있도록 초기화 하는코드
		//           Random클래스의 생성자
		Random rnd = new Random();

		// (rnd) 인스턴스, 객체(object) : random 클래스로 만든 rnd변수
		// .nextInt(100) : Random클래스 method라고 부른다.
		// rnd 객체의 nextInt() 메서드를 실행하라 라고 한다.
		// rnd 객체의 nextInt() 메서드를 호출하라 라고도 한다.
		rnd.nextInt(100);
		
		String strN = "홍길동"; // 문자열변수 strN
		String strM = new String(); // strM인스턴스, strM객체라고 부른다.
		
		for (int i = 0; i < 100; i++) {
			
			// rnd 객체의 nextInt() 메서드를 실행하여 결과값을
			// 배열 intNum의 i번째 위치에 저장하라
			num[i] = rnd.nextInt(100) + 1;
		}
		
		// 배열에 저장된 요소들 중 순서대로 5개씩 더하라
		int intSum=0;
		for (int i = 0; i < 100; i++) {

			System.out.printf("%d \t ", num[i]);
			
			intSum += num[i];
			if ((i + 1) % 5 == 0) {
				
				System.out.println(intSum);
				intSum=0;
			}

		}

	}

}
