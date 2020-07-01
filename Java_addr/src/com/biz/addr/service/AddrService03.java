package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.addr.domain.AddrVO;

public class AddrService03 {

	private List<AddrVO> addrList;

	private Scanner scan = new Scanner(System.in);

	public AddrService03() {
		addrList = new ArrayList<AddrVO>();

		scan = new Scanner(System.in);
	}

	/*
	 * 현재 코드는 main에서 지정된 for 반복문의 개수만큼 입력을 수행해야 한다.
	 * 만약, 입력하는 도중 입력을 중단하고 싶을 때 중단하도록 코드를 개선하자..
	 * boolean 쓰려면 끝에 return true;
	 * 
	 * 입력도중에 이름항목 대신 END 문자열을 입력하면 입력을 중단한다.
	 * 
	 */
	public boolean inputAddr() {

		System.out.println("이름(중단:END) >> ");
		String strName = scan.nextLine();

		System.out.println("입력값:" +strName);
		// 만약 이름 입력할 때 문자열 END 를 입력하면 더이상 진행하지 말고
		// false를 return하고 method를 중단하라
		//if(strName == "END") { //문자열은 절대 ==로 비교 안됨! 별도의 method 통해 비교
			// 왜냐하면 1000번 중에 한번은 false가 날수도 있다.
		if(strName.equals("END")) {
			return false;
		}
		
		
		System.out.println("전화번호 >>");
		String strTel = scan.nextLine();

		System.out.println("주소 >>");
		String strAddr = scan.nextLine();

		System.out.println("나이 >>");
		String strAge = scan.nextLine();

		int intAge = 0;
		try {
			intAge = Integer.valueOf(strAge);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("나이는 숫자만 가능합니다");
			System.out.println("나이 입력이 잘못되어 0으로 임시 저장합ㄴㅣ다.");
		}

		System.out.println("관계 >>");
		String strNet = scan.nextLine();

		AddrVO addrVO = new AddrVO();
		addrVO.setName(strName);
		addrVO.setTel(strTel);
		addrVO.setAddr(strAddr);
		addrVO.setAge(intAge);
		addrVO.setNet(strNet);

		addrList.add(addrVO);
		return true;
	}
	
	public void addrList() {

		System.out.println("=====================================");
		System.out.println("주소록");
		System.out.println("=====================================");
		System.out.println("이름\t전화번호\t주소\t나이\t관계");
		System.out.println("-------------------------------------");

		// i< 5는 5명의 주소록을 표시할 때는 문제가 없으나
		// 주소록 데이터의 개수가 변경되면 문제를 일으킨다
		// addList의 개수를 별도의 변수에 담고
		int addrSize = addrList.size();

		// 사이즈 개수만큼 반복문 수행
		for (int i = 0; i < addrSize; i++) {

			AddrVO vo = addrList.get(i);
			System.out.println(vo.getName() + "\t");
			System.out.println(vo.getTel() + "\t");
			System.out.println(vo.getAddr() + "\t");
			System.out.println(vo.getAge() + "\t");
			System.out.println(vo.getNet() + "\n");

		}

	}
}
