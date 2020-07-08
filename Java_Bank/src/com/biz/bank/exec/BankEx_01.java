package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImplV1;
import com.biz.bank.service.BankServiceImplV3;

public class BankEx_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BankService bService = new BankServiceImplV3();

		while (true) {

			System.out.println("----------------------------------------------------------");
			System.out.println("빛고을 뱅크 계정계 시스템 V1");
			System.out.println("----------------------------------------------------------");
			System.out.println("1.입금처리");
			System.out.println("2.출금처리");
			System.out.println("3.입출금 내역 출력");
			System.out.println("-1. 업무종료");
			System.out.println("----------------------------------------------------------");
			System.out.println("업무선택 >>>");

			String strMenu = scan.nextLine();
			int intMenu = 0;

			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴선택은 숫자로만 입력하세요");
				continue; // 반복문을 처음으로 되돌림
			}

			if (intMenu == -1) {
				break;
			} else if (intMenu < 1 || intMenu > 3) {
				System.out.println("선택된 업무가 없습니다!");
				continue;
			}

			((BankServiceImplV3)bService).account(); // 호출되지 않는 메서드
			//interface되어있지 않으므로..
			//interface에 설정되었지 않은 메서드는 이런 식으로 묶어서 호출
			//account메서드는 V3에만 있기 때문!!
			
			if (intMenu == 1) {
				bService.inputBalance();
			} else if (intMenu == 2) {
				// 출금처리
				bService.outputBalance();
			} else if (intMenu == 3) {
				// 입출금내역서
				bService.listBalance();
			}
		}
	}
}
