package com.biz.addr.scanner;

import java.io.InputStream;
import java.util.Scanner;

public class ScanEx_01 {

	/*
	 * 화면에 메뉴를 보여주고
	 * 키보드로 선택을 하면 해당하는 코드를 실행
	 */
	public static void main(String[] args) {
		
		// 콘솔에 어떤 값을 출력
		System.out.println();
		
		// 키보드로부터 전송되어 온 이진수를 알아 볼 수 있는 데이터코드로 변환

		// 키보드로 문자(열)를 입력하는 동안 그 데이터 코드를
		// 임시 저장장치(Buffer)에 저장하고 있다가
		// 엔터 누르는 순간 Scanner에게 입력이 완료되었음을 알려주는 역할 수행
		InputStream in = System.in;

		// InputStream을 Scanner()에 연결하면
		// InputStream으로부터 전송되어 온 데이터 코드를 
		// 실제의 문자열로 변환시키는 역할을 수행한다.값을 스캐너에 주입
		
		// InputStream 입력 완료되었다는 신호를 보내오면
		// Scanner는 Buffer에 저장된 데이터코드를 읽어서 (스캔)
		// 문자열로 변환시킨다.
		Scanner scan = new Scanner(in);
		
		// nextLine()이 호출되면 코드는 여기에서 잠시 멈추고 있으면서
		// 키보드에서 문자열이 입력되고 엔터가 눌리면
		// scanner를 통해서 문자열을 가져오는 역할을 수행한다.
		
		// 입력을 기다리면서 코드가 잠시 wait되는 현상을 blocking 되었다고 한다.
		scan.nextLine();
		
		
		
		
		
	}
}
