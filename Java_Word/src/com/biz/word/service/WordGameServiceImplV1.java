package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

public class WordGameServiceImplV1 implements WordGameService {

	List<WordVO> wordList;
	int count; // 이 결과를 공유 해야함
	int game;

	public WordGameServiceImplV1() { //필드변수에서 한거 초기화 하는 곳
		wordList = new ArrayList<>();
		count = 0;
		game = 0;
	}

	@Override
	public void loadWord() { // word.txt 파일에서 데이터 읽어서 wordList 만들기
		// TODO Auto-generated method stub

		String wordFile = "src/com/biz/word/exec/word.txt";
		

		// 파일을 open하기 위한 객체
		FileReader fileReader = null;

		// filereader와 연동하여 파일을 읽어올 때 효율적으로 가져오기 위한 helper class
		BufferedReader buffer = null;

		// filereader를 사용하여 word파일을 읽기 용도로 open!!
		// 운영체제와 통신하여 파일을 open하는 과정에서 갑자기 문제가 발생하여
		// 파일을 오픈할 수 없는 경우가 발생할 가능성이 매우 높으므로
		// 이 코드는 반드시 try-catch문으로 묶어 예외처리 해주어야 한다

		try {
			fileReader = new FileReader(wordFile);

			// buffer는 파일을 모두 읽어 임시 buffer에 보관하게 된다
			buffer = new BufferedReader(fileReader);

			// buffer로부터 readline() 호출하여 한줄씩 데이터를 읽어온다
			// 이때 데이터의 라인수가 몇개인지 알 수 없으므롤 while반복문으로 무한 반복실행하여
			// 계속 한줄씩 읽도록 수행한다
			String reader = "";
			while (true) {

				reader = buffer.readLine(); // 반복하여 한줄씩읽어라 이미 try로 묶였으므로 catch추가 처리
				if (reader == null) {
					break;
				}
				// 읽어들인 데이터를 콜론 기준으로 문자열 배열하여 words에 담아라
				String[] words = reader.split(":");

				WordVO wVO = new WordVO();
				wVO.setEng(words[SplitPosition.WORD_ENG]); // 클래스.변수와 같이 사용한다 =0을 채운것과 같음
				wVO.setKor(words[SplitPosition.WORD_KOR]); // words[1]

				wordList.add(wVO); // VO로 만든 list에 담아
			}

			buffer.close(); // while에서 빠져나오는 코드 있어야 buffer.close 됨
			fileReader.close();

		} catch (Exception e) {
			System.out.println(wordFile + "파일을 찾을 수 없음");
		}

	}

	@Override
	public void playGame() { // 단어를 보여주고 게임실행하기
		// TODO Auto-generated method stub
		// List<WordVO> wordList = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		Random rnd = new Random();
		int size = wordList.size();

		count =0;
		game=0;
		
		while (true) {
			int index = rnd.nextInt(size); // 0~ (wordList 개수-1) 중의 한 수
			System.out.println(" 다음에 해당하는 영어 단어는? (END:종료)");
			System.out.print(wordList.get(index).getKor() + ">>");
			String strEng = scan.nextLine();

			if (strEng.equals("END")) {
				break;
			}

			game++;
			if (strEng.equalsIgnoreCase(wordList.get(index).getEng())) {
				System.out.println("맞았습니다! ㅊㅋㅊㅋ");
				count++;
			} else {
				System.out.println("아쉽네요");
				System.out.println(wordList.get(index).getEng());
			}
		}

	}
	//int count=0; //메서드 밖에서도 생성,초기화 해도 되지만 필드변수/기본생성자에서 해주는게 권장방법
	//int game=0;
	@Override
	public void gameOver() { // gameover가 되었을 때 점수 등 보여주기
		// TODO Auto-generated method stub
		System.out.println("GAME OVER");
		System.out.printf("%d게임중 %d번 정답 맞춤!", game, count);
	}

}
