package com.biz.classis;

public class Score {

	public String name;
	
	public int intKor;
	public int intEng;
	public int intMath;
	public int intMusic;
	public int intArt;
	
	public int intSum;
	public int intAvg;
	
	public int sum() { //sum method  int sum에 담긴 값을 return한다
		
		intSum = intKor;
		intSum+= intEng;
		intSum +=intMath;
		intSum +=intMusic;
		intSum +=intArt;
		return intSum; // intSum을 리턴하려면 int sum() 반드시 있어야 한다.
		               // intSum 수행해서 sum에 리턴하여 값 저장
		
	}
	
	public int avg() { //avg method
		
		intAvg = intSum /5;
		return intAvg;
		
		
	}
	
	
	
	
	
	
	
	
	
}
