package com.biz.word.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

	public static void main(String[] args) {
		
		// 인티져를 담는 리스트
		List<Integer> intList = new ArrayList<>();
		
		for(int i=0; i<45; i++) {
			intList.add(i+1); //리스트에 번호 1~45까지 담고
		}
		
		Collections.shuffle(intList); // 리스트를 섞어!
		
		System.out.println("행운을 빌어요!");
		for(int i=0; i<6; i++) {
			System.out.println(intList.get(i)+"\t");
		}
		System.out.println("\n부자되세요");
		
		
		
		
		
		
		
		
		
		
		
		
		// 1~45 담을 리스트 만들기
		 List<Integer> lottoList = new ArrayList<>();
		 
		 // 리스트에 숫자담기
		 for(int i=0; i<45; i++) {
			 lottoList.add(i+1);
			 
		 }
		 
		 // 섞기
		 Collections.shuffle(lottoList);
		 
		 //6가지 출력
		 for(int i=0; i<6; i++) {
			 System.out.println(lottoList.get(i));
		 }
	}
}
