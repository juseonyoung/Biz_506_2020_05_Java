package com.biz.classes.service;

import com.biz.classes.model.BankVO;

// main method 가 없는 클래스 직접 run할 수 없다.
// main method가 있는 코드에서 클래스를 인스턴스로 선언하고 인스턴스를 통해서
// method를 호출해서 사용한다.

public class BankServiceV2 {

	// method()
	// 어떤 코드들의 묶음을 만들어두고 사용할 때 한 두줄의 명령문만으로
	// 기능을 수행하고자 할때 작성하는 코드
	
	public void banklist() {
		// banklist()라는 메서드에 묶고 {}안의 내용 호출할 때 사용한다
		System.out.println("4");
	}
	
	// BankVO 클래스로 생성한 인스턴스에 담긴 데이터들을
	// 매개변수로 받아서 무언가 처리를 하는 method
	public void banklist(BankVO bankVO) {
		System.out.println("8");
	}
	
	// BankVO클래스로 생성한 인스턴스 "배열"에 담긴 데이터들을
	// 매개변수로 받아서 무언가 처리를 하는 method
	public void banklist(BankVO[] banklist) {
		System.out.printf("계좌번호\t날짜\t입금\t출금\t잔액\n");
		
		// banklist에 담긴 인스턴스 배열 개수만큼 반복문을 실행하라
		int sum=0;
		
		for(int i =0; i<banklist.length; i++) {
			
			sum+= banklist[i].getIntInput();
			sum-=banklist[i].getIntOutput();
			
			System.out.printf("%s\t %s\t %d\t %d\t %d\t\n",
					banklist[i].getStrnum(),
					banklist[i].getStrdate(),
					banklist[i].getIntInput(),
					banklist[i].getIntOutput(),
					sum);
			
		}
		
	}
	
	
	
	
	
	
	
	
}
