package com.biz.grade;

public class Array_03 {

	public static void main(String[] args) {

		// 1~100가지 수 중 짝수의 개수는 몇 개인가
		// 1~100가지 수 중 3의 배수의 개수는 몇 개인가
		int intCount = 0;
		int intSum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				intSum += i;
				intCount += 1;
			}
		}
		System.out.println("짝수의 합:" + intSum);
		System.out.println("짝수의 개수" + intCount);

		intSum =0;
		intCount =0;
		for(int i=1; i <=100; i++) {
			if(i%3==0) {
				intSum += i;
				intCount +=1;
				
			}
		}
		System.out.println("3의 배수의 합:"+intSum);
		System.out.println("3의 배수의 개수:"+intCount);
	}
}
