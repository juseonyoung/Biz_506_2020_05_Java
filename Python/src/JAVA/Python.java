package JAVA;

public class Python {

	public static void main(String[] args) {
		
		//3의 배수 출력하고 합 구하기
		
		int sum=0;
		for(int i =1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}
			System.out.println(sum+"은 3의 배수");
		}
	}
}
