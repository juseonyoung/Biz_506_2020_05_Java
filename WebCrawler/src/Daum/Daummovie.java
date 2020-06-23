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

			String writer = "";
			String contents = "";
			String date = "";
			String score = "";
			String cut_date="";

			for (Element movie : movielist) {

				writer = movie.select("em.link_profile").get(0).text();
				contents = movie.select("p.desc_review").get(0).text();
				cut_date = movie.select("span.info_append").get(0).text();
				//date =cut_date.substring(0, endIndex(","))
				score = movie.select("em.emph_grade").get(0).text();

				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				System.out.println("작성자:" + writer);
				System.out.println("내용:" + contents);
				System.out.println("작성일:" + date);
				System.out.println("평점:" + score);
				count++;

			}
			page++;
			

		}
	}

}