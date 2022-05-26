package Java_2_07_1;

import java.text.DecimalFormat;

public class P02_ProveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // 세자리마다 쉼표 찍기
		String[] k27_OneRec = { // 영수증 목록 가져오기
				"해피홈 SAFE365 10,000,000  1 10,000,000", "(G)LH원형유리화     6,900 11     75,900",
				"상투과자E           5,980  1      5,980", "더블링 나일론       3,300  1      3,000",
				"해피홈 SAFE 핸      5,500  2     11,000", "농심 신라면120g     3,360  1      3,360",
				"(대)국내산삼겹      6,610  1      6,010", "오뚜기 진비빔면     2,750  1      2,750",
				"GAP 죽장사과 4-    10,800  1     10,800", "피코크 탄두리       2,480  1      2,480",
				"(달콤)순살닭강      7,920  1      7,920", "DZ주니어양말3족      4,980  1      4,980",
				"DZ주니어양말3족     4,980  1      4,980", "프리미엄생연어      7,130  1      7,130",
				"피코크 들깨미역     3,980  1      3,980", "남양 맛있는우유     4,480  1      4,480",
				"녹차원흑당시럽1     4,980  1      4,980", "진라면소컵(매)6     3,210  1      3,210",
				"케라시스 앰플       6,950  1      6,950", "푸르밀 미숫가루     2,980  2      6,960",
				"자일로스갈색설      1,990  1      1,990", "CJ 비비고칩 20G     1,980  1      1,980",
				"피코크 들깨미역     3,980  1      3,980", "흑원당 말차 밀      4,480  1      4,480",
				"상하유기농우유9     4,380  2      8,760", "트라피스트 유기     8,980  1      8,980",
				"동원참치살코기1     5,980  1      5,980", "오뚜기 오즈키친     5,980  1      5,980",
				"치킨스프카레 20    26,080  1      2,800" };
		String k27_price = "";
		String k27_total = "";
		String k27_amount = "";
		String k27_replace = "";
		// 문자열 변수 4개 선언과 초기화 (가격, 개수, 총가격, 변환할 문자열)
		int k27_int_price = 0;
		int k27_int_total = 0;
		int k27_int_amount = 0;
		// 정수형 변수 3개 선언과 초기화 ( 가격, 개수, 총가격)
		for (int i = 0; i < k27_OneRec.length; i++) { // 영수증 목록이 들어간 배열의 크키만큼의 for문
			k27_total = k27_OneRec[i].substring(k27_OneRec[i].length() - 10, k27_OneRec[i].length());
			// 젤 뒤에서부터 앞으로 10칸에서 문자열 자르기 = 총가격의 문자열
			k27_amount = k27_OneRec[i].substring(k27_OneRec[i].length() - 14, k27_OneRec[i].length() - 11);
			// 뒤에서 14칸부터 11칸까지 자르기 = 수량의 문자열
			k27_price = k27_OneRec[i].substring(k27_OneRec[i].length() - 24, k27_OneRec[i].length() - 14);
			// 뒤에서 24칸부터 14칸까지 자리그 = 가격의 문자열

			k27_price = k27_price.replaceAll(",", "").trim(); // 쉼표 지우고 빈칸 지우기
			k27_int_price = Integer.parseInt(k27_price); // 문자열 가격을 정수형 가격으로 변환
			k27_amount = k27_amount.replaceAll(",", "").trim(); // 쉼표 지우고 빈칸 지우기
			k27_int_amount = Integer.parseInt(k27_amount); // 문자열 개수를 정수형 수량으로 변환
			k27_total = k27_total.replaceAll(",", "").trim(); // 쉼표 지우고 빈칸 지우기
			k27_int_total = Integer.parseInt(k27_total); // 문자열 총가격을 정수형 총가격으로 변환

			if (k27_int_price * k27_int_amount != k27_int_total) { // 만약 가격 * 수량이 다르다면
				k27_replace = k27_df.format(k27_int_price * k27_int_amount);
				// 변환할 문자열에 가격*수량을 계산하고 세자리마다 쉼표 찍기 알아서 문자열로 바뀜
				k27_replace = k27_han_blank_foreword(k27_replace, 10); // 앞에 쓴 부족할 때 빈칸넣어주는 메소드 사용
				System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
				System.out.printf("오류 %s\n", k27_OneRec[i]); // 원래 배열 가져오기
				System.out.printf("수정 %s\n", k27_OneRec[i].replace(
						k27_OneRec[i].substring(k27_OneRec[i].length() - 10, k27_OneRec[i].length()), k27_replace));
				// 젤 뒤에 총가격부분을 수정 k27_replace로 대체
				System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
			}
		}
	}

	static String k27_han_blank_foreword(String k27_string, int k27_i) {
		// 문자열 앞에 빈칸 채우는 메소드
		byte[] k27_byte = k27_string.getBytes(); // 문자열을 바이트 배열에 저장
		String k27_result = ""; // 결과 문자열을 선언하고 ""빈칸으로 초기화
		for (int k27_j = 0; k27_j < k27_i - k27_byte.length; k27_j++) {
			// 넣어야할 빈칸을 k27_i - k27_byte.length 으로 계산하기
			k27_result = k27_result + " "; // 문자열에 빈칸 넣기
		}
		k27_result = k27_result + k27_string; // 뒤쪽에 받아온 문자열 추가
		return k27_result; // 결과값을 돌려준다
	}
}
