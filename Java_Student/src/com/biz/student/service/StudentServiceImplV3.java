package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentServiceImplV3 extends StudentServiceImplV2 {

	/*
	 * V2는 V1을 상속받아서 studentList() method를 재정의 (Override) 해놓은 상태 V3에서는 V2를 상속받아서 V2에
	 * 구현된 studentList() method는 그대로 사용하고 V1에 있는 inputStudent() method만 재정의하여 V3를
	 * 만들겠다 라는 의미
	 * 
	 * V3에서는 student.txt 파일을 읽어서 학생정보를 가져오고 studentList() method를 사용하여 출력해보기
	 * 
	 */
	@Override
	public boolean inputStudent() {

		String studentFile = "src/com/biz/student/exec/student.txt";

		// FileReader 클래스로 fileReader 인스턴스 선언하고 null
		// 문자열, 숫자 등이 아닌 정체를 알 수 없는 클래스.. 가급적 null로 clear 시켜주는 것이 좋다.
		FileReader fileReader = null; // null=clear 정체를 알 수 없는 객체 초기화 하는 경우

		// BufferReader 라는 클래스 제공
		// 로컬디스크에 저장된 파일을 읽을 때 FileReader만으로 읽을 수 있지만! ,,
		// 파일을 읽어들이는 성능상의 이점을 주기 위해서 중간에 bufferedreader를 연결하여 파일을 읽는 것이 좋다.

		BufferedReader buffer = null;

		try { // Stream구조
				// 읽어들일 파일을 열고, 파일에 관련된 정보를 fileReader 객체에 저장!!
			fileReader = new FileReader(studentFile);

			// fileReader 객체에 저장된 정보를 buffer관리자에게 전달하여 파일 읽게 함
			// buffer 관리자는 파일을 몽땅 읽어서 자신이 관리하는 buffer장치에 임시보관한다
			buffer = new BufferedReader(fileReader);

			String reader = "";
			// 여기 먼저 빼는 이유!
			// String의 경우 for, while 반복문 내에서 계속 선언하는 것은 메모리 관리상 매우 부적합하기 때문에
			// 문자열 변수는 반복문이 실행되기 이전에 먼저 선언, clear 해주어야 한다.
		
			// 파일의 라인수가 200 개로 정해지고 , 그 라인개수를 알 수 있다면 다음과 같은 코드로 충분히 처리가능
			//for (int i = 0; i < 200; i++) {
				
				
				/// buffer 장치로부터 text 내용을 한줄씩 읽어 들이기~~
			//	reader = buffer.readLine(); // 밑줄 두번째꺼

			//	System.out.println(reader); // 첫번째 줄이 나옴
			//}
			// 하지만 파일은 상황에 따라 라인개수가 변경될 수도 있고, 예측하지 못하는 경우도 있어
			// 반복문을 수행해야 할 횟수를 정하지 못할 수도 있다.
			// 이럴땐 for반복 보다는 while문을 사용하는 것이 좋다.
			while(true) {
				//buffer.readLine() method는 호출될 때마다 buffer로 부터 파일을 한줄씩 읽어 reader 변수에 담는다.
				// buffer로 부터 파일을 읽어오다가 파일을 모두 읽었는데도 불구하고 
				// 또 readLine() method를 호출하면 null 값이 return 되고
				// reader 변수에는 null 값이 담기게 된다.
				// 그러면 reader 변수에 null 값이 담겨 있는 지 확인하여 반복문을 종료한다.
				reader = buffer.readLine();
				
				if(reader == null) { // 아까는 200개를 넘어서서 계속 null을 출력함
					break;
				}
				System.out.println(reader);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}

}
