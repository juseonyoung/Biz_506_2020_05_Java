package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_02 {

	public static void main(String[] args) {
		
		// 사이즈가 0인 intList 새로 생성
		List<Integer> intList = new ArrayList<>();
		Random rnd = new Random();
		
		// 데이터를 생성하는 코드
		for( int i=0; i<100; i++) {
			// num1에 담긴 난수의 값이 다 다르려면 for문 안에서
			// num1을 선언
			int num1= rnd.nextInt(100)+1;
			
			// intList에 추가하라
			intList.add(num1);
		}
		// size() 100이 되고 정수값이 100개 추가된 intList가 된다.
		
		// 데이터에 담긴 값 더하는 부분
		int sum=0;
		//sum 밖에서 선언
		for(int i=0; i<100; i++) {
			// i번째 위치의 값 읽어서 sum 변수에 누적하라
			
			sum += intList.get(i);
			// intList[i]
		}
		System.out.println("합계:" +sum);
		
	}
}
