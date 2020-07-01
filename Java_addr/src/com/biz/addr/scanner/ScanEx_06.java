package com.biz.addr.scanner;

import java.util.Scanner;

//ScanEx_04 와 비교
// 숫자 입력method와 문자열 입력method 섞어쓰면 나타나는 문제
public class ScanEx_06 {

	public static void main(String[] args) {
		
		System.out.println( 3+4); //숫자의 덧셈
		System.out.println(""+3+4); // 3과 4가 문자열로 바뀌어 34가 됨
		/*
		 * scanner를 이용해서 nextInt(), nextLine()메서드를 섞어 사용하면
		 * 내부 문제로 인한 의도하지 않은 코드진행이 되어 숫자, 문자 모두
		 * 문자열을 입력받는 nextLine() method로 통일하여 사용하게 된다.
		 * 
		 * scanner의 내부 문제에 의한 코드 진행의 문제를 해결하기 위해
		 * 키보드로 부터 값을 읽는 method를 nextLine()만 사용하기로 하였다.
		 * 그런데 숫자를 2개 입력받아 덧셈을 수행한 후의 결과를 보고싶은
		 * 코드로 작성하니 숫자의 덧셈이 아닌 숫자형 문자열의 연결을 만드는
		 * 코드가 되어 버렸다.
		 * 
		 * 만약 키보드에서 입력받은 문자열을 숫자형(int, float)으로 변환할 수 있다면
		 * nextLine()을 사용하여 원하는 결과를 얻을 수 있을 것이다. 
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 >>");
		String strNum1= scan.nextLine();
		
		// Integer.valueOf() method를 사용하여 숫자형으로 된 문자열 데이터를
		// 정수형 데이터로 변환시킴
		// method기억!! 숫자로 변환하고 싶을 때
		int intNum1 = Integer.valueOf(strNum1);
		
		System.out.print("숫자2 >>");
		String strNum2= scan.nextLine();
		int intNum2 = Integer.valueOf(strNum2);
		
		System.out.println(strNum1 + strNum2);
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intNum1+intNum2);
	
		
		System.out.print("문자열 입력 >>"); 
		String strInput = scan.nextLine();
		System.out.println("입력된 문자열 :"+strInput);
		
		
		
		// 먼저 만들어놔
		scan.close();
	}
}
