package com.biz.classes.service;

import com.biz.classes.model.ScoreVO;

// method의 중복정의
// method overloading
// method의 매개변수가 다르면 같은이름의 method를 한 클래스 내에서
// 중복정의하여 사용할 수 있다.

// 자바 이전의 언어에서는 
// 클래스를 모듈이라는 이름으로 불렀는데
// 1개의 모듈 또는 1개의 파일 내에서는 같은 이름의 메서드(함수)를 정의 할 수 없었다.
// 자바에서는 메서드의 매개변수 개수가 다르면 같은 이름의 메서드를 사용할 수 있다.

// 호출하는 곳에서 매개변수 전달을 다르게 수행하면 자동으로 메서드가 연결되어
// 코드가 수행된다.

// 또한 메소드의 매개변수 개수가 같은 경우라도 매개변수의 타입이 다르면
// 이름이 같은 메서드를 정의할 수 있다.
public class ScoreService {

	public int sum() { //매개변수 0
		
		return 0;
	}
	// Score클래스를 매개변수로 받는 메서드
	public int sum(ScoreVO score) {
		
		int sum= score.getIntKor();
				sum+=score.getIntEng();
				sum+=score.getIntMath();
				sum +=score.getIntMusic();
				sum +=score.getIntSci();
				sum +=score.getIntArt();
						
				
				score.setIntSum(sum);
				score.setIntAvg(sum/6);
				
				return sum ;
	}
	public int sum(int kor, int eng, int math, int music, int art, int sci) {
		int sum = kor + eng + math + music +art + sci;
		return sum;
	}
	
	public float sum(float kor, float eng, float math) { //여기도 매개변수 3개
		float sum = kor +eng +math;
		return sum;
	}
	
	
	public int sum(int kor, int eng, int math) { //매개변수 3개
		int sum = kor + eng + math;
		return sum;
	}
	 
	public int sum(int kor, int eng) { // 매개변수2개
		// 매개변수의 개수가 다르면 같은 이름을sum 써도된다.(한 클래스 내)
		// 매개변수 개수에 따라 자동으로 선택되어짐
		return kor + eng;
	}
	
	public float sum(int kor, float eng) {
		return kor + eng;
	}
	
	public float sum(float kor, int eng) {
		return kor +eng;
	}
	
}
