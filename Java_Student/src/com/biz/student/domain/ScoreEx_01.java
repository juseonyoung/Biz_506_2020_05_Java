package com.biz.student.domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.biz.student.service.ScoreService;
import com.biz.student.service.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV1();
		
		sService.inputScore();
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
			
			
		List<String> strList = new ArrayList<String>();
		strList = new LinkedList<String>();
		strList = new Vector<String>();
		
		
		ArrayList<String> strList1 = new ArrayList<String>();
		
	}
}
