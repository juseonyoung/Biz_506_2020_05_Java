package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

// interface(ScoreService)를 implements 하여 작성된 클래스는
// interface에 정의된 method 규칙을 그대로 준수하여 작성해야 할 의무가 있는 클래스다.
// 모양은 interface의 모양을 그대로 가지고 있으며 하는 일은 실제 클래스의
// method에 구현되어 있다.
public class ScoreServiceImplV1 implements ScoreService {

	/*
	 * 
	 * 인터페이스가 따라붙음 ScoreService 인터페이스 참조하겠다(메서드 혼동 막기위해 보통 리더가 만듦)
	 * 
	 * ScoreService** 클래스 정의 시 반드시 ScoreService interface를 참조 (implements) 하도록 규칙을
	 * 정해놓는다 scoreservice interface를 참조하는 클래스는 ScoreService interface에 디자인된 method를
	 * 모두 implement해서 작성되어야 하는 규칙이 작동하게 된다. 따라서 모든 method 의 이름이 통일되는 효과를 얻게된다.
	 * 
	 * 
	 * 
	 */
	// private 되어있던 필드변수를 protected로 변경했다
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	// 생성자 이용하여 초기화
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	public boolean inputScore() {
		// TODO Auto-generated method stub

		System.out.print("학번(END:입력종료) >>");
		String num = scan.nextLine();
		if (num.equals("END")) {

			return false;
		}

		System.out.print("국어 >>");
		String kor = scan.nextLine();

		int intKor = 0;
		try {
			intKor = Integer.valueOf(kor);
		} catch (Exception e) {
			System.out.println("숫자를 입력해 주세요!");
		}

		System.out.print("영어 >>");
		String eng = scan.nextLine();

		int intEng = 0;
		try {
			intEng = Integer.valueOf(eng);
		} catch (Exception e) {
			System.out.println("숫자를 입력해 주세요!");
		}

		System.out.print("수학 >>");
		String math = scan.nextLine();

		int intMath = 0;
		try {
			intMath = Integer.valueOf(math);
		} catch (Exception e) {
			System.out.println("숫자를 입력해 주세요!");
		}

		ScoreVO scorevo = new ScoreVO();
		scorevo.setNum(num);
		scorevo.setKor(intKor);
		scorevo.setEng(intEng);
		scorevo.setMath(intMath);

		scoreList.add(scorevo);
		return true;
	} // inputScore 끝나는 곳

	@Override
	public void calcSum() {
		// TODO Auto-generated method stub
		// 총점 계산 할 때도 size구해!!

		int size = scoreList.size();
		for (int i = 0; i < size; i++) {

			ScoreVO sVO = scoreList.get(i);

			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			/*
			 * sVO.setSum() method에 총점을 전달함으로 써 scoreList에 저장되어 있는 요소의 총점 변수에 값을 저장하는 효과 별도로
			 * 저장을 해주거나 하는 절차가 필요없다.
			 */
			sVO.setSum(sum);
		}
	}

	public void calcAvg() {
		// TODO Auto-generated method stub

		// 평균 계산
		// 사이즈 구해!!!!!!!!!!!
		int size = scoreList.size();
		for (int i = 0; i < size; i++) {

			ScoreVO sVO = scoreList.get(i);
			float avg = (float) sVO.getSum() / 3;

			sVO.setAvg(avg);
		}
	}

	public void scoreList() {
		// TODO Auto-generated method stub
		System.out.println("============================================");
		System.out.println("성적리스트");
		System.out.println("============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");

		int size = scoreList.size();
		for (int i = 0; i < size; i++) {
			ScoreVO sVO = scoreList.get(i);
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getSum() + "\t");
			System.out.print(sVO.getAvg());

		}
		System.out.println("-----------------------------------------");
	}

}
