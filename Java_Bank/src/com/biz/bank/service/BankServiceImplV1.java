package com.biz.bank.service;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.config.Lines;
import com.biz.bank.domain.AccountVO;

public class BankServiceImplV1 implements BankService {

	// 필드변수
	protected List<AccountVO> accountList; //프로텍트 하면 V2에서 굳이 만들지 않아도 사용가능
	protected PrintStream outPut;
	protected Scanner scan;

	public BankServiceImplV1() {

		accountList = new ArrayList<>();
		outPut = new PrintStream(System.out);
		// int numBalance =100000; //(계좌잔액)
		scan = new Scanner(System.in);
	}

	// 중복되는 메서드
	// 입금과 출금을 1개의 method로 구현하자
	// 이 method는 BankService interface에 선언되지 않은 method로 
	// bankServiceImplV1 내부에서만 사용하기 위해 구현한 method이다
	// 단, bankserviceimplV1 클래스를 "상속받게 되면" 이 method를 사용할 수 있다
	
	// protected 접근제한자는 이 클래스를 생성하고 사용하는 곳(main())에서는
	// 호출하거나 접근을 할 수 없다.
	// 다만, 이 클래스를 상속받은 클래스에서는 제한적으로 호출하여 사용할 수도 있다.
	protected void keyInput(String inout) {
		
		// 3항연산자!!
		// 조건이 참이면 입금액(true)을 title에 넣어
		// 조건이 거짓이면 출금액(false)을 title에 넣어
		//Scanner scan = new Scanner(System.in);		
		String title = inout.equals("INPUT") ? "입금액" : "출금액";
		
		// 위에 코드랑 똑같음!! 한 조건에 따라 변수1개에 채우고자 할때는 좋은 코드!!
		if(inout.equals("INPUT")) {
			title="입금액";
		}else {
			title = "출금액";
		}
		
		
		// 초기잔액이 100000
		System.out.printf("%s >>", title);
		//System.out.println("입금액을 입력해 주세요 >>");

		String strInput = scan.nextLine();
		
		int inputNum = 0;
		try {
			inputNum = Integer.valueOf(strInput);
		} catch (Exception e) {
			System.out.println("금액은 숫자만 입력이 가능합니다");
			return;
		}
		
		if(inout.equals("OUTPUT")) {
				// 잔액계산
		int balance =0;
		for(AccountVO aVO : accountList) {
			
			balance +=aVO.getInput();
			balance -=aVO.getOutput();
		}
		
		if(balance < inputNum) {
			System.out.println("잔액이 부족하여 출금할 수 없음");
			return;
		}

		}
	
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 2020-07-08
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); // 11:39:00

		String curDate = dateFormat.format(date); // date에 담긴 현재 날짜를 문자열로 변환
		String curTime = timeFormat.format(date); // date에 담긴 현재 시각을 문자열로 변환

		AccountVO aVO = new AccountVO();
		aVO.setDate(String.format("%s %s", curDate, curTime));
		if(inout.equals("INPUT")) {
			aVO.setInput(inputNum); // inputNum은 입금액이 아니라 내가 입력한 값
		} else {
			aVO.setOutput(inputNum);
		}

		accountList.add(aVO);
	}

	@Override
	public boolean inputBalance() { // 초기 계좌를 10만원으로 설정하고 값을 넣으면 더하도록 함 //
		// TODO Auto-generated method stub
		// 날짜 추가
		this.keyInput("INPUT"); 
		return true;
	}

	@Override
	public boolean outputBalance() {
		// TODO Auto-generated method stub
		
		this.keyInput("OUTPUT");
		return true;
	}

	@Override
	public void listBalance() { // 원잔액+인풋-minus
		// TODO Auto-generated method stub
		// 원잔액+input-output
		// 계좌 10만원 여기서 연산
		
		// 숫자를 회계방식 문자열로 표현하기 위한 클래스도구
		//100,000,000
		DecimalFormat df = new DecimalFormat("##,###"); // 숫자를 세자리 단위로 나눠 표현
		String[] listTitle = {"거래일자", "입금액", "출금액","잔액"};

		System.out.println(Lines.dLine);
		System.out.println("001 계좌 입출금 내역서");
		System.out.println(Lines.sLine);
		System.out.printf("%-15s\t|%17s\t|%17s\t|%17s\t|\n", listTitle[0],listTitle[1],listTitle[2],listTitle[3]);
		// 20개 칸을 확보하라 거래일자 쓰고 빈칸 남겨놔라
		// %20s : 문자열을 표현하기 위해 20개의 칸을 만들고 문자열을 채운 후 나머지는 빈칸으로 남겨라
		// 문자열은 20개 칸에서 오른쪽으로 정렬하라 
		// %-20s : 위와 같지만 왼쪽으로 정렬하라 
		System.out.println(Lines.dLine);

		int balance = 0;
		
		String strNumber="";
		
		for (AccountVO aVO : accountList) {
			System.out.print(aVO.getDate() + "\t");
			
			System.out.printf( "%20s\t|", df.format(aVO.getInput()));
			System.out.printf("%20s\t|",df.format(aVO.getOutput())); // 입금

			balance += aVO.getInput();
			balance -= aVO.getOutput();
			System.out.printf("%20s\t|\n",df.format(balance)); // 잔액

		}
		System.out.println(Lines.sLine);
		System.out.println("출력 완료! 아무키나 누르세요!");
		scan.nextLine();
		
	}
}
