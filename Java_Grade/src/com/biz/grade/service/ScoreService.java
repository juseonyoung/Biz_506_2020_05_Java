package com.biz.grade.service;

public interface ScoreService {

	
	// inputStudent() student.txt파일읽어서 리스트작성
	// inputScore() score.txt 파일 읽어서 리스트작성
	
	// 총점,평균 메서드
	// 학생별 과목 총점..평균 리스트 출력
	
	public boolean inputScore();
	public void calcSum();
	public void calcAvg();
	public void loadScoreFile();
	public void saveScoreFile();
	public void scoreList();
}
