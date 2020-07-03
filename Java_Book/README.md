# Java_Book
* 도서정보 관리 프로젝트

## 객체(클래스) 추상화
* VO 클래스를 디자인할 때 주로 많이 사용하고 기타 클래스를 디자인할 때도 사용한다

## 추상화를 잘, 쉽게 수행하려면
* 이 프로젝트가 1)무엇을 하려고 하는지
				2) 무슨 연산을 수행하려고 하는지
				
## 도서정보 프로젝트
* 내가 가지고 (구입한) 있는 도서를 어플로 관리 하고자 만든다.
 도서제목, 출판사, 저자, 출판연도, 가격의 항목만 입력하고 도서정보를 관리하기 위한 시작
* 여기서는 도서정보를 구분하는 데 가장 기본적인 항목만 VO로 설정한 상태

## BookVO
* 출판연도, 가격항목의 변수타입을 무엇으로 할 것인가..
  왜 가격을 당연히 int라 생각하는 지 고민 해보아야 한다.
  출판연도는 String,인지 int인지 고민 해보아야 한다.
  
  	1) 단순히 언제 출판되었나만 알고싶을 때->String형
    2) 올해 연도를 입력받아서 도서 출판연도 몇년이나 지났는지 등 연산을 하고싶다면->
    	문자열 보다는 int형
    	
* 출판연도를 String으로 할 경우: 연산 수행하려면 그때마다 문자열을 숫자로 변환하는 절차가 필요하다
* 출판연도를 int로 할 경우 : 별다른 조치없이 바로 연산이 가능하다. 입력할 때 숫자형이 아니면
그에 따른 예외처리(최초에 한번 해주면) 를 수행하여 오류가 나지 않도록 해주어야 한다. 

## 패턴(Pattern)
* 프로그래밍을 할 때 언어의 규칙(문법; type 선언 등)을 정확히 지켜서 코딩을 하지 않으면 컴파일
 실행 등이 원활히 이루어 지지 않는다. 
 * 규칙은 반드시 준수해야만 하는 것들이다
 * 규칙과 달리 패턴(Pattern)은 규칙은 아니지만 마치 공식처럼 많은 개발자들에 의해서
 	"~~~한 방식으로 코딩을 했더니 코딩 생산성이 높아지고 프로젝트 수행이 비교적 쉬워진다"
 	"패턴을 지켜 코딩을 했더니 유지 보수 등 수행할 때도 많은 편리성이 있다"
 	