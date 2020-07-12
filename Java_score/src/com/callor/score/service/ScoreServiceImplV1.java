package com.callor.score.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.domain.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {

	// 객체변수 리스트 선언하여 메서드간 공유
	private List<ScoreVO> scoreList;
	private Scanner scan;
	private String scoreFile="";
	

	public ScoreServiceImplV1() {
		int[] totalSum;
		int[] totalAvg;
		scoreList = new ArrayList<>();
		scan = new Scanner(System.in);
		scoreFile = "src/com/callor/score/exec/Score.txt";
		ScoreVO sv = new ScoreVO();
		
		String[] title = {"학번","국어","수학","영어","총점","평균"};
		
		totalSum = new int[ title.length ];
		totalAvg  = new int[title.length ];
	}

	@Override
	public boolean inputScore() { // 성적 입력 하는 곳
		// TODO Auto-generated method stub
		ScoreVO sv = new ScoreVO();
		
		
		System.out.println("학번을입력하세요>>");
		
		String num = scan.nextLine(); //입력하는 곳
		try {
			num = String.format("%03d", Integer.valueOf(num)); //1을 입력하면 5자리로 나온다
			sv.setNum(num);
		} catch (Exception e) {
			
			System.out.println("학번은정수3자리만가능합니다");
		}

		
	

		// 학번 있는지 확인하려면
		for (ScoreVO sVO : scoreList) {
			if (sVO.getNum().equals(num)) {
				System.out.println(num + " 학생의 성적이 이미 등록 되어 있습니다");
				System.out.println(num+"이미 등록된 학번의 정보를 제거합니다");
				
				scoreList.clear();
				return true;
			}
		} //이미 등록되어 있으면 정보 삭제하고 다시 등록
		
		
		
		System.out.println("국어점수 입력(END:입력종료)");
		String st_kor=scan.nextLine();
		if(st_kor.equals("END")) {
			return false;
		}
		int intKor = 0;
		try {
			intKor = Integer.valueOf(st_kor);
		} catch (Exception e) {
			System.out.println("국어점수는 숫자만 가능!");
			System.out.println("입력 문자열" + "st_kor");
			return true;
		}
		sv.setKor(intKor);
		

		
		
		
		System.out.println("수학점수 입력(END:입력종료)");
		String st_math=scan.nextLine();
		if(st_kor.equals("END")) {
			return false;
		}
		int intMath = 0;
		try {
			intMath = Integer.valueOf(st_math);
		} catch (Exception e) {
			System.out.println("수학 숫자만 가능!");
			System.out.println("입력 문자열" + "st_math");
			return true;
		}
		sv.setMath(intMath);
		
		
		
		
		System.out.println("영어점수 입력(END:입력종료)");
		String st_eng=scan.nextLine();
		if(st_eng.equals("END")) {
			return false;
		}
		int intEng = 0;
		try {
			intEng = Integer.valueOf(st_eng);
		} catch (Exception e) {
			System.out.println("영어점수는 숫자만 가능!");
			System.out.println("입력 문자열" + "st_eng");
			return true;
		}
		sv.setEng(intEng);
		
		scoreList.add(sv); //아미친 ㅠㅠ
		this.scoreSave(); //이 코드를 써줘서 추가!!
		
		return true;
	}

	@Override
	public void calcSum() {
		for(ScoreVO scoreVO : scoreList) {
			int sum = scoreVO.getKor();
			sum += scoreVO.getEng();
			sum += scoreVO.getMath();
			sum += scoreVO.getKor();
			scoreVO.setSum(sum);
		}

	}

	@Override
	public void calcAvg() {
		for(ScoreVO sv : scoreList) {
			
			// sum에 일단 꺼내와
			int sum = sv.getSum();
			float avg = (float)sum / 4;
			sv.setAvg(avg);
		}
	}

	@Override
	public void scoreList() {
				
		System.out.println("성적 일람표");
		System.out.println("학번\t|국어\t|영어\t|수학\t|총점\t|평균\t|");
		for (ScoreVO sVO : scoreList) {
			System.out.printf("%s\t|", sVO.getNum());
			System.out.printf("%d\t|", sVO.getKor());
			System.out.printf("%d\t|", sVO.getEng());
			System.out.printf("%d\t|", sVO.getMath());
			System.out.printf("%d\t|", sVO.getSum());
			System.out.printf("%5.2f\t|\n", sVO.getAvg());
			
			
		}

	}

	

	@Override
	public void scoreSave() {
		PrintStream outPut = null;
		try {
			outPut = new PrintStream(scoreFile);
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (ScoreVO svo : scoreList) {

			String outInfo = String.format("%s:%d:%d:%d:\n", svo.getNum(), svo.getKor(), svo.getEng(), svo.getMath());
			outPut.println(outInfo);
		}
		outPut.close();
		System.out.println("학생의 성적을 저장했습니다");
	}
		
	

	@Override
	public void loadscoreFile() {
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);

			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				String[] scores = reader.split(",");

				ScoreVO svo = new ScoreVO();

				svo.setNum(scores[0]);
				svo.setKor(Integer.valueOf(scores[1]));
				svo.setEng(Integer.valueOf(scores[2]));
				svo.setMath(Integer.valueOf(scores[3]));
				scoreList.add(svo);
			}
			buffer.close();
			fileReader.close();
		} catch (Exception e) {
			System.out.println();
		}
		
	}
	
	

}
