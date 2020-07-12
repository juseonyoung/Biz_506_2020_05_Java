package com.callor.score.exec;

import com.callor.score.domain.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {

		ScoreService sService = new ScoreServiceImplV1();

		while (true) {
			sService.inputScore();
			sService.calcSum();
			sService.calcAvg();
			sService.scoreList();
			sService.scoreSave();
			sService.loadscoreFile();
		}
	}
}
