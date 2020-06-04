package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();

		Random rnd = new Random();

		// 난수 100개를 담음
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;

			intList.add(num);
		}

		// 검색 알고리즘(search algorithme)
		// 리스트 또는 배열의 처음부터 순차적으로 하나씩 비교하면서
		// 값을 찾다가 값이 있으면 위치를 알려주고 검색을 중단하는 방식
		// 리스트의 데이터가 무작위로(순서가 없이) 저장되어 있을 때
		// 비교적 쉽게 찾을 수 있는 방식
		// 하지만 찾고자 하는 값이 제일 마지막 위치에 있을 때는
		// 전체 리스트를 모두 비교해야 하기 때문에 효율성이 없다.
		// 값이 제일 처음에 있을 때는 최고의 효율을 보인다.

		for (int i = 0; i < 100; i++) {
			int num1 = intList.get(i); // i는 정수만 담을 수 있다.
			if (num1 == 55) { // num1==55라는 값을 담은 것을 변수 i는 알고 있다.
				System.out.printf("%d\t", i);
				break; // 55를 찾으면 if를 끝내도록 한다
			}

		}

		// 정수 중 55가 최초로 출력되는 값?

	}
}
