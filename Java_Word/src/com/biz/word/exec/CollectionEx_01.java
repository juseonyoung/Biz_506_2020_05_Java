package com.biz.word.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx_01 {

	public static void main(String[] args) {
		
		// []배열 <>리스트
		String nation = "KOREA";
		String[] nations = nation.split(""); //알파벳 단위로 분해 
		
		
		// Arrays클래스의 asList라는 메서드를 호출
		// 배열을 리스트로 바꿔줌
		// Arrays.asList(배열) : 배열을 List 형 데이터로 변환
		List<String> words = Arrays.asList(nations);
		
		// collections 클래스의 기능을 몇가지 사용하기 위해서 배열을 List형 데이터로 변환했음
		// String, Integer, Long, Float, Character, Boolean 과 같은
		// Wrapper class를 포함하는 List 데이터를 오름차순 정렬하는 간단한 메소드
		// Collections의 sort() method는 내부 알고리즘이 Quich Sort 이므로 사용하는 데 아무런 제약이 없다
		Collections.sort(words); //sort기능은 오름차순(기본값)
		System.out.println(words);
		
		// List에 포함된 item들을 실행시킬때마다 뒤죽박죽 섞음
		Collections.shuffle(words); 
		System.out.println(words);
	}
}
