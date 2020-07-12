package com.callor.score.service;

import com.callor.score.domain.ScoreVO;

public interface ScoreService {

	
	public boolean inputScore();
	public void calcSum();
	public void calcAvg();
	public void scoreList(); //출력
	public void scoreSave(); //성적정보 저장
	
	public void loadscoreFile();
	
}
