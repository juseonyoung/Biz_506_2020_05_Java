package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.biz.bank.config.Position;
import com.biz.bank.domain.AccountVO;

/*
 * V2 업그레이드!
 * 프로젝트가 시작될 때 balance.txt 파일을 읽어서 거래내역을 가져오고
 * 입출금업무를 수행하면 입출금 항목을 계속 추가하고 
 * 업무를 종료하면 추가된 입출금 항목을 다시 balance.txt파일에 추가하여 
 * 다음 프로젝트가 시작될 때 그 내용을 유지하도록 하자
 * 
 */
public class BankServiceImplV2 extends BankServiceImplV1 {
	String bFileName="";
	protected PrintWriter printWriter;
	protected Scanner scan;
	// V1을 상속받아서 bankList() 만 이어받아 사용하겠음!

	// input(), output() 메서드는 별도로 구현하겠다
	public BankServiceImplV2() {
		bFileName="src/com/biz/bank/exec/data/balance.txt"; //먼저와야돼
		this.loadBalance();
		PrintWriter printWriter=null;
		scan =new Scanner(System.in);
		
	}

	protected void loadBalance() {
		// 새로운 계좌번호 선택했을 때 새로운 balance정보 가져오기 위해 
		// 기존의 accountList 모두 제거하기 
		accountList.clear();
		
		
		
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(bFileName);
			buffer = new BufferedReader(fileReader);

			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}

				String[] balances = reader.split(",");
				
				AccountVO aVO = new AccountVO();
				aVO.setDate(balances[Position.ACC_DATE]); // 읽은 값의 날짜
				aVO.setInput(Integer.valueOf(balances[Position.ACC_INPUT])); // 읽은 값의 input
				aVO.setOutput(Integer.valueOf(balances[Position.ACC_OUTPUT])); // 읽은 값의 output
				
				accountList.add(aVO);
			}
			buffer.close();
			fileReader.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("계좌가 없으므로 새로운 계좌를 개설합니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean inputBalance() {
		//입력 출력을 가져오고

		
		this.keyInput("INPUT");
		this.saveBalance();
		
		return true;
	}

	public boolean outputBalance() {
		this.keyInput("OUTPUT");
		this.saveBalance();
		return true;
	}

	protected void saveBalance() {
		
		PrintStream outPut =null;
		
		try {
			outPut = new PrintStream(bFileName);
			
			int balance=0;
			for(AccountVO aVO : accountList) {
				
				balance +=aVO.getInput();
				balance -=aVO.getOutput();
				
				//거래일자, 입금, 출금, 잔액
				outPut.printf("%s,%s,%d,%d\n",aVO.getDate(),aVO.getInput(),aVO.getOutput(),balance);
			}
			
			outPut.close(); // 닫아야 저장됨!!!!!!!!!
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
