package Apr18th_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영수증 출력 2
		//
		String k27_itemname1 = "퓨어에어 비말차단용마스크(최고급형)"; // 문자열 변수 선언과 대입
		String k27_itemcode1 = "1031615"; // 문자열 변수 선언과 대입
		int k27_price1 = 3000; // 정수형 변수 선언과 대입
		int k27_amount1 = 10; // 정수형 변수 선언과 대입
		String k27_itemname2 = "슬라이드식명찰(가로형)(100호)"; // 문자열 변수 선언과 대입
		String k27_itemcode2 = "1008152"; // 문자열 변수 선언과 대입
		int k27_price2 = 2000; // 정수형 변수 선언과 대입
		int k27_amount2 = 10; // 정수형 변수 선언과 대입
		String k27_itemname3 = "매직흡착 인테리어후크(알루미늄타입)"; // 문자열 변수 선언과 대입
		String k27_itemcode3 = "1020800"; // 문자열 변수 선언과 대입
		int k27_price3 = 5000; // 정수형 변수 선언과 대입
		int k27_amount3 = 2; // 정수형 변수 선언과 대입
		int k27_total = k27_price1 * k27_amount1 + k27_price2 * k27_amount2 + k27_price3 * k27_amount3;
		// 총 가격 계산
		int k27_tax = k27_total / 11; // 부가세 정수형을 계산
		double k27_tax_check = k27_total / 11.0; // 부가세 실수형으로 계산
		if (k27_tax == k27_tax_check) { // 만약 둘이 같다면 딱 떨어지는 값이므로 패스
		} else { // 만약 두 값이 다르다면 소숫점 밑의 숫자가 있다는 뜻이고
			k27_tax = k27_tax + 1; // 세금은 1원 미만인 값도 1원으로 올려서 받는다
		}
		int k27_bfPrice = k27_total - k27_tax; // 세전 가격은 총가격 - 부가세
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // 세자리마다 쉼표찍기
		Calendar k27_calt = Calendar.getInstance(); // 오늘 날짜 가져오기
		SimpleDateFormat k27_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 날짜 출력 포맷 설정
		String k27_after14 = k27_add_date(14); // 14일 더한 날 구하기
		k27_head_print();
		System.out.printf("%18s%s%s\n", "교환/환불 14일", k27_after14, "이내,");
		// 14일 더한날 입력
		k27_middle_print();
		System.out.printf("[POS 1058231]%35s\n", k27_sdt.format(k27_calt.getTime()));
		// 현재 시간을 포맷에 맞게 출력
		k27_line2_print();
		System.out.printf("%s%9s%4d%9s\n", k27_subStrByte(k27_itemname1, 26), k27_df.format(k27_price1), k27_amount1,
				k27_df.format(k27_price1 * k27_amount1));
		// 1번 상품의 대한 이름, 가격, 수량, 총가격 출력
		System.out.printf("[%s]\n", k27_itemcode1); // 1번 상품의 상품번호 출력
		System.out.printf("%s%9s%4d%9s\n", k27_subStrByte(k27_itemname2, 26), k27_df.format(k27_price2), k27_amount2,
				k27_df.format(k27_price2 * k27_amount2));
		// 2번 상품의 대한 이름, 가격, 수량, 총가격 출력
		System.out.printf("[%s]\n", k27_itemcode2); // 2번 상품의 상품번호 출력
		System.out.printf("%s%9s%4d%9s\n", k27_subStrByte(k27_itemname3, 26), k27_df.format(k27_price3), k27_amount3,
				k27_df.format(k27_price3 * k27_amount3));
		// 3번 상품의 대한 이름, 가격, 수량, 총가격 출력
		System.out.printf("[%s]\n", k27_itemcode3); // 3번 상품의 상품번호 출력
		System.out.printf("%18s%26s\n", "과세합계", k27_df.format(k27_bfPrice));
		// 세자리마다 쉼표 + 세전가격 출력
		System.out.printf("%19s%26s\n", "부가세", k27_df.format(k27_tax));
		// 세자리마다 쉼표 + 부가세 출력
		k27_line_print();
		System.out.printf("%-10s%34s\n", "판매합계", k27_df.format(k27_total));
		// 세자리마다 쉼표 + 총가격 출력
		k27_line2_print();
		System.out.printf("%-10s%34s\n", "신용카드", k27_df.format(k27_total));
		// 세자리마다 쉼표 + 총가격 출력
		k27_line_print();
		System.out.printf("우리카드%40s\n", "538720**********");
		System.out.printf("%-17s %22s\n", "승인번호 77982843(0)", "승인금액 " + k27_df.format(k27_total));
		// 세자리마다 쉼표 + 총가격 출력
		k27_line2_print();
		System.out.printf("%28s 분당서현점\n", k27_sdt.format(k27_calt.getTime()));
		// 현재 시간을 포맷에 맞게 출력
		System.out.printf("상품 및 기타 문의 : 1544-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("%33s\n", "2112820610158231");
		k27_line_print();
		System.out.printf(" ◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서\n");
		System.out.printf("   회원가입 후 다양한 혜택을 누려보세요! ◈\n");
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

	public static String k27_add_date(int k27_day) { // 14일 추가되는 날짜를 계산하는 함수 설정
		SimpleDateFormat k27_sdt = new SimpleDateFormat("(MM월dd일)"); // 날짜 포맷 설정
		Calendar k27_calt = Calendar.getInstance(); // 현재 날짜 가져오기
		k27_calt.add(Calendar.DATE, k27_day); // k27_day 만큼 날짜 더하기
		String k27_after = k27_sdt.format(k27_calt.getTime()); // 원하는 포맷으로 문자열에 저장
		return k27_after; // 문자열 돌려주기
	}
	
	public static void k27_line_print() { // 줄을 출력하는 메소드 추가
		System.out.printf("------------------------------------------------\n");
	}
	
	public static void k27_line2_print() { // 줄을 출력하는 메소드 추가
		System.out.printf("================================================\n");
	}
	
	public static void k27_head_print() { // 윗부분을 출력하는 메소드 추가
		System.out.printf("%26s\n", "\"국민가게, 다이소\"");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현\n");
		System.out.printf("동)\n");
		k27_line2_print();
		System.out.printf("%27s\n", "소비자중심경영(CCM) 인증기업");
		System.out.printf("%29s\n", "ISO 9001 품질경영시스템 인증기업");
		k27_line2_print();
	}
	
	public static void k27_middle_print() { // 가운데 부분 출력하는 메소드 추가
		System.out.printf("(전자)영수증, 결제카드 지참 후 구입매장에서 가능\n");
		System.out.printf("%27s\n", "포장/가격 택 훼손시 교환/환불 불가");
		System.out.printf("%27s\n", "체크카드 취소 시 최대 7일 소요");
		k27_line2_print();
	}
}
