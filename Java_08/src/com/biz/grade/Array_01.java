package com.biz.grade;

import java.util.Random;

public class Array_01 {

	// 1.20학생의 국/영/수/음악 점수를 저장하기 위한 배열선언
	// 2. 각 배열에 51~100점의 점수 생성하여 저장
	// 3. 각 학생의 점수총점, 평균계산
	// 4. 과목별 점수총점, 평균계산
	// 5. 성적 리스트를 콘솔에 보여라
	public static void main(String[] args) {

		// 20개의 저장공간을 가진 변수 선언
		// integer 형 배열 20개씩 선언: 20개의 저장공간을 가진 변수
		// intKor라는 배열을 20개의 저장공간을 갖는 integer형 배열을 생성
		// 그러한 배열을 4개 만든다
		int[] intKorScore = new int[20];
		int[] intEngScore = new int[20];
		int[] intMathScore = new int[20];
		int[] intMusicScore = new int[20];

		// 임의 숫자를 생성하기 위한 도구 rnd
		// Random 클래스를 이용해서 rnd 라는 변수를 선언하고
		// new Random() 초기화 코드를 사용해서 사용준비
		Random rnd = new Random();

		// 이 명령코드가 실행될 때마다 임의 정수를 만들어낸다.
		rnd.nextInt();

		// 이 명령코드가 실행될 때마다 0부터 99까지 임의 정수를 만들어 낸다
		rnd.nextInt(100);

		// 위에서 생성한 4개의 배열에 각각 20개의 점수를 할당하기 위해
		// 배열의 개수만큼 반복문을 실행하고,
		// 반복문이 실행되면서 만들어지는 i변수의 값을 각 배열의 index로
		// 주입하여 배열[0]~ 배열[99]까지의 저장공간에 값을 할당하기 위해
		// 시작하는 반복문코드
		// intKor[0] ~ intKor[19], intEng[0]~intEng[19].... 이러한 위치가
		// 지정된 변수에 임의 정수값을 생성하여 할당한다
		// 성적처리를 테스트하기 위한 임의 점수를 만들어서 배열에 저장하는 코드

		for (int i = 0; i < 20; i++) {
			intKorScore[i] = rnd.nextInt(50) + 51;
			intEngScore[i] = rnd.nextInt(50) + 51;
			intMathScore[i] = rnd.nextInt(50) + 51;
			intMusicScore[i] = rnd.nextInt(50) + 51;
		}

		// 과목별 총점을 계산하여 보관할 변수를 선언
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;

		for (int i = 0; i < 20; i++) {
			intKorSum += intKorScore[i];
			intEngSum += intEngScore[i];
			intMathSum += intMathScore[i];
			intMusicSum += intMusicScore[i];
		}

		// 학생들의 과목별 총점을 계산하여 저장할 배열을 또 20개 선언
		int[] intStSum = new int[20];
		for (int i = 0; i < 20; i++) {

			// 총점배열에 학생들의 성적총점을 계산하여 저장
			intStSum[i] = intKorScore[i];
			intStSum[i] += intEngScore[i];
			intStSum[i] += intMathScore[i];
			intStSum[i] += intMusicScore[i];
		}
		System.out.println("=========================================");
		System.out.println("국어\t\t영어\t\t수학\t\t음악\t총점\t평균");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < 20; i++) {
			System.out.printf("%d\t\t%d\t\t%d\t\t%d\t%d\t%d\n",
					intKorScore[i],
					intEngScore[i], 
					intMathScore[i],
					intMusicScore[i], 
					intStSum[i],
					intStSum[i]/4);
		}
		// ==============================================
		// 국어 영어 수학 음악 총점
		// ----------------------------------------------
		// intKor[0] + intEng[0] + intMath[0] + intMusic[0] = intStsum[0]
		{
			System.out.println("과목별 점수 총점");
			System.out.println("국어:" + intKorSum);
			System.out.println("영어:" + intEngSum);
			System.out.println("수학:" + intMathSum);
			System.out.println("음악:" + intMusicSum);

			System.out.println("===================");
			System.out.println("과목별 점수 총점의 평균");
			System.out.println("국어:" + intKorSum / 20);
			System.out.println("영어:" + intEngSum / 20);
			System.out.println("수학:" + intMathSum / 20);
			System.out.println("음악:" + intMusicSum / 20);
		}

	}
}