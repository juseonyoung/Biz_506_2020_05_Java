package com.list;

public class Var_01 {

	public static void main(String[] args) {

		//구구단
		
		int num1=2;
		int num2=0;
		int j=0;
		
		for(int i =2; i <6; i++) {
			
			System.out.printf("%d단 구구단\n", num1);
			num1++;
			
			for( j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
		}
	}
}
