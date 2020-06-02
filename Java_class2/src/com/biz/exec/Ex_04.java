package com.biz.exec;

import java.util.Random;

import com.biz.model.ScoreVO;
import com.biz.service.ScoreServiceV1;

public class Ex_04 {

	public static void main(String[] args) {
		
		ScoreVO[] score = new ScoreVO[20];
		
		for(int i=0; i<score.length;i++) {
			score[i]=new ScoreVO(); //초기화
		}
		Random rnd = new Random();
		
		
		for(int i=0; i<score.length; i++) {
			score[i].setKor(rnd.nextInt(50+51));
			score[i].setEng(rnd.nextInt(50+51));
			score[i].setMath(rnd.nextInt(50+51));
			score[i].setName("0"+(i+1));
			// ""+(i+1)해주면 문자열로 변경
		}
		
		ScoreServiceV1 scoreList = new ScoreServiceV1();
		scoreList.scoreList(score);
		
		
		
		
	}
}
