package com.biz.student.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.ScoreVO;

public class ScoreEx_04 {

	// Ex클래스는 main클래스가 있는 곳

	public static void main(String[] args) {

		List<ScoreVO> scoreList = new ArrayList<>();

		String scoreFile = "src/com/biz/student/exec/score.txt";
		String studentFile = "src/com/biz/student/exec/student.txt";
		// score.txt를 읽어서 무언가를 수행하겠다
		// 파일 담는 string

		// 파일과 관련된 클래스들은 객체로 선언하는 코드와 초기화하는 코드를 분리시켜야 한다.
		// 선언할 때는 null값을 clear만 수행하고 다음으로 진행한다.
		FileReader fileReader = null;
		FileReader studentReader = null;

		BufferedReader buffer = null;
		BufferedReader studentbuffer = null;

		try {
			// 파일을 읽기 위해 open
			fileReader = new FileReader(scoreFile);
			studentReader = new FileReader(studentFile);

			// open된 파일에 대한 정보가 담긴 fileReader객체를 buffer에 연결하여 파일 읽도록 지시
			buffer = new BufferedReader(fileReader);
			studentbuffer = new BufferedReader(studentReader);

			String reader = "";
			String st_reader = "";
			// 한줄씩 담을 string
			// 반복문 밖에서 선언하고 초기화 한후 사용한다.
			while (true) {
				reader = buffer.readLine(); // buffer로부터 파일에서 꺼내 한줄씩 읽기
				st_reader = studentbuffer.readLine();
				// add catch해서 추가 시켜줌
				if (reader == null) {
					break; // null 도달하면 멈춰라
				}
				if (st_reader == null) {
					break;
				}

				// 이렇게 하는게 맞나......
				String[] scores = reader.split(":");
				String[] names = st_reader.split(":");
				ScoreVO sVO = new ScoreVO();
				sVO.setNum(scores[0]); // scores에는 String이 담긴 상태!!
				// sVO.setName(scores[0].equals("공승일"));
				sVO.setKor(Integer.valueOf(scores[1])); // 각각의 점수를 담은 배열을 valueof에게 주입
				sVO.setEng(Integer.valueOf(scores[2]));
				sVO.setMath(Integer.valueOf(scores[3]));
				sVO.setSum(sVO.getKor() + sVO.getEng() + sVO.getMath());
				sVO.setAvg(sVO.getSum() / 3);

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
		} // try: 파일 읽기가 끝나는 부분

		// 정상적으로 끝나면 scoreList에는 score.txt파일에서 읽은 성적리스트가 들어 있다.

		// scoreList에 학번 00010인 학생의 성적사항을 찾아서 콘솔에 보여라

		// int size = scoreList.size();
		// for (int i = 0; i < size; i++) {

		// ScoreVO sVO = scoreList.get(i);
		// if (sVO.getNum().equals("00010")) {
		// System.out.println("학번:" + sVO.getNum());
		// System.out.println("국어:" + sVO.getKor());
		// System.out.println("영어:" + sVO.getEng());
		// System.out.println("수학:" + sVO.getMath());

		// break;
		// }
		// }

		// 위에랑 같은 코드!! 학번이 00010인 사람의 것 보여라
		for (ScoreVO sVO : scoreList) {
			if (sVO.getNum().equals("00010")) {
				System.out.println("학번:" + sVO.getNum());
				System.out.println("국어:" + sVO.getKor());
				System.out.println("영어:" + sVO.getEng());
				System.out.println("수학:" + sVO.getMath());

				break;
// studentlist에서 학번이 000~인 사람의 것 가져와라 
			}

		}
		System.out.println("성적일람표");
		System.out.println("======================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------");
		for (ScoreVO sVO : scoreList) {
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getSum() + "\t");
			System.out.println(sVO.getAvg());
			if (sVO.getNum().equals("00031")) {
				break;
			}
		}
	}
}
