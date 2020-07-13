package com.biz.student.service;

import com.biz.student.domain.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{

	
public void scoreList() {
		
		System.out.println("================================================");
		System.out.println("성적일람표 V2");
		System.out.println("================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		for(ScoreVO sVO : scoreList) {
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getSum() + "\t");
			System.out.println(sVO.getAvg());
		}
		System.out.println("================================================");
	}
}
