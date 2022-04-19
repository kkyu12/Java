package Apr18th_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영수증 출력 3
		//
		String[] k27_itemname = { "해피홈 SAFE365 핸드크림", "(G)LH원형유리화병 100cm", "상투과자E", "더블링 나일론 깡 롤링", "해피홈 SAFE 핸드워시",
				"농심 신라면120g*5", "(대)국내산삼겹살찌개용", "오뚜기 진비빔면 156g*4", "GAP 죽장사과 4-6입/", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴살",
				"(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족D_WH", "프리미엄생연어초밥", "피코크 들깨미역국500g", "남양 맛있는우유GT 저지방",
				"녹차원흑당시럽10입", "진라면소컵(매)65*6", "케라시스 앰플 트리트먼트", "푸르밀 미숫가루우유", "자일로스갈색설탕500g", "CJ 비비고칩 20G",
				"피코크 들깨미역국500", "흑원당 말차 밀크티", "1+ 등급란 10개입 특", "동원양반볶음김치기획", "오리온 초코파이 468g*12", "바나나우유 120ml*4",
				"수향미 골든 퀸 10Kg+10KG", "ABC초코 187g" }; // 상품 30개 이상을 문자열 배열에 추가
		int[] k27_price = { 97500, 96900, 95980, 93300, 95500, 1113360, 196610, 92750, 10800, 4980, 2480, 97920, 94980,
				4980, 7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 19480, 7980, 3620, 3720, 27980,
				4000 };
		// 각각의 가격을 정수형 배열에 저장
		int[] k27_num = { 10, 10, 10, 10, 10, 10, 10, 10, 20, 1, 1, 10, 10, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 50, 1,
				1, 1, 30, 1 };
		// 각각의 수량을 정수형 배열에 저장
		boolean[] k27_taxfree = { true, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, true, false }; // 과세인지 아닌지 논리형 배열에 저장
		int k27_no_tax = 0; // 면세물품가격에 대한 변수 선언과 초기화
		int k27_totalsum = 0; // 총 가격 변수 선언과 초기화
		int k27_point = 5473; // 직전 포인트 변수 선언과 대입
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // 세자리마다 쉼표 찍기
		Calendar k27_calt = Calendar.getInstance(); // 오늘 날짜 가져오기
		SimpleDateFormat k27_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // 날짜 포맷 설정1
		SimpleDateFormat k27_sdt2 = new SimpleDateFormat("YYYYMMdd"); // 날짜 포맷 설정2
		SimpleDateFormat k27_sdt3 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // 날짜 포맷 설정3
		k27_titel_print(); // 영수증 윗부분 출력 함수
		System.out.printf("[구 매]%s%18s\n", k27_sdt.format(k27_calt.getTime()), "POS:0011-9861"); // 현재 날짜 포맷1로 출력
		k27_line_print();
		System.out.printf("%7s%13s%4s%8s\n", "상 품 명", "단 가", "수량", "금 액");
		k27_line_print();
		for (int k27_i = 0; k27_i < k27_itemname.length; k27_i++) { // 아이템 개수만큼 for문 돌리기
			if (k27_taxfree[k27_i] == true) { // 논리형 배열에서 만약 true라면 * 찍기
				System.out.printf("* ");
				k27_no_tax = k27_no_tax + k27_price[k27_i] * k27_num[k27_i]; // 비과세 물품 총 가격 더하기
			} else { // 과세물품이라면 빈칸 채우기
				System.out.printf("  ");
			}
			System.out.printf("%s%10s%3d%11s\n", k27_subStrByte(k27_itemname[k27_i], 15),
					k27_df.format(k27_price[k27_i]), k27_num[k27_i], k27_df.format(k27_price[k27_i] * k27_num[k27_i]));
			// 물품명 20바이트로 자르기, 가격은 세자리마다 쉼표, 개수, 품목가격*개수의 세자리마다 쉼표 출력
			k27_totalsum += k27_price[k27_i] * k27_num[k27_i];
			// 총 가격 더하기
			if ((k27_i + 1) % 5 == 0) { // 5줄마다 줄 출력
				k27_line_print();
			}
		}
		int k27_tax = (k27_totalsum - k27_no_tax) / 11; // 부가세 정수형으로 계산
		double k27_tax_check = (k27_totalsum - k27_no_tax) / 11.0; // 부가세 실수형으로 계산
		if (k27_tax == k27_tax_check) { // 만약 두 값이 같다면 딱 떨어지는 값이므로 패스
		} else { // 만약 두 값이 다르다면 1원 미만 값이 있고
			k27_tax = k27_tax + 1; // 세금은 1원 미만 값을 올려서 받는다
		}
		int k27_bfPrice = k27_totalsum - k27_no_tax - k27_tax; // 과세 물품 계산
		System.out.println();
		System.out.printf("%22s%14d\n", "총 품목 수량", k27_itemname.length); // 아이템기준으로 총 품목 수량 계산
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", k27_df.format(k27_no_tax)); // 면세받은 가격 + 세자리마다 쉼표 출력
		System.out.printf("%23s%14s\n", "과 세  물 품", k27_df.format(k27_bfPrice)); // 과세받은 가격 + 세자리마다 쉼표 출력
		System.out.printf("%24s%14s\n", "부   가   세", k27_df.format(k27_tax)); // 부가세 + 세자리마다 쉼표 출력
		System.out.printf("%25s%14s\n", "합        계", k27_df.format(k27_totalsum));
		// 면세+과세+부가세의 모든 가격 + 세자리마다 쉼표 출력
		System.out.printf("%-24s%11s\n", "결 제 대 상 금 액", k27_df.format(k27_totalsum));
		k27_line_print();
		System.out.printf("%-14s%25s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%-17s%5s%11s\n", "카드결제(IC)", "일시불 / ", k27_df.format(k27_totalsum));
		k27_line_print();
		System.out.printf("%20s\n", "[신세계포인트 적립]");
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		System.out.printf("%-13s%8s%11s\n", "금회발생포인트", "9350**9995", k27_df.format(k27_totalsum / 1000));
		// 0.1% 에 대한 포인트 계산 후 세자리마다 쉼표 출력
		System.out.printf("%-16s%7s%11s\n", "누계(가용)포인트", k27_df.format(k27_totalsum / 1000 + k27_point) + "(",
				k27_df.format(k27_point) + ")");
		// 이번에 구매하여 쌓인 포인트와 앞선 포인트 출력
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		k27_line_print();
		System.out.printf("%s\n", "    구매금액기준 무료주차시간 자동부여");
		System.out.printf("%-10s%26s\n", "차량번호 :", "34저****");
		System.out.printf("%-10s%27s\n", "입차시간 :", k27_sdt3.format(k27_calt.getTime()));
		// 현재 시각을 포맷3으로 출력 다만 입차시간이라 과거시간이 찍혀야 함
		k27_line_print();
		System.out.printf("%-16s%22s\n", "캐셔:084599 양OO", "1150");
		System.out.printf("%14s%s\n", k27_sdt2.format(k27_calt.getTime()), "/00119861/00164980/31");
		// 현재 시각을 포맷2으로 출력
	}

	public static String k27_subStrByte(String k27_source, int k27_cutLength) {
		// 상품명을 자르는 함수 설정 문자열과 자를 사이즈를 받아온다
		k27_source = k27_source.trim(); // 왼쪽이나 오늘쪽 공백 삭제
		if (k27_source.getBytes().length <= k27_cutLength) { // 자르는 값보다 문자열이 작다면
			for (int k27_i = k27_cutLength - k27_source.getBytes().length; k27_i > 0; k27_i--) {
				k27_source += " "; // 부족한 만큼 빈칸 채워주기
			}
			return k27_source; // 문자열을 되돌려 주기
		} else { // 문자열이 크다면
			StringBuffer k27_sb = new StringBuffer(k27_cutLength);
			// 문자열을 추가하거나 자르는 클래스에 인스턴스
			int k27_cnt = 0; // 정수형 변수 선언과 0으로 초기화
			for (char k27_ch : k27_source.toCharArray()) { // 문자형으로 옮기기
				k27_cnt += String.valueOf(k27_ch).getBytes().length; // 원하는 길이만큼을 한글자씩 추가
				if (k27_cnt > k27_cutLength) { // 정수가 자를 문자 사이즈보다 크다면
					break; // for문 밖으로 나가기
				}
				k27_sb.append(k27_ch); // 문자열에 자른 만큼을 추가
			}
			if (k27_sb.toString().getBytes().length == k27_cutLength - 1) {
				// 만약 문자열이 한글 중간에 짤려서 한 칸 부족하다면
				k27_sb.append(" "); // 빈칸을 한 칸 추가
			}
			return k27_sb.toString(); // 문자열을 되돌려 주기
		}
	}

	public static void k27_titel_print() { // 윗 부분 출력 부분을 따로 함수로 설정
		System.out.printf("%35s\n", "이마트 죽전점 (031)888-1234");
		System.out.printf("%30s\n", "emart     206-86-50913 강희석");
		System.out.printf("%29s\n\n", "용인 수지구 포은대로 552");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n");
	}

	public static void k27_line_print() { // 줄을 출력하는 메소드 추가
		System.out.println("-----------------------------------------");
	}
}
