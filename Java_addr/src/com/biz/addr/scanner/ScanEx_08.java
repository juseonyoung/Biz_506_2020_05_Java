package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("====================================================");
		System.out.println("자바 메뉴 시스템");
		System.out.println("====================================================");
		System.out.println("1. 학생정보 입력처리");
		System.out.println("2. 성적 입력 ");
		System.out.println("3. 성적 출력 ");
		System.out.println("-1.종료");
		System.out.println("----------------------------------------------------");
		System.out.println("업무선택 >>");

		String strMenu = scan.nextLine();
		int intMenu = 0;
		
		// exception handling
		// 예외가 발생할 가능성이 1/100만 확률이라도 있으면 
		// try-catch문을 활용하여 핸들링처리 수행하여 사용자가 app을 사용하는데
		// 혼란을 겪지 않도록 한다!
		try {
			intMenu = Integer.valueOf(strMenu); //이 코드를 실행해봐라...	
		} catch (Exception e) { // exception 이 발생하면 아래처럼 handle해라
			// TODO: handle exception
			System.out.println("입력한 값 :" + strMenu);
			System.out.println("업무 선택은 숫자 1부터 3 또는 -1만 가능합니다!");
			return; // exception이 발생했으니 더 이상 다음으로 코드 진행 불가
			// 그대로 종료하라 
		}
				
		
		if (intMenu == 1) {
			System.out.println("학생정보 입력처리");
			
		} else if (intMenu == 2) {
			System.out.println("성적정보 입력");

		} else if (intMenu == 3) {
			System.out.println("성적정보 출력");
			
		} else if (intMenu == -1) {
			System.out.println("야 퇴근이다~~");
		} else {
			System.out.println("선택된 업무가 없음!");
		}

	}
}
