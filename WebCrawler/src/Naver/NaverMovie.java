package Naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovie {

	public static void main(String[] args) throws IOException {

		

		// page 네이션 돌면서 1페이지부터 끝까지

		// System.out.println(line);
		int count =0;
		int page =1;
		for (page = 1; page < 20; page++) {
			String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=189633&type=after&isActualPointWriteExecute="
					+ "false&isMileageSubscriptionAlready="
					+ "false&isMileageSubscriptionReject=false&page="+page;
			
			
			Document doc = Jsoup.connect(url).get();
			Elements movielist = doc.select("div.score_result > ul>li");
			//sysout movielist.size 하면 개수 알 수 있음
			
			String writer = "";
			String score = "";
			String time = "";
			String contents = "";
			
			for (Element movie : movielist) {

				writer = movie.select("div.score_reple >dl >dt>em").get(0).text();
				score = movie.select("div.star_score >em").get(0).text();
				time = movie.select("div.score_reple >dl>dt >em").get(1).text();
				contents = movie.select("div.score_reple > p").text();

				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				System.out.println("작성자:" + writer);
				System.out.println("댓글:" + contents);
				System.out.println("평점:" + score + "점");
				System.out.println("작성시간:" + time);
				count ++;
				
			}
			

		}
		
		System.out.printf("총 %d건",count);
		
	}
}