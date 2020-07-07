package com.biz.student.exec;

import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV5;

public class StudentEx_02 {

	public static void main(String[] args) {

		StudentService sService = new StudentServiceImplV5();

		while (1 == 1) {
			if (!sService.inputStudent()) {

				break;
			}
		}
		sService.studentList();
	}
}
