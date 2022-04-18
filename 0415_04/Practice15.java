package Apr15th_04;

import java.text.DecimalFormat;

public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 칸 맞추기 실습
		//
		String k27_item = "사과"; // 문자열 변수 선언, "사과"를 대입
		int k27_unit_price = 5000; // 정수형 변수 선언, 5000을 대입
		int k27_num = 500; // 정수형 변수 선언, 500을 대입
		int k27_total = 0; // 정수형 변수 선언 0으로 초기화

		DecimalFormat k27_df = new DecimalFormat(" ###,###,###,###,###"); // DecimalFormat이란 클래스를 사용
		// 세자리마다 콤마를 찍어줌
		
		// 헤더 출력
		System.out.printf("=======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%10.10s\n", "품목", "단가", "수량", "합계");
		// %20.20s 같은 설정을 사용하여 칸수를 맞춘다
		System.out.printf("=======================================================\n");
		// 값 출력
		System.out.printf("%20.20s%10.10s%10.10s%12.12s\n", k27_item, k27_df.format(k27_unit_price),
				k27_df.format(k27_num), k27_df.format(k27_unit_price * k27_num));
		// 가격과 수량 합계에 k27_df.format을 사용하여 세자리마다 콤마를 출력하도록 설정
		System.out.printf("=======================================================\n");
	}

}
