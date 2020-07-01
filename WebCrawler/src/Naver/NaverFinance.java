package Naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverFinance {

	// static mathod는 static 변수만 사용가능 전역변수
	static String base = "https://finance.naver.com/item/frgn.nhn?code=003620&page=1";

	public static void main(String[] args) throws IOException {

		// connect는 파이썬의 requests.get역할
		// base사이트로 가서 전체 페이지의 소스코드를 가져옴
		// 예외 처리 강제로 해줌 throws IOException(나를 호출한 메서드에게 예외처리 떠넘김)
		//
		Document doc = Jsoup.connect(base).get();

		// elements는 여러 건을 담는 list 타입
		Elements line = doc.select("table.type2 > tbody > tr");
		System.out.println(line);

		// 향상된 for문 for each

		// 가져올 때 jsoup 가져오기!!
		// 가져올때 복수 단수 조심
		for (Element element : line) { // line을 한건씩 꺼내 element에 넣음(46개)
		
			Elements tds = element.select("td"); // tr안의 td만 뽑아라
			if (tds.size() == 9) {
				//System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				 //0번지는 날짜가 들어가있음
				//System.out.println("날짜:"+ tds.get(0).text()); // 0번지 값
				//System.out.println("종가:"+tds.get(1).text());
				//System.out.println("전일비:"+tds.get(2).text());
				//System.out.println("등락률:"+tds.get(3).text());
				//System.out.println("거래량:"+tds.get(4).text());
				//System.out.println("순매매량(기관):"+tds.get(5).text());
				//System.out.println("순매매량(외국인):"+tds.get(6).text());
				//System.out.println("보유주수:"+tds.get(7).text());
				//System.out.println("보유율:"+tds.get(8).text());
			}
		}

	}
}
