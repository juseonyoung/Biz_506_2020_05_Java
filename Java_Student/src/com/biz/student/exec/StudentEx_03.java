package com.biz.student.exec;

import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV5;

public class StudentEx_03 {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		StudentService sService = new StudentServiceImplV4();
		while (1 == 1) {
			if (!sService.inputStudent()) {

				break;
			}
		}
=======
		StudentService sService = new StudentServiceImplV5();
>>>>>>> dc5360f5d8db09998eabec0ee24a5392bfbb42d4
		
		sService.inputStudent();
		sService.studentList();
	}
}
