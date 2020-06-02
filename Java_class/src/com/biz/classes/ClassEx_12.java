package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankServiceV2;

public class ClassEx_12 {

	public static void main(String[] args) {
		
		BankVO[] banklist = new BankVO[5];
		
		banklist[0] = new BankVO();
		banklist[1] = new BankVO();
		banklist[2] = new BankVO();
		banklist[3] = new BankVO();
		banklist[4] = new BankVO();
		
		banklist[0].setStrdate("2020-05-01");
		banklist[1].setStrdate("2020-05-02");
		banklist[2].setStrdate("2020-05-03");
		banklist[3].setStrdate("2020-05-04");
		banklist[4].setStrdate("2020-05-05");
		
		for(int i =0; i<banklist.length; i++) {
		banklist[i].setStrnum("001");
		}
		
		banklist[0].setIntInput(5000);
		banklist[2].setIntInput(5000);
		
		banklist[1].setIntOutput(1000);
		banklist[3].setIntOutput(1000);
		banklist[4].setIntOutput(1000);
		
		for(int i=0; i<banklist.length; i++) {
		banklist[0].setIntValance(5000);
		banklist[1].setIntValance(4000);
		banklist[2].setIntValance(9000);
		banklist[3].setIntValance(8000);
		banklist[4].setIntValance(7000);
		
		}
		// 기본형 <변수들>
		// primitive variable
		int num =0; //integer형 변수 num를 선언하고 0으로 클리어한다
		long num1=0L; //long형 변수 num1을 선언하고 0으로 클리어
		float num2 =0.0f;
		double num3=0.0;
		boolean bYes= false;
		char char1= 'c'; // character형 변수 char1 선언하고 문자 c를 저장
		
		// String(문자열)형 변수는 변수처럼 사용하지만 실제로는 일반변수와 달리 
		// String 클래스로 만든 string형 인스턴스라고 해야한다.
		
		String strName = "홍길동";
		// String strName = new String("홍길동"); 컴파일 과정에서 이렇게 바뀜
		
		String strNation = new String();
	
		// BankserviceV2 클래스 사용해서 bankservice라는 변수를 선언
		// bankservice 변수를 객체 또는 인스턴스라고 한다.
		
		BankServiceV2 bankservice = new BankServiceV2();
		// 클래스 선언하고 new클래스() 초기화
		// bankservice인스턴스를 통해서 bankservice() method를 호출하면
		// V2클래스내에 정의된 banklist() method 내의 코드들이 순서대로 실행된다.
		
		bankservice.banklist(); //V2 클래스의 system이 작동된다.
		
		bankservice.banklist(banklist);
		
		
	}
}
