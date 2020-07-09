package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.config.SplitPos;
import com.biz.grade.vo.StudentVO;

public class StudentServiceImplV1 implements StudentService {

	protected Scanner scan;
	protected List<StudentVO> studentList;
	protected String scoreFile = "";
	protected FileReader fileReader;
	protected BufferedReader buffer;
	protected PrintWriter printwriter;

	public StudentServiceImplV1() {
		scan = new Scanner(System.in);
		studentList = new ArrayList<>();
		scoreFile = "src/com/biz/grade/exec/data/student.txt";
	}

	@Override
	public boolean inputStudent() {

		StudentVO std = new StudentVO();

		System.out.println("학번을 입력하세요 >>");
		String num = scan.nextLine();
		try {
			num = String.format("%05d", Integer.valueOf(num));
			
		} catch (Exception e) {
			System.out.println("학번은 정수 다섯자리 이내 값만 가능합니다");
			System.out.println("다시 입력해주세요");
			return true;
		}

		
		std.setNum(num);

		System.out.println("이름을 입력하세요 >>");
		String name = scan.nextLine();
		std.setName(name);

		System.out.println("학과을 입력하세요 >>");
		String dept = scan.nextLine();
		std.setDept(dept);

		System.out.println("학년을 입력하세요 >>");
		String strgrade = scan.nextLine();
		int grade = 0;
		try {
			grade = Integer.valueOf(strgrade);
		} catch (Exception e) {
			System.out.println("숫자만 입력가능");
			return true;
		}
		std.setGrade(grade);

		System.out.println("전화번호를 입력하세요 >>");
		String tel = scan.nextLine();
		std.setTel(tel);

		studentList.add(std);
		return true;
	}

	@Override
	public void studentList() { // 껍데기!!

		String[] listTitle = { "학번", "이름", "학과", "학년", "전화번호" };
		System.out.println("=============================================================================================");
		System.out.println("학생 정보");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.printf("%8s\t|%8s\t|%8s\t|%8s\t|%8s\t|\n", listTitle[0], listTitle[1], listTitle[2],
				listTitle[3], listTitle[4]);
		System.out.println("---------------------------------------------------------------------------------------------");

		for (StudentVO std : studentList) {
			System.out.printf("%8s\t|", std.getNum());
			System.out.printf("%8s\t|", std.getName());
			System.out.printf("%8s\t|", std.getDept());
			System.out.printf("%8s\t|", std.getGrade());
			System.out.printf("%8s\t|\n", std.getTel());
		}
		System.out.println("=============================================================================================");

	}

	@Override
	public void savestudentFile() { //입력한 학생정보를 저장하는 메서드!!!
		PrintWriter outPut = null;

		try {
			outPut = new PrintWriter(scoreFile);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (StudentVO std : studentList) {

			String stdtInfo = String.format("%s:%s:%s:%d:%s", std.getNum(),
					std.getName(),
					std.getDept(),
					std.getGrade(),
					std.getTel());

			outPut.println(stdtInfo);
		}
		outPut.close();
		System.out.println("정보를 저장했습니다");

	}

	

	@Override
	public void loadstudentFile() {
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

				String[] stds = reader.split(":");

				StudentVO std = new StudentVO();

				std.setNum(stds[SplitPos.STUDENT.ST_NUM]);
				std.setName(stds[SplitPos.STUDENT.ST_NAME]);
				std.setDept(stds[SplitPos.STUDENT.ST_DEPT]);
				std.setGrade(Integer.valueOf(stds[SplitPos.STUDENT.ST_GRADE]));
				std.setTel(stds[SplitPos.STUDENT.ST_TEL]);

				studentList.add(std);
			}

			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없으므로 새로운 파일을 생성합니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
