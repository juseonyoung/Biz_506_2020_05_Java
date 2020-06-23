package Naver;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class NaverBoxOffice {
	public static void main(String[] args) throws IOException {
		String url = "https://movie.naver.com/movie/running/current.nhn";
		String title = ""; // 영화제목
		String score = ""; // 영화평점
		String bookRate = "0"; // 예매율
		String genre = ""; // 영화장르
		String movieTime = ""; // 상영시간
		String openDt = ""; // 개봉일
		String director = ""; // 감독
		String actor = ""; // 영화 출연진
		String naverCode = ""; // 네이버 영화 코드
		Document doc = Jsoup.connect(url).get();
		
		Elements movielist = doc.select("div.lst_wrap > ul.lst_detail_t1 > li");
		for (Element movie : movielist) { //예매율, 감독, 배우가 없는 부분도 있으니까 0으로 두고
			bookRate = "0"; 
			director ="";
			actor ="";
		
		title = movie.select("dt.tit > a").text(); //타이틀은 항상 있음
			
		if (movie.select("span.num").size() == 2) { //예매율이 있으면
			bookRate = movie.select("span.num").get(1).text();
		}
		score = movie.select("span.num").get(0).text(); 
		genre = movie.select("dd > span.link_txt").get(0).text();
		
		
		String temp = movie.select("dl.info_txt1 > dd").get(0).text();					
		int beginTimeIndex = temp.indexOf("|");
		int endTimeIndex = temp.lastIndexOf("|");
			
		if(beginTimeIndex == endTimeIndex) { //3칸으로 나눠진 경우
			movieTime = temp.substring(0,endTimeIndex); 
		} else { // 장르나 개봉시간 개봉일 중 2개나 하나만 있는 경우
			movieTime = temp.substring(beginTimeIndex+2, endTimeIndex);
		}
		
		// 0: 없음, 1: 있음
		int dCode = 0; // 감독 유무 확인
		int aCode = 0; // 출연진 유무 확인
		if(!movie.select("dt.tit_t2").text().equals("")) {
			//dt.tit_t2 가서 실제값 가져와 ""랑 비교
			dCode = 1; // 감독 있음!
		}
		if(!movie.select("dt.tit_t3").text().equals("")) {
			aCode = 1; // 출연진 있음!
		}
		
		if(dCode == 1 && aCode ==0) {
			director = movie.select("dd > span.link_txt").get(1).text();			
		} else if(dCode == 0 && aCode ==1) {
			actor = movie.select("dd > span.link_txt").get(1).text();
		} else if(dCode == 1 && aCode == 1) {
			director = movie.select("dd > span.link_txt").get(1).text();
			actor = movie.select("dd > span.link_txt").get(2).text();
		}
		
		String naverHref = movie.select("dt.tit > a").attr("href"); // 네이버 영화 URL
		naverCode = naverHref.substring(naverHref.lastIndexOf("=") +1); // 네이버 영화코드
		
		// 영화 개봉일자
		int openDtTxtIndex = temp.lastIndexOf("개봉");
		openDt = temp.substring(endTimeIndex+2, openDtTxtIndex);
		System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
		System.out.println("제목 : " + title);
		System.out.println("평점 : " + score + "점");
		System.out.println("예매율 : " + bookRate + "%");
		System.out.println("장르 : " + genre);
		System.out.println("PlayTime : " + movieTime);
		System.out.println("개봉일 : " + openDt);
		System.out.println("감독 : " + director);
		System.out.println("출연진 : " + actor);
		System.out.println("영화코드: " +naverCode);
		}
	}
}