package com.callor.score.exec;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.domain.ScoreVO;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<>();
		
		PrintWriter outPut = null; // = System.out;
		String scoreFile = "src/com/callor/score/exec/Score.txt";

		// 지금부터 outFile 변수에 저장된 파일이름으로
		// text를 기록하기 위해 파일을 만들어라
		try {
			outPut = new PrintWriter(scoreFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		outPut.close();
		System.out.println("완료!");

	}
}
