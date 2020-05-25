package com.biz.hello;

public class Var_18 {

	public static void main(String[] args) {
		
		int intKor =87;
		int intEng =77;
		int intMath=67;
		
		int intSum= intKor+intEng+intMath;
		// 평균을 실수형 변수로 선언하여 소수점 이하로 표현하고자 한다
		// 소수점 이하 값이 표현되기는 하나 실제 정확한 계산이 되지않는다
		// 그 이유는 intSum이 정수이기 때문에 정수/정수를 계산하고
		// 임의로 float형으로 변환하기 때문에 오차가 발생한다

		// 따라서 결과를 실수형으로 표현하려면 계산전에 점수를
		// 실수형으로 강제 형변환 해주어야 한다
		
		float fAvg = ((float)intSum /3);

		System.out.println("총점:"+intSum);
		System.out.println("평균:"+fAvg);
		
		
	}
}
