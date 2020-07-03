package com.biz.book.service;

// class아닌 interface로 만들어 메서드들의 원형 정의
public interface BookService {

	/*
	 * input()
	 * 어떠한 정보를 키보드에서 입력받기
	 * 무작정 입력받기도 하고 입력과정에서 END라는 문자열을 입력하면
	 * 입력을 중단한다는 신호를 호출한 곳으로 return한다.
	 * 
	 * input() 에서
	 * 모든 항목입력이 정상적으로 이루어지면 return true
	 * 만약 중단하기 위해 END 문자열을 입력하면 호출한 곳에 false를 return하여
	 * 더 이상 입력을 하지 않겠다고 신호를 보낸다
	 * 
	 * 호출한 곳에 true, falser를 return하기 위해서 input() method 에서는
	 * return 타입을 void에서 boolean으로 변경하였다.
	 * 
	 * 
	 */
	public boolean inputBook(); // 도서정보 입력
	public void booklist(); // 도서정보 출력
}
