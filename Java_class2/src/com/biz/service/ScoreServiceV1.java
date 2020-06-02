package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {

	public void scoreList(ScoreVO[] scoreList) {
	
		LineService lineService = new LineService();
		int lineLength =50;
		String d_line = lineService.do_line(lineLength);
		String s_line = lineService.single(lineLength);
		
		System.out.println(d_line);
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println(s_line);
		
		int[] sum=new int[scoreList.length];
		for(int i=0; i<scoreList.length; i++) {
			
			// for() {} 내에서 선언된 sum, avg변수는 for() {}명령문이 종료되면
			// 이후에 참조할 수 없다.
			sum[i]=scoreList[i].getKor();
			sum[i]+=scoreList[i].getEng();
			sum[i]+=scoreList[i].getMath();
		}
		
		for(int i=0; i<scoreList.length; i++) {
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t\n",
					scoreList[i].getName(),
					scoreList[i].getKor(),
					scoreList[i].getEng(),
					scoreList[i].getMath(),
					sum[i],
					sum[i]/3);
		}
		
		
	}
}
