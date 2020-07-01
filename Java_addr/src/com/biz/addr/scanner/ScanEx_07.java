package com.biz.addr.scanner;

import java.util.Scanner;

public class ScanEx_07 {

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
		int intMenu = Integer.valueOf(strMenu); //문자열을 숫자만 쓰면 나올 수 있게 intMenu에 담음
		// Integer.valueOf() method를 이용하여 

		if (intMenu == 1) {
			System.out.println("학생정보 입력처리");
			
		} else if (intMenu == 2) {
			System.out.println("성적정보 입력");

		} else if (intMenu == 3) {
			System.out.println("성적정보 출력");
			
		} else if (intMenu == -1) {
			System.out.println("야 퇴근이다~~");
		}

	}
}
