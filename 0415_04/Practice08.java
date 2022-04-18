package Apr15th_04;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case문 비교
		//
		for (int k27_i = 1; k27_i < 13; k27_i++) { // k27_i는 1~12까지 for문 돌아가기
			System.out.printf(" %d월 =>", k27_i); // 몇 월인지 출력
			LOOP: for (int k27_j = 1; k27_j < 32; k27_j++) { // k27_j는 1~31까지 for문 돌아가기
				System.out.printf("%d,", k27_j); // 며칠인지 출력
				switch (k27_i) { // 몇월인지를 조건으로 사용
				case 4: // 4월이면
				case 6: // 6월이면
				case 9: // 9월이면
				case 11: // 11월이면
					if (k27_j == 30) // 만약 30일이면
						break LOOP; // 멈추고 안쪽 for문으로 돌아간다
					break; // 안쪽 for문 나가기
					// 거의 이런 표현은 안쓴다 LOOP라는 표시자가 없으면 엉뚱한 결과가 나온다
				case 2: // 2월이고
					if (k27_j == 28) // 28일이면
						break LOOP; // 멈추고 안쪽 for문으로 돌아간다
					break; // 안쪽 for문 나가기
				}
			}
			System.out.printf("\n"); // 월이 끝나면 한 줄 띄우기
		}
	}

}
