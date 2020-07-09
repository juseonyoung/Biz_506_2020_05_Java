package com.biz.grade.exec.data;

import java.util.Scanner;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImplV1;
import com.biz.grade.service.StudentService;
import com.biz.grade.service.StudentServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ScoreService sService = new ScoreServiceImplV1(); // 마지막에 여기최근껄로
		StudentService tService = new StudentServiceImplV1();

		while (true) {

			System.out.println("=================================");
			System.out.println("성적리스트");
			System.out.println("=================================");
			System.out.println("1.학생 정보 입력 서비스");
			System.out.println("2.성적 정보 입력 서비스");
			System.out.println("3.성적 리스트 출력");
			System.out.println("-1.업무종료");
			System.out.println("=================================");
			System.out.print("서비스를 선택해 주세요 >>");

			String strMenu = scan.nextLine();
			int intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴 선택은 숫자로 입력하세요");
				continue; // 처음으로
			}

			if (intMenu == -1) {
				System.out.println("서비스가 종료됩니다");
				break;
			} else if (intMenu > 3 || intMenu < 1) {
				System.out.println("메뉴번호를 선택하세요!");
				continue;
			}

			if (intMenu == 1) { // 학생정보
				tService.inputStudent();
				tService.loadstudentFile();
				tService.studentList();
				tService.savestudentFile();

			} else if (intMenu == 2) { // 성적정보

				sService.inputScore();
				sService.loadScoreFile();
				sService.calcAvg();
				sService.calcSum();
				sService.scoreList();
				sService.saveScoreFile();
			} else if (intMenu == 3) {
				// 학생정보와 성적정보를 합친 메서드가 와야한다

			}

		}
	}

}
