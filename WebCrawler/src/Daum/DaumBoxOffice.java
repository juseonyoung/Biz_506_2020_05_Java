package Daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DaumBoxOffice {

	//daum에서 크롤링
	// 페이지코드 알수 없고 티켓코드 알려주는 경우
	public static void main(String[] args) throws IOException{
		
		String baseurl= "http://ticket2.movie.daum.net/Movie/MovieRankList.aspx";
		Document doc = Jsoup.connect(baseurl).get();
			
		
		Elements movielist = doc.select("ul.list_boxthumb > li >a");
		
		for( Element movie : movielist) {
			
			String url = movie.attr("href");
			Document movieDoc = Jsoup.connect(url).get();
			
			// 영화 상세페이지가 없는 영화는 제거
			if(movieDoc.select("span.txt_name").size() ==0) {
				continue;
			}
			
			String daumHref =movieDoc.select("a.area_poster").get(0).attr("href");
			String daumCode =daumHref.substring(daumHref.lastIndexOf("=")+1,daumHref.lastIndexOf("#"));
			
			
			// substring 함수!! 앞과 뒤 기준으로 자른다
			String title = movieDoc.select("span.txt_name").get(0).text();
			String cut_title=title.substring(title.lastIndexOf(":")+1, title.lastIndexOf("("));
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("영화제목:"+cut_title);
			System.out.println("URL:"+daumHref);
			System.out.println("영화코드:"+daumCode);
			
			// 선생님 답지
			// String title= cut_title.substring(0, cut_title.lastIndexOf("("));
			
		}
		
	}
}
