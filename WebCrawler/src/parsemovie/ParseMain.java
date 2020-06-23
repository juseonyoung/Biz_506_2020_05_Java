package parsemovie;

public class ParseMain {
	public final static String url = "";
	public final static String key = "";
	public static String today;

	public static void main(String[] args) throws Exception {
		ParseMovie pm = new ParseMovie();
		String url = pm.makeURL();

		String[][] arrRank = pm.getBoxOffice(url);

		for (int i = 0; i < arrRank.length; i++) {
		    System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println(arrRank[i][0] + "위" );
			System.out.println("영화제목:"+arrRank[i][1]   );
			System.out.println("누적관객수:"+arrRank[i][2]+"명" );
			System.out.println("매출액:"+arrRank[i][3]+"원" );
		}
	}
}
