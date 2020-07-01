package com.biz.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreService01 {


	// 필드변수 정의
	private List<ScoreVO> scoreList;
	
	private Scanner scan = new Scanner(System.in);
	
	// 초기화
	public ScoreService01() {
	
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	public boolean inputScore() {
		System.out.println("학번 >>");
		int stNum = scan.nextInt();
		
		System.out.println("국어 >>");
		int intKor = scan.nextInt();
		
		System.out.println("영어>>");
		int intEng = scan.nextInt();
		
		System.out.println("수학>>");
		int intMath = scan.nextInt();
		
		ScoreVO scorevo = new ScoreVO();
		scorevo.setStNum(20122330);
		scorevo.setIntKor(100);
		scorevo.setIntEng(90);
		scorevo.setIntMath(95);
		
		scoreList.add(scorevo);
		return true;
	}
	
	// 성적리스트 출력
	public void scoreList() {
		System.out.println("====================================");
		System.out.println("성적리스트");
		System.out.println("------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		
		int ScoreSize = scoreList.size();

		// 사이즈 개수만큼 반복문 수행
		for (int i = 0; i < ScoreSize; i++) {
		ScoreVO sv = scoreList.get(i);
		System.out.println(sv.getStNum());

		
	}


}
}
