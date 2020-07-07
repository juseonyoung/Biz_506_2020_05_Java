package com.biz.student.service;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.biz.student.domain.StudentVO;

// ImplV1에 정의된 필드변수, method를 상속받아서 작성하는 클래스
// 필드변수와 method는 public, protected 로 되어있는 경우만 상속된다!!
public class StudentServiceImplV2 extends StudentServiceImplV1 {

	
	protected PrintStream outPut;
	
	// V1에 선언된 studentList 는 protected되어 있기 때문에
	// 그대로 접근이 가능하고 V1의 생성자에서 생성(초기화) 되어 있기 때문에
	// V2에서는 그냥 접근하여 읽기, 쓰기를 수행하면 된다.

	// V1에서 구현된 studentList() method를 다시 새롭게 구현하겠다
	// source- override
	// List를 콘솔에 보여주는 방식보다는 결과를 파일에 저장하여 프로젝트가 종료되어도 언제든지 볼 수 있다.
	// 데이터, 결과를 파일로 저장하는 것은 결과를 영구보관하는 목적이 있다. persistance 연속성↑

	public StudentServiceImplV2() {
		String studentFile = "src/com/biz/student/exec/student_list.txt";
		// exception handling 예외처리
				// 파일작성 과정에서 아무리 코드를 잘 작성하더라도 운영체제 상 생기는 예외를
				// 코드에서 처리하기 어려움을 compiler가 알고 있음
				// 개발자에게 의무적으로 exception처리를 하도록 규정하고 있다
				
				try {
					outPut = new PrintStream(studentFile); //의무적으로 try-catch
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(studentFile + "파일을 만들 수 없습니다!");
					return;
				}
	}
	public void studentList() {

		System.out.println("콘솔에 데이터 출력하기");


		outPut.println("=========================================================");
		outPut.println("학생일람표");
		outPut.println("=========================================================");
		outPut.println("학번\t이름\t학년\t학과");
		outPut.println("---------------------------------------------------------");

		for (StudentVO sVO : studentList) { // 굳이 왜 이렇게.....

			outPut.print(sVO.getNum() + "\t");
			outPut.print(sVO.getName() + "\t");
			outPut.print(sVO.getGrade() + "\t");
			outPut.println(sVO.getDept());
			//outPut.print();

		}
		outPut.println("---------------------------------------------------------");
		outPut.close();
	}
}
