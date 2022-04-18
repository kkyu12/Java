package Apr15th_04;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비정형 비교3
		//
		for (int k27_i = 1; k27_i < 13; k27_i++) { // k27_i는 1~12까지 for문 돌아가기
			System.out.printf(" %d월 =>", k27_i); // 몇 월인지 출력
			for (int k27_j = 1; k27_j < 32; k27_j++) { // k27_j는 1~31까지 for문 돌아가기
				System.out.printf("%d,", k27_j); // 며칠인지 출력
				if ((k27_i == 4 || k27_i == 6 || k27_i == 9 || k27_i == 11) && (k27_j == 30))
					break; // (4월 or 6월 or 9월 or 11월) 그리고 30일이면 안쪽 for문 나가기
				if (k27_i == 2 && k27_j == 28) // 2월이고 28일이면
					break; //안쪽 for문 나가기
			}
			System.out.printf("\n"); // 월이 넘어가면 한 줄 띄우기
		}
	}

}
