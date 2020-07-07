package com.biz.student.domain;

import com.biz.student.service.ScoreService;
import com.biz.student.service.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV1();
		
		sService.inputScore();
		sService.inputStudent();
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
			
			
		
	}
}
