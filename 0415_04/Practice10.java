package Apr15th_04;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자읽기
		//
		// 범위를 주는 것, 숫자 자르기
		String[] k27_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 문자열 배열 선언과 값 대입
		for (int k27_i = 0; k27_i < 101; k27_i++) { // 0 ~ 100 까지 for문
			if (k27_i >= 0 && k27_i < 10) { // k27_i 값이 0 ~ 9라면
				System.out.printf("일의 자리 : %s\n", k27_units[k27_i]);
			} else if (k27_i >= 10 && k27_i < 100) { // k27_i 값이 10 ~ 99라면
				int k27_i10, k27_i0; // 정수형 변수 두개 선언
				k27_i10 = k27_i / 10; // k27_i를 10 으로 나눈 몫을 k27_i10 대입
				k27_i0 = k27_i % 10; // k27_i를 10으로 나눈 나머지를 k27_i0 에 대입
				if (k27_i0 == 0) { // 만약 k27_i를 10으로 나눈 나머지가 0이라면
					System.out.printf("십의 자리 : %s십\n", k27_units[k27_i10]); // ○십을 출력
				} else { // 그 외 k27_i를 10으로 나눈 나머지가 0이 아니라면
					System.out.printf("십의 자리 : %s십%s\n", k27_units[k27_i10], k27_units[k27_i0]);
				} // ○십○의 결과값 출력
			} else {
				System.out.printf("==> %d\n", k27_i); // 마지막으로 k27_i가 100일 때 출력
			}
		}
	}

}
