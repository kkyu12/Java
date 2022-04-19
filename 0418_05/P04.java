package Apr18th_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영수증 출력 1
		//
		Scanner k27_sc = new Scanner(System.in); // 가격을 직접 받기위해 인스턴스함
		System.out.printf("가격을 입력해주세요 => ");
		int k27_iPrice = k27_sc.nextInt(); // 가격을 직접 받아오기
		int k27_tax = k27_iPrice / 11; // 부가세 정수형으로 계산하기
		double k27_tax_check = k27_iPrice / 11.0; // 부가세 실수형으로 계산하기
		if (k27_tax == k27_tax_check) { // 만약 둘이 같다면 딱 떨어지는 값이므로 패스
		} else { // 만약 두 값이 다르다면 소숫점밑에 숫자가 있다는 뜻이고
			k27_tax = k27_tax + 1; // 세금은 1원 미만인 값도 1원으로 올려서 받는다
		}
		int k27_bfPrice = k27_iPrice - k27_tax; // 세전 가격은 총가격 - 부가세
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // 세자리마다 쉼표찍기
		Calendar k27_calt = Calendar.getInstance(); // 오늘 날짜 가져오기
		SimpleDateFormat k27_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 날짜 출력 포맷 정하기
		System.out.printf("신용승인\n");
		System.out.printf("단말기 : 2N68665898%23s\n", "전표번호 : 041218");
		System.out.printf("가맹점 : 한양김치찌개\n");
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351길 10 ,\n");
		System.out.printf("1층\n");
		System.out.printf("대표자 : 유창신\n");
		System.out.printf("사업자 : 752-53-00558 %24s\n", "TEL : 7055695");
		k27_line_print();
		System.out.printf("금  액 %35s  원\n", k27_df.format(k27_bfPrice));
		// 세자리마다 쉼표처리된 세전가격 출력
		System.out.printf("부가세 %35s  원\n", k27_df.format(k27_tax));
		// 세자리마다 쉼표처리된 부가세 출력
		System.out.printf("합  계 %35s  원\n", k27_df.format(k27_iPrice));
		// 세자리마다 쉼표처리된 총가격 출력
		k27_line_print();
		System.out.printf("우리카드\n");
		System.out.printf("카드번호 : 5387-20**-****4613(S)%11s\n", "일시불");
		System.out.printf("거래일시 : %s\n", k27_sdt.format(k27_calt.getTime()));
		// 현재 시간을 포맷에 맞게 출력
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("매입 : 비씨카드사 %19s \n", "가맹 : 720068568");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		k27_line_print();
		System.out.printf("%26s\n", "★ 감사합니다 ★");
		System.out.printf("%45s", "표준V2.08_20200212");
	}
	public static void k27_line_print() { // 줄을 출력하는 메소드 추가
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - \n");
	}

}
