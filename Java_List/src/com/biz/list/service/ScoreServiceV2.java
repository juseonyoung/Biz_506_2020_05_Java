package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	// List<ScoreVO>형으로 필드변수 선언
	private List<ScoreVO> scores;

	// 초기화
	public void scoreList(List<ScoreVO> scores) {
		this.scores = scores;
	}

	// 총점 계산
	public void stSum() {
		int scoreSize = scores.size();
		// 사이즈 값이 얼마인지 모름
		
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			// sVO라는 새로운 인스턴스 만들어 줌

			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();

			sVO.setStSum(sum);
		}
	}

	// 평균계산
	public void stAvg() {
		int scoreSize = scores.size();
		
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			int sum = sVO.getStSum();
			
			sVO.setStAvg(sum / 3);
		}
	}

	// 성적리스트 출력
	public void scoreList() {

		System.out.println("성적리스트");
		System.out.println("---------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int sumSum = 0;
		int avgSum = 0;

		int scoreSize = scores.size();
		for (int i = 0; i < scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			korSum += sVO.getKor();
			engSum += sVO.getEng();
			mathSum += sVO.getMath();
			sumSum += sVO.getStSum();
			avgSum += sVO.getStAvg();
		}

		for (int i = 0; i < scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t\n", 
					sVO.getNum(), sVO.getKor(), 
					sVO.getEng(), sVO.getMath(),
					sVO.getStSum(), sVO.getStAvg());
		}
		
		System.out.println("---------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t\n",
				"총점",
				korSum,
				engSum,
				mathSum,
				sumSum, 
				avgSum);
		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t\n",
				"평균", 
				korSum / scoreSize, 
				engSum / scoreSize,
				mathSum / scoreSize, 
				sumSum / scoreSize, 
				avgSum / scoreSize);
	}
}
