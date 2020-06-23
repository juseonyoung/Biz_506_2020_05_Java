package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {

	private List<ScoreVO> scores;
	
	public void scoreList(List<ScoreVO> scores) {
		this.scores=scores;
	}
	
	//총점 계산
	public void stSum() {
		int scoreSize = scores.size();
		// 사이즈 값이 얼마인지 모름
		for( int i=0; i<scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			
			int sum = sVO.getKor();
			sum +=sVO.getEng();
			sum +=sVO.getMath();

			sVO.setStSum(sum);
		}
	}

	//평균계산
	public void stAvg() {
		int scoreSize = scores.size();
		for( int i=0; i<scoreSize; i++) {
			ScoreVO sVO = scores.get(i);
			int sum = sVO.getStSum();
			sVO.setStAvg(sum/3);
		}
	}
	
	public void scoreList() {
		
		System.out.println("성적리스트");
		
	}
}

