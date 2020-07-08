package com.biz.bank.service;

import java.io.File;

// V2를 상속받음으로 해서 아래 메서드들이 사용가능해짐
// V2에는 inputBalance(), outputBalance()와
// loadBalance(), saveBalance() 메서드를 사용가능하다

public class BankServiceImplV3 extends BankServiceImplV2 {

	private String accNum = "";
	private String basePackage = "";

	// 사용자로부터 계좌번호를 입력받은 역할을 수행한다
	public boolean account() { // 파일이름을 준비하는 method

		// balance 파일의 상위 패키지의 주소
		// 출력완료 후 F5 새로고침 하면 이 패키지내에 txt 파일이 생성된다.
		basePackage = "src/com/biz/bank/exec/data";

		System.out.print("계좌번호 입력( 정수값 5자리 이내)");
		accNum = scan.nextLine();

		try {
			// 정상적으로 입력된다면 BALANCE-00001.txt 형식으로 출력될 것
			accNum = String.format("BALANCE-%05d.txt", Integer.valueOf(accNum));
		} catch (Exception e) {
			System.out.println("계좌번호는 정수 5자리 이내 값만 가능합니다");
			return false;
		}
		
		
		this.bFileName = basePackage + File.separator + accNum;

		// "src/com/biz/bank/exec/data" 문자열과 계좌번호 파일 문자열을 연결하여
		// "src/com/biz/bank/exec/data/BALANCE-00001.txt라는 파일 객체로 생성
		// 그 객체가 생성한 파일이름을 추출하여 bFileName 필드변수에 저장해 놓는다.
		// File file = new File(basePackage, accNum);

		System.out.println("계좌파일" + bFileName);
		this.loadBalance(); // 새로 입력된 계좌번호에 해당하는 정보 로딩!
		return true;
	}

}
