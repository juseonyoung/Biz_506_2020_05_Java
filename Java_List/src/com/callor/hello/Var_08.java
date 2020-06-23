package com.callor.hello;

public class Var_08 {

	// 가. 2 ~ 100까지의 정수 중에 소수(Prime)인 정수들을 Console에 모두 출력하시오.
	// ※ 소수(Prime) : 1과 자기 자신 이외의 약수를 가지지 않는 정수. 1과 자기 자신 이외의 숫자(j)로 나누
	// 었을 때 나머지가 0이 아닌 정수

	public static void main(String[] args) {


		for (int i = 2; i <= 100; i++) {

			int j = 0;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) { // 자기 자신 이외의 숫자로 나누어 0으로 떨어지기 때문에 소수가 아님
					break;
					// 만약 4%2 하면 나누어 떨어지기 때문에 빠져나가서 다시 처음for문으로 
					// j<i는 한번씩 다 검토하겠다는 뜻
				}
			}
			
			// 위의 for문에서 i%j==0을 충족시키지 못해 내려온
			// i는 소수이다 
			if (i == j) {
				System.out.println(i + "는 소수");
			}

		}
	}
}
