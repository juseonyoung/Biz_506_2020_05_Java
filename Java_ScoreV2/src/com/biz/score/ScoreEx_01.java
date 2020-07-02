package com.biz.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		// interface를 implements하여 만들어진 클래스는 선언할 때는
		// interface로 선언을 하고!
		// 							초기화 할때는 실제 코드가 구현된 클래스로 초기화한다.
		ScoreService sService = new ScoreServiceImplV1(); 
		//사용자의 편의에 따라 클래스 이름만 바꾸고 내용 안바꿔도됨
		
		// 코드는 없지만 메서드는 있기 때문에 원하는 결과를 출력할 수 있
		sService.inputScore();
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
		
		/*
		 * List interface는 ArrayList 클래스를 선언할 때 implements한 주체이다
		 * 따라서 ArrayList 형 객체(인스턴스) 만들 때는
		 * 	선언은 List로 하고, 초기화는 ArrayList로 한다.
		 * 
		 * List를 interface 하여 만들어 놓고
		 * ArrayList, LinkedList, Vector 사용
		 * 
		 */
		
		List<String> strList = new ArrayList<String>(); // 이게 더 잘쓴 코드
		strList = new LinkedList<String>();
		strList = new Vector<String>();
		
		
		
		ArrayList<String> strList1 = new ArrayList<String>();
		
		
		
	}
}
