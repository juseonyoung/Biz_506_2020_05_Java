package com.biz.hello;

public class VarBoolean_01 {

	public static void main(String[] args) {
		System.out.println(3 == 3); //노란색 줄 무시 T
		System.out.println(3 > 3); //F
		System.out.println(3 < 3); ///F
		System.out.println(3 >= 3); //T
		System.out.println(3 <= 3); //T
		System.out.println(3!=3); //F
		
		// boolean 대수
		// 어떤 값 (A,B) 2개가 각각 true이거나 false인 경우의 값만 가질 수 있는경우
		// 이 값을 boolean 형이라고 표현한다 OR연산하면 아래와 같다
		
		// A와 B 둘 중 하나가 T이면 무조건 T
		// ==============================
		// A       OR    B 	      C
		// ------------------------------
		// false		false   false
		// false		true	true
		// F			T		T
		// T			T 		T
		// ==============================
		
		
		// AND연산은 모든 값이 T일 때만 T로 나타남
		// ==============================
		// A       AND    B 	   C
		// ------------------------------
		// false		false    false
		// false		true	 F
		// F			T		 F
		// T			T 		 T
		// ==============================
				
		
		
		
		
		
		
		
	}
}
