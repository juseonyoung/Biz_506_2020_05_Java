package com.biz.score.service;
// 선생님이 불러주신 곳

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV4 {

	// scores 인스턴스배열을 필드변수로 선언한 이유
	// Ex클래스에서 Service클래스에서
	// 총점계산, 평균계산, 리스트출력을 요청할텐데
	// 요청 할 때마다 scores 인스턴스 배열을 배개변수로 전달 할 수도 있으나
	// 한번만 변수로 전달해 service클래스가 scores인스턴스를 보관하도록 하고
	// 나머지 요청하는 메서드에서는 변수를 받는 부분을 제거하기 위함이다.
	
	// Ex클래스에서 요청들을 할 때마다 scores 배열을 매개변수로 전달을 하면
	// 요청과 요청 사이에서 다른 코드에 의해  scores 배열값이
	// 변형되어 결과가 엉뚱하게 나타나는 것을 방지하는 목적도 있다.
	
	
	
	private ScoreVO[] korea; // 필드변수 세팅하는 scores(임의로 설정한 인스턴스)
								// 클래스 내에서 scores 공유
								// 선언만 된 상태(초기화 필요)
	
	// ScoreServiceV2 클래스를 사용해서 어떤 연산을 수행하려고 할 때
	// 반드시 setScore() method통해서 scores값을 매개변수로 주입해야 한다.
	// 그렇지 않으면 scores 인스턴스 필드변수가 아직 준비가 안된 상태로 인식하여
	// 이후에 호출되는 method() 들에서 널포인터익셉션 발생
	
	// scores 배열을 setScoreList() 메서드를 통해 ScoreVO 배열에 세팅하라
	public void setScoreList(ScoreVO[] scores) {
		this.korea = scores;
	}
	// 필드변수로 scores 선언되어 있기 때문에
	// 학생 총점과 평균을 계산한 후 어디에 저장해야 할지를 고민하지 않아도 된다.
	
	public void scoreSum(ScoreVO[] scores) { //총점 계산하여 scores에 저장
		this.korea = scores;
		
		for (int i = 0; i < korea.length; i++) {
			int sum =this.korea[i].getIntKor();
			 sum =this.korea[i].getIntKor();
			 sum =this.korea[i].getIntKor();
			 sum =this.korea[i].getIntKor();
			 
			 this.korea[i].setIntSum(sum);
			
		}
	}
	
	public void scoreAvg() {

		for(int i=0; i<korea.length; i++) {
		int sum = this.korea[i].getIntSum();
		this.korea[i].setIntSum(sum/4);
		}
	}
	
	public void scorelist() {
		
		LineService line = new LineService();
		int intLine=50;
		
		// 점수 리스트 표시하는 부분은 한번씩만 출력되기때문에 for반복문 밖에서 사용
		System.out.println(line.do_line(intLine));
		System.out.println("성적리스트");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(line.single(intLine));
		
		// sum 출력부분은 for문 안에서 
		int intKorSum=0;
		int intEngSum=0;
		int intMathSum=0;
		int intMusicSum=0;
		int intSumSum=0; 
		int intAvgSum=0;
		
		//출력부분
		//this. 현재 이 클래스에 선언된 이라는 뜻이다. 없어도 괜찮다
		for(int i=0; i<this.korea.length; i++) {
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\t\n", 
					korea[i].getStrNum(),
					korea[i].getIntKor(), 
					korea[i].getIntEng(), korea[i].getIntMath(),
					korea[i].getIntMusic(), korea[i].getIntSum(), 
					korea[i].getIntAvg());
			
			intKorSum +=korea[i].getIntKor();
			intEngSum +=korea[i].getIntEng();
			intMathSum +=korea[i].getIntMath();
			intMusicSum +=korea[i].getIntMusic();
			intSumSum +=korea[i].getIntSum(); //총점의 총점
			intAvgSum +=korea[i].getIntAvg(); //평균의 총점
			
		}
		// for문 끝나고
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\t\n",
				"총점",
				intKorSum,
				intEngSum,
				intMathSum,
				intMusicSum,
				intSumSum,0
				);
		
		// 나눌 때는 학생 수가 아니라 scores.length
		// 학생수가 변동될 수도 있다.
		System.out.println(line.do_line(50));
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\t\n",
				"총점",
				intKorSum/korea.length,
				intEngSum/korea.length,
				intMathSum/korea.length,
				intMusicSum/korea.length,
				intSumSum,0
				);
		
	}
}