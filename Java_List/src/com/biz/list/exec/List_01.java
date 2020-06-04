// com.biz.list : 여기 까지 3단계 패키지, base패키지 라고 함
// com.biz.list.exec : 4단계 패키지, 업무적인 분류 나타내는 패키지
package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_01 {

	// 임의의 수 100개 만들어서 이들의 합을 구하라
	public static void main(String[] args) {
		
		// 랜덤 클래스 사용해서 뭔가 수행을 하기 위한 준비
		
		//  Random클래스를 사용해서 rnd인스턴스 선언하고
		//  Random() 생성자를 호출하여 rnd인스턴스를 초기화(new)하라
		// 일반적으로 클래스이름과 생성자 이름이 같다
		    Random rnd = new Random();

		// 인티저 앞에서 하면 뒤에 안해도 됨
		// 인터페이스:
		// 다른 클래스와 다르게 선언하는 클래스와 초기화하는 생성자의 이름이 다르다
		// 클래스에 <generic> 키워드를 포함하여 사용한다.
		// List클래스 사용하여 
		// Integer형 데이터를 포함할 intList를 선언하고 초기화 하는 코드
		// Integer형 리스트 라고 부른다
		// 자바에서 기본 배열형 데이터를 사용하는 데 어려움이 있어서 JDK에서 도구 제공
		// 많은 개수의 데이터를 관리하기 위한 방법    
			List<Integer> intList = new ArrayList<>();
			// 리스트를 처음 만들면 사이즈 값이 0인 데이터가 아무것도 없는
			// 리스트가 만들어진다.
			
			//인스턴스에 .add(정해진 타입); 사이즈가+1 되며 데이터가1개 추가된다
		
			// 데이터를 100개 추가
		for(int i=0; i<100; i++) {
			intList.add(rnd.nextInt());
		}
		
		// 데이터 100개의 값을 더하려면?
		int sum=0;
		for(int i=0; i<100; i++) {
		    sum+=intList.get(i);
		}
		System.out.println(sum);
	}
}
