package com.biz.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.book.domain.BookVO;

public class BookServiceImplV1 implements BookService {
	// interface를 implement하면 정의된 메서드를 모두 override 하여 구현해야 하는
	// 규칙이 적용된다
	// implements 수행 다음에는 반드시 add umimplements method를 실행하여야 한다.
	/*
	 * BookService interface를 implements 하여 작성 구체적인 method의 코드를 작성해야 한다
	 * 
	 */

	protected List<BookVO> booklist;
	protected Scanner scan;

	public BookServiceImplV1() {
		booklist = new ArrayList<BookVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public boolean inputBook() {
		//while(true) 
		// inputBook 메소드 안에서만 스캐너 쓸 것 같으면
		// 메서드의 지역변수로 선언, 초기화 해도됨( 장점: inputBook() method의 수행이 끝나면
		// 변수가 자동으로 해제는 효과를 낼 수 있다
		//Scanner scan =new Scanner(System.in);
		
		BookVO bookvo = new BookVO();
		// 제목 입력할 칸이 나옴
		System.out.println("제목(END를 입력하면 종료됩니다) >>");
		String title = scan.nextLine();
		if(title.equals("END")) {
			return false; //END입력시 호출한 곳에 종료를 알림
		}
		bookvo.setTitle(title);
		
		System.out.println("출판사를 입력해주세요 >>");
		String comp =scan.nextLine();
		bookvo.setComp(comp);
		
		System.out.println("저자를 입력해주세요 >>");
		String writer=scan.nextLine();
		bookvo.setWriter(writer);
		
		
		// 연도와 가격을 문자로 입력하면?
		// 다시 되돌려서 입력하도록 해보기..
			
		// bookList.add(bookVO) 코드 실행전에 return true 실행하면
		// 현재 method가 실행되면서 입력했던 도서정보(도서명, 출판사 등)들이
		// 아직 추가되기 전이므로 입력된 정보는 모두 무시되어 버린다.
		//main에서는 true가 return 되었으므로 아무런 판단없이 다시 입력을 수행하는 
		// inputBook() method를 호출하게 될 것이고 
		// return 전에 현재 도서를 다시 입력하라는 메시지를 보여주었으므로
		// 입력하는 사용자는 당연히 현재 입력하던 도서를 다시 입력하게 될 것이다.
			
		System.out.println("가격을 입력해 주세요>>>");
		String price =scan.nextLine();
		
		int intPrice=0;
		try {
			intPrice= Integer.valueOf(price);
		} catch (Exception i) {
			System.out.println("가격은 숫자만 입력이 가능합니다");
			System.out.println(bookvo.getTitle());
			// 이 코드는 사용자에게 편의를 위해 알려주는 정보!!!!!!!!
			// 이전까지 정보는 저장되었으니 ㅇㅇ책부터 입력하던걸 알려주고 
			// 다시 입력해라 알려주는 
			return true;
		}
		bookvo.setPrice(intPrice);
		
		
		System.out.println("출판연도를 입력해주세요 >>");
		//domain 클래스에서 필드변수를 int로 지정했기 때문에
		// 입력받은 문자열을 숫자로 바꿀 필요가 있다.
		String year =scan.nextLine();
		
		int intYear=0;
		try {
			intYear= Integer.valueOf(year);
		} catch (Exception e) {
			/*
			 * 만약 연도를 문자열로 입력해서 아래 오류문이 뜬다면
			 * 현재 입력하고 있는 도서정보를 도서명부터 다시 입력하도록
			 */
			System.out.println("출판연도는 숫자만 입력이 가능합니다."
					+"다시 입력해 주세요");
			
			
				
			System.out.println(bookvo.getTitle()+"도서정보부터 다시 입력해주세요");
			return true;
		}
			
			bookvo.setYear(intYear);
			// 리스트에 add 되기 전에 return하여 다시 정보를 담는다
			
			//continue;
			//System.out.println("minus(-) 값을 입력해 보세요...");
		//bookvo.setTitle(title);
		
		booklist.add(bookvo);
		 // 모든 항목이 입력완료되고 다음 도서 정보를 입력받겠다는 신호를
		// 호출한 곳에 return하는 것!!
		
		
		return true;
	}
	

	public void booklist() {
		// TODO Auto-generated method stub
		

	}

}
