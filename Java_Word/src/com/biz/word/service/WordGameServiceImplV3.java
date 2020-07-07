package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

public class WordGameServiceImplV3 extends WordGameServiceImplV1 {

	
	// V1 클래스의 
	// List<WordVO> wordList, count, game 상속
	// loadgame(), playgame(), gameover() 상속받는다
	// List, ArrayList 와 같은 클래스류를 collection이라고 한다.
	// 다수의 데이터를 담을 수 있는 클래스들이며, VO들을 담아서 연산을 수행하는 목적으로 사용한다
	// collection 클래스들은 collections 라는 클래스의 자손들이다
	
	
	
	
	// playgame만 재정의!!
	@Override
	public void playGame() {
		//V1에서 선언했기 때문에 그대로 0 대입 가능
		Scanner scan = new Scanner(System.in);
		count =0;
		game=0;
		while(true) {
			
			// 셔플을 사용하여 wordList를 뒤섞고 그 중 0번 째 위치의 값을 추출한다.
			Collections.shuffle(wordList);
			WordVO wordVO = wordList.get(0); 
			
			// vo에서 영단어를 추출하여 split으로 분해 한 후 words 배열에 담기
			String[] words =wordVO.getEng().split(""); //콜론 쓰지마!!
			
			//배열을 리스트로 바꾸고
			List<String> wordList = Arrays.asList(words);
			Collections.shuffle(wordList);
			System.out.println("다음 알파벳을 단어 순서에 맞게 나열하시오(END:입력종료)"); 
			System.out.print(wordList); // 셔플된 단어 리스트 보여줌
			String strInput = scan.nextLine(); // 입력창 뜸
			
			
			if(strInput.equals("END")) {
				break;
			}
			
			if(wordVO.getEng().equalsIgnoreCase(strInput)) { //맞으면?
				System.out.println("맞았습니다");
				System.out.println(wordVO.getEng());
				System.out.println(wordVO.getKor());
				count ++;
			} else {
				System.out.println("아쉽네요");
				System.out.println(wordVO.getEng()); //단어알려주고
				System.out.println(wordVO.getKor()); // 한국어뜻 알려줌
			}
		}
	}

}
