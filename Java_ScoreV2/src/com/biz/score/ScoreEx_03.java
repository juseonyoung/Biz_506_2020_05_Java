package com.biz.score;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV1();
		// new 다음에 어떤 클래스 오느냐에 따라 메서드 호출이 달라짐
		// 중요!!
		while(true) {
			if(!sService.inputScore()) {
				break;
			}
		}
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
	}
}
