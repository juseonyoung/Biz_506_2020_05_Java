package com.biz.score.exec;

import java.util.Random;

import com.biz.score.service.LineService;
import com.biz.score.service.ScoreServiceV1;
import com.biz.score.vo.ScoreVO;

public class ScoreEx_01 {
	//테스트 하기 위한 곳은 반드시 main 있어야
	public static void main(String[] args) {
		
		ScoreVO[] scores = new ScoreVO[10];
		
		//초기화
		for(int i=0; i<scores.length; i++) {
			scores[i]=new ScoreVO();
		}
		
		
		//각 과목에 점수 부여
		Random rnd = new Random();
		for(int i=0; i<scores.length; i++) {
			scores[i].setStrNum(""+(i+1)); //1번부터 일련번호
			scores[i].setIntKor(rnd.nextInt(50)+51);
			scores[i].setIntEng(rnd.nextInt(50)+51);
			scores[i].setIntMath(rnd.nextInt(50)+51);
			scores[i].setIntMusic(rnd.nextInt(50)+51);
		}
		
		//밑에 선언하기 전에 클래스 scoreserviceV1만들기
		ScoreServiceV1 scorelist = new ScoreServiceV1();
		scorelist.sum(scores); //sum을 먼저 구하고
		scorelist.scorelist(scores); // 리스트 마지막에 출력
	}
}
