package com.biz.hello;

public class Var_09 {

	public static void main(String[] args) {
		
		int sum = 0; //for문 밖에 변수 선언
		for(int i =0 ; i < 100 ; i++) {
			
			if(i % 3 ==0) {
				System.out.println(i + "3의 배수");
				sum += i;
			}
		}
		System.out.printf("3의 배수의 합 : %d\n", sum);
	}
}
