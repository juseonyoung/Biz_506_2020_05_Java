package com.biz.hello;

import java.util.Random;

public class Var_13 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int sum =0;
		for(int i=0 ; i <100; i++) {
			int num = rnd.nextInt(100) + 1;
			sum += num;
			//num는 소멸되지만 for문 내에 임시 저장되어 있던
			//num의 합이 결과로 도출된다
			//sum 변수는 for문이 시작되기 전에 선언되었기 때문에
			//for 반복문 내에서 sum += num명령으로 만들어진
			//sum 변수의 값은 그대로 유지된다
		}
		
		System.out.println("100개의 임의수 합계:"+sum);
	}
}
