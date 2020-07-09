package com.biz.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService {

	// 필드변수에 선언해서 메서드에 공통적으로 가져다 씀
	// 필드변수 -class scope의 변수를 선언하기
	// 이 자리에 선언!!!!! 현재 클래스의 모든 method들이 공유하고, 참조(쓰기, 읽기)가 가능!
	// 변수를 선언할 때 어디에 선언하느냐에 따라 변수를 참조할 수 있느냐 없느냐가 결정된다.
	// 변수의 scope
	
	// 접근제한자는 public private protected 중에 한가지로 설정할 수 있다.
	// 필드변수를 선언할 때 가급적 public으로 선언하는 것은 '지양'
	// 그 이유는 public으로 선언하면 외부에서 필드변수에 직접 접근하여 값을 변형시킬 수 있다.
	// 그러면 예기치 못한 결과를 얻을 수 있다.
	
	// 필드변수를 private으로 선언하는 것은 객체의 정보은닉, 캡슐화 패턴에 적합한 방식이다.
	// 외부에서 접근하지 못하도록 차단하고 현재 클래스에 선언된 method에서만 접근을 허용하는 것이다.
	// 혹시 필드변수를 외부에서 접근할 필요가 있는 경우 getter setter를 만든다
	
	// 필드변수를 protected로 선언하기
	// protected는 private 접근제한자와 거의 유사한 형태이다.
	// 만약 현재 클래스를 다른 클래스 만들 때 "상속(extends)"하여 사용하려 고 할 때
	// 상속받은 클래스에서 현재 클래스의 필드변수를 같이 상속받아 사용하고자 할때 사용한다.
	// 현재 클래스에서는 private처럼 작동하고 상속받은 클래스에서도 마치 자신이 변수를 선언한 것처럼 사용할 수 있게된다.
	
	// 현재 클래스를 상속할 수 있도록 생각하고 구현한다면 필드변수를 protected로 선언한다.
	// 만약 private으로 선언하게되면 상속받은 클래스에서 이 변수들을 다시 선언해 주어야 한다.
	
	protected List<StudentVO> studentList; // 변수 studentList 를 필드변수에 선언하고
	// 어떤 메서드들이 아래에 만들어지든지 사용할 수 있다.
	protected Scanner scan;

	
	
	
	
	// 클래스 생성자
	// 클래스를 객체(인스턴스)로 만들 때 호출되는 method
	// 클래스를 객체로 생성할 때 1번 호출되는 method로 반드시 생성(초기화)이 필요한 필드변수들을 여기에서 생성하는
	// 코드를 만들어 준다.
	public StudentServiceImplV1() {
		studentList = new ArrayList<>();

	}

	@Override
	public boolean inputStudent() {
		scan = new Scanner(System.in);
		StudentVO st = new StudentVO();

		System.out.print("학번을 입력해 주세요>> (END:입력종료)");
		String num = scan.nextLine();
		if (num.equals("END")) {
			return false;
		}
		
		
		int intNum = 0; // try 안에 들어가면 선언 안되기 때문에 밖에서 선언
		try {
			intNum = Integer.valueOf(num);
		} catch (Exception e) {
			System.out.println("학번은 숫자만 입력이 가능합니다");
			System.out.println("다시 입력해 주세요");
			return true;
		}
		st.setNum(num);

		System.out.print("성명을 입력해 주세요>>");
		String name = scan.nextLine();
		st.setName(name);

		System.out.print("학년을 입력해 주세요>>");
		String grade = scan.nextLine();

		// 현재 입력된 정보가 정상범위에 있는 지 검사하여 데이터를 사용여부를 결정
		// 여기서 int 한번 선언
		int intGrade = 0;
		try {
			intGrade = Integer.valueOf(grade);
		} catch (Exception e) {
			System.out.println("학년은 숫자만 입력이 가능합니다");
			System.out.println("학번 정보부터 다시 입력해 주세요");
			return true;
		}
		
		// !!!!!!!!!!!!!!!!!!!!1유효성 검사!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// 개발자 입장에서는 귀찮지만 사용자 입장에서는 편리함
		if(intGrade <1 || intGrade >4) {
			System.out.println("학년은 1~4까지만 가능");
			System.out.println(st.getName()+"학생정보를 다시 입력해주세요");
			return true;
		}
		st.setGrade(intGrade);

		System.out.print("전공을 입력해 주세요>>");
		String dept = scan.nextLine();
		st.setDept(dept);

		studentList.add(st);

		// 제일 끝의 return문은 한 학생의 정보가 모두 정상입력되면 true를 리턴하여
		// 다음 학생의 정보를 입력하도록 호출한 곳에 통보(리턴)해야 하는데 이 때 true를 return 하도록 한다.
		return true;
	}

	@Override
	public void studentList() {
		int size = studentList.size();

		System.out.println("학생 정보 리스트");
		System.out.println("=================================================");
		System.out.println("학번\t성명\t학년\t전공호호");
		System.out.println("-------------------------------------------------");

		for (int i = 0; i < size; i++) {
			StudentVO sd = studentList.get(i); // List에서 get(i)해서 불러와야 함
			System.out.print(sd.getNum() + "\t");
			System.out.print(sd.getName() + "\t");
			System.out.print(sd.getGrade() + "\t");
			System.out.println(sd.getDept());

		}
		System.out.println("------------------------------------------------");

	}

}
