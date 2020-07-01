package Daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Daummovie {

	public static void main(String[] args) throws IOException {
		int count = 0;
		int page = 1;
		
		while (true) {
			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page=" + page;

			Document doc = Jsoup.connect(url).get();

			Elements movielist = doc.select("div.review_info");
			
			if(movielist.size()==0) { //while빠져나가게 if문 만들어주기 
				break;
			}

			String writer = "";
			String contents = "";
			String date = "";
			String score = "";
			//String cut_date="";

			for (Element movie : movielist) {

				writer = movie.select("em.link_profile").text();
				contents = movie.select("p.desc_review").text();
				//cut_date = movie.select(
				date =movie.select("span.info_append").text().substring(0,10);
				// 구조가 같은 애들은 substring써서 자르기
				score = movie.select("em.emph_grade").text();

				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				System.out.println("작성자:" + writer);
				System.out.println("내용:" + contents);
				System.out.println("작성일:" + date);
				System.out.println("평점:" + score+"점");
				count++;

			}
			page++;
			
		}
		//System.out.println("총"+count+"페이지 수집"); //while 빠져나가는게 없어서 에러남
		System.out.println("총"+count+"개 댓글 수집");
	}

}