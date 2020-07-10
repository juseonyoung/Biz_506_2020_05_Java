package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.config.SplitPos;
import com.biz.grade.vo.ScoreVO;
import com.biz.grade.vo.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected List<StudentVO> studentList;
	protected Scanner scan;
	protected String scoreFile = "";

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<>();
		studentList = new ArrayList<>();
		String scoreFile = "src/com/biz/grade/exec/data/score.txt";
		scan = new Scanner(System.in);
	}

	@Override
	public boolean inputScore() { // 성적정보가 저장된파일 쪼개
		
		ScoreVO svo = new ScoreVO();

		System.out.println("학번을입력하세요>>");
		String num = scan.nextLine(); //입력하는 곳
		try {
			num = String.format("%05d", Integer.valueOf(num)); //1을 입력하면 5자리로 나온다
			svo.setNum(num);
		} catch (Exception e) {
			
			System.out.println("학번은정수5자리만가능합니다");
		}

		for (StudentVO std : studentList) {
			if (svo.getNum().equals(std.getNum())) {
				svo.setNum(num);
			} else {
				System.out.println("해당학생의 정보가 없습니다");
				return true;
			}
		}

		System.out.println("국어점수를입력하세요>>");
		String stKor = scan.nextLine();
		int kor = 0;
		try {
			kor = Integer.valueOf(stKor);
		} catch (Exception e) {
			System.out.println("숫자만입력이가능합니다");
		}
		svo.setKor(kor);

		System.out.println("영어점수를입력하세요>>");
		String stEng = scan.nextLine();
		int eng = 0;
		try {
			eng = Integer.valueOf(stEng);
		} catch (Exception e) {
			System.out.println("숫자만입력이가능합니다");
		}
		svo.setKor(eng);

		System.out.println("수학점수를입력하세요>>");
		String stMath = scan.nextLine();
		int math = 0;
		try {
			math = Integer.valueOf(stMath);
		} catch (Exception e) {
			System.out.println("숫자만입력이가능합니다");
		}
		svo.setKor(math);

		System.out.println("음악점수를입력하세요>>");
		String stMusic = scan.nextLine();
		int music = 0;
		try {
			music = Integer.valueOf(stMusic);
		} catch (Exception e) {
			System.out.println("숫자만입력이가능합니다");
		}
		svo.setKor(music);

		scoreList.add(svo);
		return true;
		

	}

	public void calcSum() {

		for (ScoreVO svo : scoreList) {
			int sum = svo.getKor();
			sum += svo.getEng();
			sum += svo.getMath();
			sum += svo.getMusic();

			svo.setSum(sum);
		}

	}

	@Override
	public void calcAvg() {
		for (ScoreVO svo : scoreList) {

			float sum = (float) svo.getSum();
			float avg = sum / 4;

			svo.setAvg(avg);
		}

	}

	@Override
	public void scoreList() {

		String[] listTitle = { "학번", "국어", "영어", "수학", "음악"};
		System.out.println("===================================================================================");
		System.out.println("성적일람표");
		System.out.println("===================================================================================");
		System.out.printf("%8s\t|%8s\t|%8s\t|%8s\t|%8s\t|\n", listTitle[0], listTitle[1], listTitle[2],
				listTitle[3], listTitle[4]);
		System.out.println("-----------------------------------------------------");

		for (ScoreVO svo : scoreList) {
			System.out.printf("%8s\t|", svo.getNum());
			System.out.printf("%8s\t|", svo.getKor());
			System.out.printf("%8s\t|", svo.getEng());
			System.out.printf("%8s\t|", svo.getMath());
			System.out.printf("%8s\t|", svo.getMusic());
		}
		System.out.println("------------------------------------");

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int musicSum = 0;

		for (ScoreVO svo : scoreList) {
			korSum += svo.getKor();
			engSum += svo.getEng();
			mathSum += svo.getMath();
			musicSum += svo.getMusic();
		}

		int sumSum = korSum + engSum + musicSum + mathSum; //과목총점
		int avgAvg = sumSum / 4; //과목평균
		
		System.out.printf("%-8s\t|", "총점");
		System.out.printf("%8s\t|", korSum);
		System.out.printf("%8s\t|", engSum);
		System.out.printf("%8s\t|", mathSum);
		System.out.printf("%8s\t|", musicSum);
		System.out.printf("%8s\t|", sumSum);
		System.out.printf("%8s\t|\n", avgAvg);

		System.out.println("=-----------------------------------------------");
		int size = scoreList.size();
		System.out.printf("%-8s\t|", "평균");
		System.out.printf("%8s\t|", korSum / size);
		System.out.printf("%8s\t|", engSum / size);
		System.out.printf("%8s\t|", mathSum / size);
		System.out.printf("%8s\t|", musicSum / size);
		System.out.printf("%8s\t|", sumSum / size);
		System.out.printf("%8s\t|\n", avgAvg / size);
		System.out.println("=-----------------------------------------------");
	}

	@Override
	public void loadScoreFile() {
		// TODO Auto-generated method stub

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

				svo.setNum(scores[SplitPos.SCORE.SC_NUM]);
				svo.setKor(Integer.valueOf(scores[SplitPos.SCORE.SC_KOR]));
				svo.setEng(Integer.valueOf(scores[SplitPos.SCORE.SC_ENG]));
				svo.setMath(Integer.valueOf(scores[SplitPos.SCORE.SC_MATH]));
				svo.setMusic(Integer.valueOf(scores[SplitPos.SCORE.SC_MUSIC]));

				scoreList.add(svo);
			}
			buffer.close();
			fileReader.close();
		} catch (Exception e) {
			System.out.println();
		}

	}

	@Override
	public void saveScoreFile() {

		PrintStream outPut = null;
		try {
			outPut = new PrintStream(scoreFile);
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (ScoreVO svo : scoreList) {

			String outInfo = String.format("%s:%d:%d:%d:%d\n", svo.getNum(), svo.getKor(), svo.getEng(), svo.getMath(),
					svo.getMusic());
			outPut.println(outInfo);
		}
		outPut.close();
		System.out.println("학생의 성적을 저장했습니다");
	}

	public List<StudentVO> getStList() {
		return studentList;
	}

}
