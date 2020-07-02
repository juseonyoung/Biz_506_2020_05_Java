package com.biz.score;

import com.biz.score.service.ScoreService01;
public class ScoreMain {

	// 3번
	public static void main(String[] args) {
		
		ScoreService01 scoreservice = new ScoreService01();
		while(true) {
			if(!scoreservice.inputScore()) {
				break;
			}
		}
		System.out.println("입력완료");
		scoreservice.scoreList();
	}
}
