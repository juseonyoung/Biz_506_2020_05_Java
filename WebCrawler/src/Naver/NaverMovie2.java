package Naver;

import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovie2 {

	public static void main(String[] args) throws IOException {
		int count =0;
		int page =1; //1페이지 최초에 한번 실행
		String prePage ="";
		while (true) {
			String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=189633&type=after&isActualPointWriteExecute="
					+ "false&isMileageSubscriptionAlready=" + "false&isMileageSubscriptionReject=false&page=" +page; //페이지 바꿔줘ㅏ

			Document doc = Jsoup.connect(url).get();
			// movielist의 주소를 담은 doc
			Elements movielist = doc.select("div.score_result > ul>li");
			// 10건을 돌리려면 movielist 필요
			String nowPage =  doc.select("input#page").attr("value");
			System.out.println(prePage + "," +nowPage);
			
			if(nowPage.equals(prePage)) {
				break;
			} else {
				prePage = nowPage;
			}
			
			String writer = "";
			int score = 0;
			String time = "";
			String contents = "";

			for (Element movie : movielist) {

				writer = movie.select("div.score_reple a>span").get(0).text();
				score = Integer.parseInt(movie.select("div.star_score >em").get(0).text());
				time = movie.select("div.score_reple em").get(1).text().substring(0,10);
				contents = movie.select("div.score_reple > p>span").get(0).text();

				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				System.out.println("작성자:" + writer);
				System.out.println("댓글:" + contents);
				System.out.println("평점:" + score + "점");
				System.out.println("작성시간:" + time);
				count ++;
			} //여기까지 10건 반복이 끝
			page ++;
		}
		System.out.printf("총 %d건",count);
	}

}
