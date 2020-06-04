package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_06 {

	public static void main(String[] args) {

		// Character형 리스트
		// 문자 데이터를 포함하는 리스트
		List<Character> charList = new ArrayList<>();

		Random rnd = new Random();

		// 알파벳 개수 : 대소문자 각 26개
		// F값이 최초로 출력됨
		for (int i = 0; i < 100; i++) {
			char char1 = (char) (rnd.nextInt(26) + 'A');
			System.out.println(char1);// A의 char 코드값은 96
			// A부터 Z까지의 코드값 (char로 형변환 시켰으므로 문자로 나타남)}
		}
			
		for (int i = 0; i < 100; i++) {
				char char2 =(char) (rnd.nextInt(26) + 'A');
				charList.add(char2);
			
			if (char2 == 'F') {
				System.out.printf("%c\t", char2);
				break;
			}
		}
		// F가 저장된 위치 찾기
		// 배열을 만들었을 때 개수를 알고 싶으면 배열.length를 읽어보면 된다.
		// 여기서는 size
		// 리스트에서는 리스트.size() 메소드를 호출하면 리스트의 개수를 알 수 있다.
		for(int i=0; i<charList.size(); i++) { // 배열개수랑 i를 비교
			char charGet = charList.get(i);
			if(charGet =='F') {
				System.out.println(i+"번째에서 찾음");
				break;
			}
			
		}

		int charSize = charList.size();
		for(int i=0; i<charSize ; i++) {
			char charGet = charList.get(i);
			if(charGet == 'F') {
				System.out.println(i+"번째에서 찾음");
				break;}
			}

	}
}
