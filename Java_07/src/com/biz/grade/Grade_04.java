package com.biz.grade;

import java.util.Random;

public class Grade_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		float floatKor = rnd.nextInt(50) + 51;
		float floatEng = rnd.nextInt(50) + 51;
		float floatMath = rnd.nextInt(50) + 51;

		float floatSum = floatKor;
		floatSum += floatEng;
		floatSum += floatMath;

		System.out.println("총점:" + floatSum);

		float floatAvg = floatSum / 3;
		System.out.println("평균:" + floatAvg);

	}
}
