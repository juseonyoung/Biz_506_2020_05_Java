package com.biz.word.statics;

/*
 * 클래스에 정의된 필드변수 또는 method에 static 키워드가 부착되면
 * 이 클래스를 우리는 static 클래스 라고 한다.
 * 
 * static 클래스는 초기화 과정을 수행할 필요 없이 사용 할 수 있다!!
 * SplitPosition sPos = new SplitPosition(); 와 같은 코드를 사용할 필요가 없다.
 * 
 * static 클래스는 프로젝트가 run하는 순간 자동으로 객체를 1번 생성하여 method 기억영역에 보관해둔다
 * "1번"만 생성되기 때문에 메모리 공간을 1번만 차지하는 효과를 내고 프로젝트의 어떠한 클래스,
 * method에서든지 직접 접근하여 사용할 수 있다. 
 * 
 */
public class SplitPosition {

	// 키워드 static!!
	// 두개의 필드변수(public으로 선언)
	
	// final 이 변수는 아무도 접근하지 마라
	// static으로 선언된 변수는 누구나 어디에서든 접근하여 읽기, 쓰기가 가능하기 때문에
	// 만약 변수WORD_ENG를 어딘가에서 0이 아닌 값으로 수정하면 WORD_ENG 변수를 사용해야 할 곳에서 문제가 발생할 수 있다
	// 이러한 변수에는 final 키워드를 붙여 다른 곳에서 읽기만 가능하고 절대 값을 변경할 수 없게 된다.
	
	public static final int WORD_ENG = 0;
	public static final int WORD_KOR = 1;
	
	public static void out(String str) {
		System.out.println(str);
	}

}
