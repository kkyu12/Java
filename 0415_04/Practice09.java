package Apr15th_04;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array이용 비교
		//
		int[] k27_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 정수형 배열 k27_iLMD 선언과
		// 월마다 마지막 일수를 배열에 대입
		for (int k27_i = 1; k27_i < 13; k27_i++) { // 1월부터 12월 까지 for문
			System.out.printf(" %d월 =>", k27_i); // 월을 출력
			for (int k27_j = 1; k27_j < 32; k27_j++) { // 1일부터 31일까지 for문
				System.out.printf("%d", k27_j); // 일을 출력
				if (k27_iLMD[k27_i - 1] == k27_j) // 배열의 인덱스가 0부터 시작하므로 k27_i - 1 을 사용
					break; // 배열의 숫자와 안쪽 for문의 k27_j값이 같으면 안쪽 for문 나가기
				System.out.printf(","); // 마지막 쉼표를 안 찍기
			}
			System.out.printf("\n"); // 월마다 줄바꿈
		}
	}

}
