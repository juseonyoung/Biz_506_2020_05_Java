package com.biz.student.exec;

import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV4;
import com.biz.student.service.StudentServiceImplV5;

public class StudentEx_03 {

	public static void main(String[] args) {
		
		StudentService sService = new StudentServiceImplV4();
		while (1 == 1) {
			if (!sService.inputStudent()) {

				break;
			}
		}
		
		sService.inputStudent();
		sService.studentList();
	}
}
