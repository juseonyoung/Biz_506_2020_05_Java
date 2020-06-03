package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

public class ScoreServiceV2 {
	
	private ScoreVO[] scorelist;


	public void sum(ScoreVO[] scorelist) { // 학생별 총점과 평균
		for (int i = 0; i < scorelist.length; i++) {
			scorelist[i].setIntSum(scorelist[i].getIntKor() + scorelist[i].getIntEng() + scorelist[i].getIntMath()
					+ scorelist[i].getIntMusic());

			scorelist[i].setIntAvg(scorelist[i].getIntSum() / 10);
		}

	}

	public void scorelist(ScoreVO[] scorelist) {
		LineService lineservice = new LineService();
		String d_line = lineservice.do_line(50);
		String single = lineservice.single(50);

		System.out.println("성적리스트");
		System.out.println(d_line);
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		for (int i = 0; i < scorelist.length; i++) {
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\t\n", scorelist[i].getStrNum(),
					scorelist[i].getIntKor(), scorelist[i].getIntEng(), scorelist[i].getIntMath(),
					scorelist[i].getIntMusic(), scorelist[i].getIntSum(), scorelist[i].getIntAvg());
		}
		System.out.println(d_line);
		int sumKor=0;
		int sumEng=0;
		int sumMath=0;
		int sumMusic=0;
		 
		for(int i=0; i<scorelist.length; i++) {
			sumKor += scorelist[i].getIntKor();
			sumEng+=scorelist[i].getIntEng();
			sumMath+=scorelist[i].getIntMath();
			sumMusic+=scorelist[i].getIntMusic();
	   }
		int scoresum=0;
		for(int i=0; i<scorelist.length;i++) {
			scoresum+=scorelist[i].getIntSum();
		}
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t\n",
				"총점",sumKor,sumEng,sumMath,sumMusic,scoresum);
		System.out.printf("%s\t %d\t %d\t %d\t %d\t\t%d\t\n",
				"평균",
				sumKor/10,
				sumEng/10,
				sumMath/10,
				sumMusic/10,
				scoresum/10);
}
}
