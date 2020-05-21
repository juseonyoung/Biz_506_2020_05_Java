package com.biz.control;

import java.util.Random;

public class If_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100)+1;
		
		if(num1%5==0) 
		{System.out.printf("%d는 5의 배수 \n",num1);}
		
		if(num1%4==0) 
		{System.out.printf("%d는 4의 배수 \n",num1);}
		
		if(num1%3==0) 
		{System.out.printf("%d는 3의 배수 \n",num1);}
		
		if(num1%2==0) 
		{System.out.printf("%d는 2의 배수 \n",num1);}
		
		if(num1%5 != 0 && num1 %4 !=0 && num1 %3 !=0 && num1%2 !=0)
		{System.out.printf("%d는 5,4,3,2의 배수가 아니다");}
		
		// if(조건1) {}
		// if(조건2) {}
		// if(조건1 ==true && 조건2 ==true) {}
		// 여러가지 조건중 조건이 true인 모든 경우를 검사하기 위한 코드
		// 단 여러조건중에 1가지 조건이 true라도 나머지 조건을 모두 검사해야한다
		// 필요한 경우 사용하기도 하며, 여러 조건중 1가지만 검사하고자 한다면
		// 비효율적인 코드가 될수도 있다.
		
	}
}
