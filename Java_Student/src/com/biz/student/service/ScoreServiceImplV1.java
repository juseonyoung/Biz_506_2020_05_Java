package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<StudentVO> studentList;
	protected List<ScoreVO> scoreList;
	protected PrintStream outPut;

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		scoreList = new ArrayList<ScoreVO>();

		String scoreFile = "src/com/biz/student/exec/score.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			// 파일을 읽기 위해 open
			fileReader = new FileReader(scoreFile);

			// open된 파일에 대한 정보가 담긴 fileReader객체를 buffer에 연결하여 파일 읽도록 지시
			buffer = new BufferedReader(fileReader);

			String reader = "";
			// 한줄씩 담을 string
			// 반복문 밖에서 선언하고 초기화 한후 사용한다.
			while (true) {
				reader = buffer.readLine(); // buffer로부터 파일에서 꺼내 한줄씩 읽기
				// add catch해서 추가 시켜줌
				if (reader == null) {
					break; // null 도달하면 멈춰라
				}

				String[] scores = reader.split(":");
				ScoreVO sVO = new ScoreVO();
				sVO.setNum(scores[SplitPos.SCORE.SC_NUM]); // scores에는 String이 담긴 상태!!
				sVO.setKor(Integer.valueOf(scores[SplitPos.SCORE.SC_KOR])); // 각각의 점수를 담은 배열을 valueof에게 주입
				sVO.setEng(Integer.valueOf(scores[SplitPos.SCORE.SC_ENG]));
				sVO.setMath(Integer.valueOf(scores[SplitPos.SCORE.SC_MATH]));

				// 위해서 선언, 초기화 시켜야 sVO 담긴다
				scoreList.add(sVO);

			}
			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(scoreFile + "파일을 읽기 위해 open 하는 중 오류 발생");
			return; // 더 이상 진행하지 못하게 막아버림

		} catch (NumberFormatException e) {
			// 예외처리 내가 만들어!!
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류 발생");

			// 아래 IO예외는 readline에서 문제생긴것
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("버퍼로부터 데이터 읽는데 문제가 발생!");
		}

		// 위에랑 같은 코드!! 학번이 00010인 사람의 것 보여라
		

	}

	// for (Student sVO : scoreList) { // 굳이 왜 이렇게.....

	@Override
	public boolean inputStudent() {

		studentList = new ArrayList<>();
		outPut = System.out;
		String studentFile = "src/com/biz/student/exec/student.txt";
		// score.txt를 읽어서 무언가를 수행하겠다
		// 파일 담는 string

		// 파일과 관련된 클래스들은 객체로 선언하는 코드와 초기화하는 코드를 분리시켜야 한다.
		// 선언할 때는 null값을 clear만 수행하고 다음으로 진행한다.

		FileReader studentReader = null;

		BufferedReader studentbuffer = null;

		try {
			// 파일을 읽기 위해 open

			studentReader = new FileReader(studentFile);

			// open된 파일에 대한 정보가 담긴 fileReader객체를 buffer에 연결하여 파일 읽도록 지시

			studentbuffer = new BufferedReader(studentReader);

			String st_reader = "";
			// 한줄씩 담을 string
			// 반복문 밖에서 선언하고 초기화 한후 사용한다.
			while (true) {
				// buffer로부터 파일에서 꺼내 한줄씩 읽기
				st_reader = studentbuffer.readLine();
				// add catch해서 추가 시켜줌

				if (st_reader == null) {
					break;
				}
				System.out.println(st_reader);
				// 이렇게 하는게 맞나......
				
				String[] stds = st_reader.split(":");
				StudentVO std = new StudentVO();
				
				std.setNum(stds[ SplitPos.STUDENT.ST_NUM ]);
				std.setName(stds[SplitPos.STUDENT.ST_NAME]);
				std.setGrade(Integer.valueOf(stds[SplitPos.STUDENT.ST_GRADE]));
				std.setDept(stds[SplitPos.STUDENT.ST_DEPT]);
				System.out.println(std.getName());

				
				// 위해서 선언, 초기화 시켜야 sVO 담긴다
				studentList.add(std);
			}
			studentbuffer.close();
			studentReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(studentFile + "파일을 읽기 위해 open 하는 중 오류 발생");
			// return; // 더 이상 진행하지 못하게 막아버림

		} catch (NumberFormatException e) {
			// 예외처리 내가 만들어!!
			System.out.println("점수를 숫자로 바꾸는 과정에서 오류 발생");

			// 아래 IO예외는 readline에서 문제생긴것
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("버퍼로부터 데이터 읽는데 문제가 발생!");
		} // try: 파일 읽기가 끝나는 부분
		return true;
	}

	@Override
	public void calcSum() {
		// TODO Auto-generated method stub
		for (ScoreVO sVO : scoreList) {
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			sVO.setSum(sum);
		}
	}

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub
		for (ScoreVO sVO : scoreList) {
			float avg = (float) sVO.getSum() / 3;
			sVO.setAvg(avg);
		}
	}

	public void scoreList() {
		// TODO Auto-generated method stub

		System.out.println("콘솔에 데이터 출력하기");

		outPut.println("=========================================================");
		outPut.println("성적일람표");
		outPut.println("=========================================================");
		outPut.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		outPut.println("---------------------------------------------------------");

		
		// 데이터의 join
		// scoreList, studentList를 join해서 데이터를 출력하는코드
		for (ScoreVO sVO : scoreList) {
			
			System.out.print(sVO.getNum() + "\t");
			for (StudentVO std : studentList) {

				// 정보가 겹치는 것!! 학번이다
				if (sVO.getNum().equals(std.getNum())) {
					
					outPut.print(std.getName() + "\t");
					break;
				}
					outPut.print(sVO.getKor() + "\t");
					outPut.print(sVO.getEng() + "\t");
					outPut.print(sVO.getMath() + "\t");
					outPut.print(sVO.getSum() + "\t");
					outPut.printf("%05.2f\n",sVO.getAvg());
				}

			}
		}
	}


// for (Student sVO : scoreList) { // 굳이 왜 이렇게.....
