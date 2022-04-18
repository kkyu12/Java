package Apr15th_04;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 범위를 주어 비교(찾기)
		//
		int k27_iVal; // 정수형 변수 선언
		for (int k27_i = 0; k27_i < 300; k27_i++) { // 0~299까지 for문
			k27_iVal = 5 * k27_i; // 정수형 변수 k27_iVal에 5 * k27_i 값을 대입
			if (k27_iVal >= 0 && k27_iVal < 10) { // k27_iVal 값이 0~9라면
				System.out.printf("일 %d\n", k27_iVal);
			} else if (k27_iVal >= 10 && k27_iVal < 100) { // k27_iVal 값이 10~99라면
				System.out.printf("십 %d\n", k27_iVal);
			} else if (k27_iVal >= 100 && k27_iVal < 1000) { // k27_iVal 값이 100~999라면
				System.out.printf("백 %d\n", k27_iVal);
			} else { // k27_iVal 값이 1000이상이라면
				System.out.printf("천 %d\n", k27_iVal);
			}
		}
	}

}
