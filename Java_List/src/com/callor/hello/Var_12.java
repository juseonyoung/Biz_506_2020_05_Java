package com.callor.hello;

public class Var_12 {

	//가. 1부터 100까지의 정수 중 짝수는 몇 개나 될까요. Console에 출력하시오.
	//나. 2부터 100까지의 정수 중 3의 배수는 몇 개나 될까요. Console에 출력하시오.
	
	public static void main(String[] args) {
		
		int sum=0;
		int count=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sum+=i; // 짝수의 수를 더할 동안
				count+=1; //1씩 카운트 한다
				
			}
		}
		System.out.println(count);
		
		
		int Sum=0;
		int Count=0;
		for(int j=2; j<=100; j++) {
			if(j%3==0) {
				Sum+=j;
				Count+=1;
				
				
			}
		}
		System.out.println(Count+"는 3의 배수의 개수");
	}
}
