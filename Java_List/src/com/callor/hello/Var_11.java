package com.callor.hello;

import java.util.Random;

public class Var_11 {

	//가. 3과목의 점수를 저장할 floatKor, floatEng, floatMath 실수형 변수선언
	//나. Random 클래스를 이용하여 51~100범위 중의 임의의 정수를 각각 생성하여 과목 변수에 저장
	//다. 3과목의 총점과 평균을 계산하여 console에 출력하시오.
	
	public static void main(String[] args) {
		
		float floatKor=0;
		float floatEng=0;
		float floatMath=0;
		
		Random rnd = new Random();
		
		floatKor = rnd.nextInt(50)+51;
		floatEng = rnd.nextInt(50)+51;
		floatMath = rnd.nextInt(50)+51;
		
		//총점
		float Sum=0; //실수를 담을 총점도 float로 해야한다
		Sum=floatKor+floatEng+floatMath;
		
		//평균
		float Avg=0;
		Avg=Sum/3;
		
		System.out.println(Sum+"은 총점");
		System.out.println(Avg+"은 평균");
	}
}
