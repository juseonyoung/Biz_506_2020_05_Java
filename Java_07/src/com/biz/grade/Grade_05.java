package com.biz.grade;

import java.util.Random;

public class Grade_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int intKor1 = rnd.nextInt(50) + 51;
		int intKor2 = rnd.nextInt(50) + 51;
		int intKor3 = rnd.nextInt(50) + 51;
		int intKor4 = rnd.nextInt(50) + 51;
		int intKor5 = rnd.nextInt(50) + 51;
		int intKor6 = rnd.nextInt(50) + 51;
		int intKor7 = rnd.nextInt(50) + 51;
		int intKor8 = rnd.nextInt(50) + 51;
		int intKor9 = rnd.nextInt(50) + 51;
		int intKor10 = rnd.nextInt(50) + 51;

		System.out.printf("학생1의 국어점수:%d\n", intKor1);
		System.out.printf("학생2의 국어점수:%d\n", intKor2);
		System.out.printf("학생3의 국어점수:%d\n", intKor3);
		System.out.printf("학생4의 국어점수:%d\n", intKor4);
		System.out.printf("학생5의 국어점수:%d\n", intKor5);
		System.out.printf("학생6의 국어점수:%d\n", intKor6);
		System.out.printf("학생7의 국어점수:%d\n", intKor7);
		System.out.printf("학생8의 국어점수:%d\n", intKor8);
		System.out.printf("학생9의 국어점수:%d\n", intKor9);
		System.out.printf("학생10의 국어점수:%d\n", intKor10);

		int intKorSum = intKor1;
		intKorSum += intKor2;
		intKorSum += intKor3;
		intKorSum += intKor4;
		intKorSum += intKor5;
		intKorSum += intKor6;
		intKorSum += intKor7;
		intKorSum += intKor8;
		intKorSum += intKor9;
		intKorSum += intKor10;

		int intKorAvg =intKorSum/10;
		System.out.println();
		System.out.println("총점:" + intKorSum);
		System.out.println("평균:" + intKorAvg);
	}
}
