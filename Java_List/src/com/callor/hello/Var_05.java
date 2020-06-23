package com.callor.hello;

import java.util.Random;

public class Var_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num1=rnd.nextInt(100)+1;
		int num2=rnd.nextInt(100)+1;
		
		
		int numP=num1+num2;
		int numM=num1-num2;
		int numD=num1/num2;
		int numT=num1*num2;
		
		if(numP%2==0) {
			System.out.println(numP+"이므로 덧셈결과는 짝수이다");
		}
		
		if(numM%2==0) {
			System.out.println(numM+"이므로 뺄셈결과는 짝수이다");
		}
		
		if(numD%2==0) {
			System.out.println(numD+"이므로 나눗셈결과는 짝수이다");
		}
		
		if(numT%2==0) {
			System.out.println(numT+"이므로 곱셈결과는 짝수이다");
		}
		
	}
}
