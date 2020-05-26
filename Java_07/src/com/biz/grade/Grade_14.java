package com.biz.grade;

import java.util.Random;

public class Grade_14 {

	public static void main(String[] args) {

		int[] intnums = new int[6];
		Random rnd = new Random();

		for (int i = 0; i < 6; i++) {

			int intnum = rnd.nextInt(45) + 1;
			int index = 0;
			for (index = 0; index < 6; index++) {
				if (intnums[index] == intnum) {
					break;
				}
			}
			if (index == 6) {

				intnums[i] = intnum;
			}
		}

		for (int i = 0; i < 6; i++) {
			System.out.println(intnums[i]);
		}
	}
}
