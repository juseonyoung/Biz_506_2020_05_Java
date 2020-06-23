package com.callor.hello;

import java.util.Random;

public class Var_10 {

	//가. 3과목의 점수를 저장할 intKor, intEng, intMath 정수형 변수선언
	//나. Random 클래스를 이용하여 51~100범위 중의 임의의 정수를 각각 생성하여 과목 변수에 저장
	//다. 3과목의 총점과 평균을 계산하여 console에 출력하시오.
	
	public static void main(String[] args) {
		
		int intKor=0;
		int intEng=0;
		int intMath=0;
		
		Random rnd = new Random();
		
		intKor = rnd.nextInt(50)+51;
		intEng = rnd.nextInt(50)+51;
		intMath = rnd.nextInt(50)+51;
		
		//총점
		int Sum=0;
		Sum=intKor+intEng+intMath;
		
		//평균
		int Avg=0;
		Avg=Sum/3;
		
		System.out.println(Sum+"은 총점");
		System.out.println(Avg+"은 평균");
	}
}
