package com.biz.grade;

public class Grade_07 {

	// 100명 학생의 국어점수를 임의로 만들어 변수에 담고
	// 총점과 평균을 구하시오
	public static void main(String[] args) {
	
		int intKor01 =0; //선언하고
		intKor01 =99; //저장
	
		int intKor02=0; 
		intKor02=77;
		
		int[] intKorScore = new int[100]; //정수 100개를 담을 수 있는 저장소
		intKorScore[0] =88; //0번 위치에 88 값을 저장해라
		intKorScore[88]=100;

		System.out.println(intKorScore[0]);
		System.out.println(intKorScore[88]); //88번 저장공간 값을 불러와라
		
		
		
	}
}
