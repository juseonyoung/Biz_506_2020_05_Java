package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.ScoreVO;
import com.biz.list.service.ScoreServiceV2;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<>();
		Random rnd = new Random();
		
		ScoreVO scoreVO ;
		for(int i =0; i<10; i++) {
			
			// VO 인스턴스를 초기화, 다시 생성하라
			scoreVO = new ScoreVO();
			
			// 필드변수에 값을 세팅하고
			scoreVO.setNum(""+(i+1));
			scoreVO.setKor(rnd.nextInt(50)+51);
			scoreVO.setMath(rnd.nextInt(50)+51);
			scoreVO.setEng(rnd.nextInt(50)+51);
			
			// 리스트에 추가
			scoreList.add(scoreVO);
		}
		
		ScoreServiceV2 sService = new ScoreServiceV2();
		sService.scoreList(scoreList); //매개변수로 scoreList받아라
		sService.stSum();
		sService.stAvg();
		sService.scoreList();
	}
}
