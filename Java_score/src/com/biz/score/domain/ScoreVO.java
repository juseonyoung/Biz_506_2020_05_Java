package com.biz.score.domain;

public class ScoreVO {
//1번
	/*
	 *  성적처리 과정에서 한 학생의 성적을 담는 object 변수
	 *  value obect 클래스 라고 한다.
	 *  VO, DTO 클래스들을 domain 클래스 라고 한다.
	 *  
	 *  필드변수를 private로 설정하고
	 *  필드변수에 접근(값을 저장 또는 읽기) 하기 위해 getter, setter를 선언
	 *  
	 *  이러한 방식으로 클래스를 정의하는 것을 정보은닉, 캡슐화 
	 *  
	 */
	private String num;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	
	// 정보의 유효성 검사
	// 국어필드에 저장하려고 하는 값이 유효한 값인가를 검사 
	// 성적은 0~100 까지가 기본값인데 만약 성적을 0미만, 100 초과된
	// 값을 저장하려고 하면 거부하도록 코드 변경....
	// 거부하도록 setKor() 변경
	public boolean setKor(int kor) {
		
		if(kor < 0 || kor > 100) {
			return false;
		}
		this.kor = kor;
		return true;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	private float avg;

}
