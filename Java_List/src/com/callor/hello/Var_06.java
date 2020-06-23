package com.callor.hello;

public class Var_06 {

	public static void main(String[] args) {

		// 1부터 100까지 3의 배수를 출력하고 합을 구해라
		
		int numSum=0;
		for(int i=1; i<101; i++) {
			if(i%3==0) {
				numSum+=i;
			}
			
		}
		System.out.println(numSum+"은 3의 배수의 합");

	}
}
