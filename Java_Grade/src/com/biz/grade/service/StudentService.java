package com.biz.grade.service;

public interface StudentService {

	//학생정보 처리
	
	public boolean inputStudent(); //아까는 파일에 담은거
	//쪼개서 불러오는것 이게 입력 
	public void studentList();
	public void savestudentFile();
	public void loadstudentFile();
	
	
}
