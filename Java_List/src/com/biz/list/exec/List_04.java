package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();

		Random rnd = new Random();

		// 난수 100개를 담음
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;

			intList.add(num);
		}

		// intList.get(i) method
		// public int get(int i) { return x; ) 형식
		// 정수 55를 만나면 출력하기
		for (int i = 0; i < 100; i++) {
			int num1 = intList.get(i); //i는 정수만 담을 수 있다.
			if (num1 == 55) {
				System.out.printf("%d\t", num1);
			}

			
			// intList.get(i) method 를 호출하여
			//값을 가져오는데 몇번 반복해서 실행해도 항상 같은 값이 리턴 될 것
			// 그럼에도 아래 코드는 같은 일을 두번 실행한다
			// 짧은 코드이나 비효율적이므로
			//intList.get(i)를 새로운 변수에 저장하고 나머지 코드에서 사용하자
			
			if(intList.get(i) == 55){
				System.out.println(intList.get(i));
			}
		}
	}
}
