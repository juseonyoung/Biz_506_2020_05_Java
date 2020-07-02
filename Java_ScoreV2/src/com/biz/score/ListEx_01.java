package com.biz.score;

import java.util.ArrayList;
import java.util.List;

public class ListEx_01 {

	public static void main(String[] args) {

		// 객체(인스턴스)들의 묶음 객체
		// List<제네릭:Generic> 리스트에 포함된 객체가 무엇인가를 명시하는 곳
		List<String> strList; // String 객체(문자열)가 요소로 포함된 리스트다
		strList = new ArrayList<String>();

		// 선언은 list로, 생성은 ArrayList로 해줌

		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라만세");

		// list를 출력할 때는 for문
		int size = strList.size();
		for (int i = 0; i < size; i++) {

			String str = strList.get(i);
			System.out.println(str);
		}
		
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		
		size = strList.size();
		for(int i=0; i< size; i++) {
			System.out.println(strList.get(i)); //위에 두줄이 이렇게 한줄이 됨
		}
		
		//for(int i=0; i<strList.size(); i++)
		// 이렇게 돌리면 돌릴때마다 사이즈를 조회하기 때문에 효율적이지 못함
		
		// 개수를 1번만 조회하고 for반복문 수행하기.
		// 이 코드는 개수를 1번만 조회하고 for반복문을 수행하기 때문에
		// 위의 코드보다는 효율적이다.
		// 하지만 개수를 조회하는 코드를 생략하면 혹시 리스트 개수가 변경되었을 경우
		// for반복문 연산 수행ㅇㅔ 문제가 될 수 있다.
		size = strList.size();
		for(int i=0; i< size; i++) {
			System.out.println(strList.get(i)); //위에 두줄이 이렇게 한줄이 됨
		}
		
		// 대안! List전체에 대해 for반복 수행할 경우 사용하는 향상된 코드!!
		// 확장 for문, foreach문
		//1.strList 개수만큼 반복하여 알아서 for가 반복됨
		//2. 그러는 동안 strList.get(현재)를 str 변수에 할당
		//3. for반복문 내에서 str변수 값을 읽어서 사용할 수 있다.
		for(String str : strList) {
			System.out.println(str);
		}
		
		// 배열도 foreach 로 가능
		int[] intArray = new int[100];
		for(int i: intArray) {
			System.out.println(i);
		}
	}
}
