package com.biz.score.exec;
// 선생님 화면
import java.util.Random;

import com.biz.score.service.ScoreServiceV3;
import com.biz.score.vo.ScoreVO;

public class ScoreEx_02 {
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
		ScoreServiceV3 scorelist = new ScoreServiceV3();
		
		scorelist.setScoreList(scores); //ScoreServiceV2에 선언되어 있는
		//ScoreVO[] scores는 선언만 되고 초기화 등이 전혀 이루어지지 않은 상태이다
		// 때문에 scores 인스턴스 배열이 초기화 되거나 값이 저장되지 않으면
		// 이후에 호출되는 method에서 NullPointerException이 발생하고
		// 코드가 진행되지 않는다.
		// scorelist.setScoreList(scores); ->초기화,생성코드 반드시 필요
		
 		scorelist.scoreSum(); //sum을 먼저 구하고
		scorelist.scoreAvg();
		scorelist.scorelist(); // 리스트 마지막에 출력
		
		// ScoreServiceV2 에서는 scores배열을 주입하는 method
		// setScore() 라고 별도로 작성해 두었는데 코드를 사용하기 위해 작성을
		// 하는 과정에서 setScore()를 먼저 호출해서 scores를 전달해야 하는 것을
		// 자주 잊을 수 있다
		// 그리하여 nullpointexception이 발생하는 경우가 많다
		
		// 그래서 ScoreServiceV3에서는 성적처리 하는 과정에서 반드시 호출할 수
		// 밖에 없는 메서드들 중에 호출되는 순서로 보아 항상 제일 먼저 호출할 것으로 
		// 생각되는 scoreSum() method에 매개변수를 전달하는 역할을 수행하도록
		// 코드를 변경했다.
		
		ScoreServiceV3 sService2 = new ScoreServiceV3();
		sService2.scoreSum();
		sService2.scoreAvg();
		sService2.scorelist();
		
	
	}
}
