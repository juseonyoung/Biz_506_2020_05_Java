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
	
	public boolean inputAddr() {

		System.out.println("학번(중단:END) >> ");
		String stNum = scan.nextLine();

		System.out.println("입력값:" +stNum);
		// 만약 이름 입력할 때 문자열 END 를 입력하면 더이상 진행하지 말고
		// false를 return하고 method를 중단하라
		//if(strName == "END") { //문자열은 절대 ==로 비교 안됨! 별도의 method 통해 비교
			// 왜냐하면 1000번 중에 한번은 false가 날수도 있다.
		if(stNum.equals("END")) {
			return false;
		}
		
		
		System.out.println("국어 >>");
		String intKor = scan.nextLine();

		System.out.println("영어 >>");
		String intEng= scan.nextLine();

		System.out.println("수학 >>");
		String intMath = scan.nextLine();

		int intNum = 0;
		try {
			intNum = Integer.valueOf(stNum);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("학번은 숫자만 가능합니다");
			System.out.println("학번 입력이 잘못되어 0으로 임시 저장합ㄴㅣ다.");
		}
		
		int intkor = 0;
		try {
			intkor= Integer.valueOf(intKor);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("국어 점수 숫자만 가능합니다");
			System.out.println("국어 점수 입력이 잘못되어 0으로 임시 저장합ㄴㅣ다.");
		}
		
		int inteng = 0;
		try {
			inteng = Integer.valueOf(intEng);
		} catch (Exception e) {
			//// TODO: handle exception
			System.out.println("영어 점수 숫자만 가능합니다");
			System.out.println("영어 점수 입력이 잘못되어 0으로 임시 저장합ㄴㅣ다.");
		}
		
		int intmath= 0;
		try {
			intmath = Integer.valueOf(intMath);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("수학점수 숫자만 가능합니다");
			System.out.println("수학점수 입력이 잘못되어 0으로 임시 저장합ㄴㅣ다.");
		}

		
		ScoreVO scorevo= new ScoreVO();
		scorevo.setStNum(stNum);
		scorevo.setIntKor(intkor);
		scorevo.setIntEng(inteng);
		scorevo.setIntMath(intmath);
	
		
	
		scoreList.add(scorevo);
		return true;
	}
	
	public void addrList() {

		System.out.println("=====================================");
		System.out.println("주소록");
		System.out.println("=====================================");
		System.out.println("이름\t전화번호\t주소\t나이\t관계");
		System.out.println("-------------------------------------");

		// i< 5는 5명의 주소록을 표시할 때는 문제가 없으나
		// 주소록 데이터의 개수가 변경되면 문제를 일으킨다
		// addList의 개수를 별도의 변수에 담고
		int scoreSize = scoreList.size();

		// 사이즈 개수만큼 반복문 수행
		for (int i = 0; i < scoreSize; i++) {

			ScoreVO vo = scoreList.get(i);
			System.out.println(vo.getStNum()+ "\t");
			System.out.println(vo.getIntKor()+ "\t");
			System.out.println(vo.getIntEng()+ "\t");
			System.out.println(vo.getIntMath()+ "\t");
			System.out.println(vo.getIntSum()+ "\t");
			System.out.println(vo.getIntAvg()+ "\n");
			

		}


}
}
