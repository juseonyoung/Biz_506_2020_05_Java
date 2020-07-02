package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

// 2번
public class ScoreService01 {

	// 성적을 입력받아서 scoreeList에 저장하고 성적리스트를 출력하는 곳

	// 성적 리스트 저장하기 위한 객체 선언!!

	List<ScoreVO> scoreList;

	// 키보드를 사용해서 값들을 입력받기 위해 scanner 객체 선언
	Scanner scan;

	// 필드변수에 scoreList, scan 선언한 객체를 사용할 수 있도록
	// 생성자(public..)에서 두 객체를 초기화(필수)
	// nullpointerException 발생하기 쉽다.

	public ScoreService01() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);

	}

	// 한 학생의 성적을 입력받아서 scoreList에 추가하는 method
	// 변경
	// 학생의 성적을 입력받는 과정에서 학번에 END라는 문자열을 입력하게 되면 성적
	// 입력 중단하도록 변경
	public boolean inputScore() {

		System.out.println("학번 (END: 입력종료)>>");
		String strNum = scan.nextLine();
		if (strNum.equals("END")) {
			return false;
		}

		System.out.println("국어>>");
		String strKor = scan.nextLine();

		int intKor = 0; // 예외처리 위해

		try {
			intKor = Integer.valueOf(strKor);
		} catch (Exception e) {
			System.out.println("국어 점수는 숫자만 가능!");

		}

		System.out.println("수학>>");
		String strMath = scan.nextLine();

		int intMath = 0; // 예외처리 위해

		try {
			intMath = Integer.valueOf(strMath);
		} catch (Exception e) {
			System.out.println("수학 점수는 숫자만 가능!");

		}
		
		System.out.println("영어>>");
		String strEng = scan.nextLine();

		int intEng= 0; // 예외처리 위해

		try {
			intEng = Integer.valueOf(strEng);
		} catch (Exception e) {
			System.out.println("영어 점수는 숫자만 가능!");

		}

		// 키보드에 입력받은 점수를 int형으로 변환하여 변수에 담겨서 온 상태
		// (여기까지 과정)
		// int형으로 변환된 점수를 ScoreVO에 일단 담기

		ScoreVO scorevo = new ScoreVO();
		scorevo.setNum(strNum);
		scorevo.setKor(intKor);
		scorevo.setEng(intEng);
		scorevo.setMath(intMath);
	
		// 총점계산
		int sum = scorevo.getKor();
		sum += scorevo.getEng();
		sum += scorevo.getMath();

		// 평균계산을 float형으로 소수점까지 계산하기 위해
		// 먼저 sum(총점)을 float형으로 변환하고 나눗셈을 수행해서 결과를 도출한다.
		float avg = sum / 3;

		scorevo.setSum(sum);
		scorevo.setAvg(avg);

		// 한 학생의 성적 입력받아 vo에 담기 완료

		// 한 학생의 성적을 list에 추가
		scoreList.add(scorevo);

		return true;
	} // inputScore 끝나는 곳

	public void scoreList() {
		System.out.println("====================================");
		System.out.println("성적리스트");
		System.out.println("====================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("====================================");

		// scoreList개수가 몇개인지 파악하여 변수에 저장
		int size = scoreList.size();
		for (int i = 0; i < size; i++) {
			// 리스트 에서 scoreVO를 추출하는 곳
			ScoreVO sVO = scoreList.get(i);
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getSum() + "\t");
			System.out.print(sVO.getAvg());

		}
		System.out.println("--------------------------------------");

	}

}
