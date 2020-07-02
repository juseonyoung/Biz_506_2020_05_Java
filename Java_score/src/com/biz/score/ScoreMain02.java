package com.biz.score;

import com.biz.score.service.ScoreService02;

public class ScoreMain02 {

	// 3번
	public static void main(String[] args) {
		
		ScoreService02 scoreservice = new ScoreService02();
		
		while(1==1) {
			if(!scoreservice.inputScore()) {
				break;
			}
		}
		System.out.println("입력완료");
		scoreservice.scoreList();
	}
}
