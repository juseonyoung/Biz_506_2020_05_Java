package com.callor.hello;

import java.util.Random;

public class Var_07 {

	//가. 임의의 이름으로 정수형 변수 선언
	//나, Random 클래스를 사용하여 100~1000 사이에 있는 임의의 정수를 생성하여 저장
    //다. 변수에 저장된 정숫값에는 10%의 세금이 포함되어 있습니다.
	//라. 변수에 저장된 정숫값에서 세금 10%를 제외한 값을 구하여 Console에 출력하시오.
	//예) 정숫값이 330 이면 세금 30을 제외한 300.
	//정숫값이 373 이면 세금 34를 제외한 339, 소수점 이하 반올림하여 연산
	
	
	// 이게 맞나..??
	public static void main(String[] args) {
		
		int num=0;
		
		Random rnd = new Random();
		
		num=rnd.nextInt(901)+100;
		
		// 세금 10%를 제외한 값
		System.out.println(num*0.9);
	}
}
