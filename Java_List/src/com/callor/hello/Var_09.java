package com.callor.hello;

public class Var_09 {

	// 소수인 정수 모두 더하기
	
	public static void main(String[] args) {
		
		int sum=0; //소수들의 합 담기
		for(int i=2; i<=100; i++) {
			
			int j=0;
			for( j=2; j<i; j++) {
				
				if(i%j==0) {
					break;
				}
			}
			
			if(i==j) {
				System.out.println(i+"는 소수");
			}
			sum+=i; // 일단 값을 여기에 담아
			
		}
		System.out.printf("%d는 소수들의 합",sum);
		
			
		
	}
}
