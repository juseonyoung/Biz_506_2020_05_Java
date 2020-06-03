package com.biz.score.exec;

// 도구 하나를 쓰기 위해 두번 import
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.score.vo.ScoreVO;

public class ScoreEx_04 {

	public static void main(String[] args) {
		
		//ArrayList 만들기
		// list import하기, util 가져와야 함
		int[] num = new int[3];
		
		// 선언을 할 때는 List사용하여 선언하고
		// 초기화를 할 때는 new ArrayList() 사용하여 생성한다.
		
		// str1과 int1은 "개수가 정해지지 않은" (배열[]과 다른점)
		// 특별한 배열과 같은 존재가 된다.
		// List type의 인스턴스, List type의 객체, str1 리스트라고 부른다.
		
		// String형 데이터 들을 포함할 리스트
		List<String> str1 = new ArrayList<String>(); 
		// size(length)=0인 스트링형 데이터들을 포함할 리스트를 생성하는 명령문
		
		str1.add("대한민국"); //명령문 한줄에 사이즈가 +1씩 늘어남
		// add라는 메서드를 호출하면서 데이터를 매개변수로 전달하면
		// 필요할 때마다 사이즈가 1씩 증가하는 리스트로 변경된다.
		str1.add("우리나라");
		str1.add("Republic of Korea");
		str1.add(""+90); 
		
		// 리스트타입의 인스턴스,int1의 이름을 가진 리스트
		// integer형 데이터 들을 포함할 리스트
		List<Integer> int1 = new ArrayList<Integer>();
		int1.add(100);
		int1.add(5252);
		
		// char1 리스트
		// 캐릭터형 데이터들을 포함할 리스트
		// Generic : <> 안에 들어가는 키워드 문법형식이다.
		//           리스트의 타입을 결정짓는다.
		
		List<Character> char1 = new ArrayList<Character>();
		char1.add('A');
		char1.add('가');
		char1.add('5'); //문자! 두자리수는 담을 수 없다
		
		
		// boolean형 데이터들을 포함할 리스트 b1이라고 부름
		List<Boolean> b1 = new ArrayList<Boolean>();
		
		// f1리스트라고 부르며 float형 데이터들을 포함할 리스트이다
		List<Float> f1 = new ArrayList<Float>();
		
		// 더블형 데이터들을 포함할 리스트 d1
		List<Double> d1 = new ArrayList<Double>();
		
		// long형 데이터들을 포함할 리스트 l1
		List<Long> l1 = new ArrayList<Long>();
		
		// 개발자가 작성한 ScoreVO 클래스 type의 인스턴스를
		// 포함할 수 있는 리스트
		// JDK에서 제공하는 타입 넣을 수 있다.(랜덤클래스 타입의 인스턴스)
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<Random> rndList = new ArrayList<Random>();
		
		
		// java 1.8이상에서는 
		// 초기화 코드(new ArrayList)에는 Generic을 생략할 수 있다.
		// 그래서 뒤 꺽새에서는 생략가능
		List<ScoreVO> score18 = new ArrayList<>();
		
	}
}
