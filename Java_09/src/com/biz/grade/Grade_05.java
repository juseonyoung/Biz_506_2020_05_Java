package com.biz.grade;

import java.util.Random;

import com.biz.score.Student;

public class Grade_05 {

	public static void main(String[] args) {
		
		int sum=0; //선언문
		for(int i=0; i<100000 ; i++) {
			sum =100; //할당문 ,선언문에 어떤 값이 들어있더라도 sum=100값이 마지막
		}
		System.out.println(sum);
		// sum=100
		
		// i가 10의 8승이 반복될 동안
        // sum=100이 반복됨
		// for문 밖에 sum=0; 선언했으므로
		// 마지막에 할당된 sum=100이 출력됨
		
		
		for(int i =0; i<10; i++) {
			System.out.println(sum);
		}
		
		
		
		
		Student student = new Student();
		
		// Student 클래스에 선언된 make() 메서드를 호출하기
		student.make();
		String strN = student.getName();
		
		/* public class Student {
		 *       String strName = "홍길동";
			
			     public void make() {
				
				     strName = "이몽룡"; 
				 }    
				 strName => 이몽룡, {} 밖 strName="홍길동"이라는 변수에 저장된
				           요소가 있고, 마지막에 저장된 값이 이몽룡이므로 
				           이몽룡이 출력된다.
			 
			 	 public String getName() {
			 	      return strName;
		         }
		  }       
		 * 
		 */
		
		System.out.println(strN);
		
		
		Random rnd = new Random();
		
				
		
		
	}
}
