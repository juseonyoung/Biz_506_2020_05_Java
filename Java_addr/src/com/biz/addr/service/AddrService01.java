package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.addr.domain.AddrVO;

public class AddrService01 {

	// List<AddrVO> addList 필드변수 선언
	// 현재 AddrService01 클래스를 선언하면서
	// addrList 라는 필드변수를 선언'만'한 상태
	// 선언만 된 필드변수 중에 객체형태의 변수는 그 변수에 값을 저장, 추가하려고 하면
	// NullPointerException이 발생하면서 코드가 진행되지 않는다.

	// 객체형태의 변수란 클래스를 사용하여 선언된 변수들
	// int, float, boolean, double 등 기본형태 변수 이외의 형태로 선언된 변수들

	// List<AddrVO> addrList; //선언'만'한 상태

	// 초기화 방법1 추천은 아님 (메모리 관리상 문제 일으킬 가능성)
	// 필드변수 선언과 동시에 초기화
	private List<AddrVO> addrList = new ArrayList<AddrVO>();

	// 초기화 방법2
	// 생성자 이용하여 필드변수 초기화 하기(권장)

	// 클래스의 기본 생성자를 임의로 재 작성하기
	// 누군가 AddrService01 클래스를 객체로 선언하고 초기화 하기 위해
	// 생성자를 호출하면 자동으로 addrList 필드변수가 초기화 되어
	// 이후의 코드에서 nullpointerException이 발생하는 것을 방지한다.
	public AddrService01() {
		this.addrList = new ArrayList<AddrVO>();
	}

	// 초기화 방법3
	// 사용직전 초기화(권장x)
	// 유지보수가 어렵기 때문에 권장하지 않는다.

	// makeAddr() 메서드를 만들고 5명의 임의의 주소를 만들어 addList 필드변수에 추가
	public void makeAddr() {
		// 3. 사용직전 필드변수 초기화
		addrList = new ArrayList<AddrVO>();

		// 1명의 주소를 저장할 VO 객체(인스턴스)
		// AddrVO 클래스를 사용하여 addrVO 객체 선언하고 생성자 method를 호출하여 객체 초기화
		// 초기화(사용가능 하게 한다)
		// method 안에서 객체 선언
		AddrVO addrVO = new AddrVO();

		addrVO.setName("홍길동");
		addrVO.setTel("010-222-3333");
		addrVO.setAddr("광주광역시");
		addrVO.setAge(20);
		addrVO.setNet("친척");

		// 리스트에 추가
		// 한사람의 주소록이 addrVO에 추가된다

		// 새로 생성한 주소(VO)를 주소록(List)에 추가하기
		addrList.add(addrVO);

		// 또 한명의 주소를 저장할 VO객체 만들기
		// 이미 만들어진 addrVO를 활용(재정의)한다
		// 홍길동 주소를 담은 addrVO를 새롭게 재 정의하여 저장공간을 비워준다
		// 이전에 만들어진 객체(인스턴스) 재활용하기 위해서는 반드시 다시 생성한다
		addrVO = new AddrVO();
		addrVO.setName("이몽룡");
		addrVO.setTel("010-222-9999");
		addrVO.setAddr("부산광역시");
		addrVO.setAge(28);
		addrVO.setNet("친구");
		addrList.add(addrVO);

		// 3번째 인물의 주소록
		addrVO = new AddrVO();
		addrVO.setName("조유미");
		addrVO.setTel("010-222-1199");
		addrVO.setAddr("경기도");
		addrVO.setAge(28);
		addrVO.setNet("친구");
		addrList.add(addrVO);

		// 4번째 인물의 주소록
		addrVO = new AddrVO();
		addrVO.setName("서보라");
		addrVO.setTel("010-222-0813");
		addrVO.setAddr("전남 순천");
		addrVO.setAge(28);
		addrVO.setNet("선배");
		addrList.add(addrVO);

		// 5번째 인물의 주소록
		// 데이터 저장 시 저장할 값이 정확할 때는 이런 방식
		addrVO = new AddrVO();
		addrVO.setName("윤수연");
		addrVO.setTel("010-222-7845");
		addrVO.setAddr("전남 담양");
		addrVO.setAge(55);
		addrVO.setNet("母");
		addrList.add(addrVO);

		// 위에 코드랑 비교
		// 많은 데이터를 입력 할 때는 이게 더 편함 그래서 필드생성자 사용!!
		addrVO = new AddrVO("성춘향", "010-11-545", "남원시", 16, "조카");
		addrList.add(addrVO);

		addrVO = new AddrVO("성춘향", "010-11-545", "남원시", 16, "조카");
		addrList.add(addrVO);

		addrVO = new AddrVO("성춘향", "010-11-545", "남원시", 16, "조카");
		addrList.add(addrVO);

		addrVO = new AddrVO("성춘향", "010-11-545", "남원시", 16, "조카");
		addrList.add(addrVO);

		addrVO = new AddrVO("성춘향", "010-11-545", "남원시", 16, "조카");
		addrList.add(addrVO);

		addrVO = new AddrVO("장보고", "010-555");
		addrList.add(addrVO);

	}

	// 주소록 출력하는 method
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
