package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;

public class ScoreEx_05 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("대한민국만세"); //0번 저장
		strList.add("우리나라만세");
		strList.add("Republic of Korea");
		
		// 사용방법
		// get() method는 인덱스에 해당하는 정수값을
		// 매개변수로 주입해 주어야 하고
		// 다른변수에 값을 복사해 올수 있는 구조이다.
		String s1 = strList.get(0); //0번에 문자열 저장한 것 getter해서 s1이라는 변수에 저장해라
		String s2 = strList.get(1);
		String s3 = strList.get(2);
		
		System.out.println(s1);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(900); // size =1
		
		int num1 = nums.get(0);
		System.out.println(num1);
		System.out.println(nums.get(0));
		
	}
}
