package Apr15th_04;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비정형비교1(깔끔코딩)
		//
		// 1월은 31일까지 있고 2월은 28일 ... 12월은 31일까지 있다
		for (int k27_i = 1; k27_i < 13; k27_i++) { // k27_i는 1~12까지 for문
			System.out.printf(" %d월 =>", k27_i); // 몇 월인지 출력
			for (int k27_j = 1; k27_j < 32; k27_j++) { // k27_j는 1~31까지 for문
				System.out.printf("%d,", k27_j); // 며칠인지 출력
				if (k27_i == 1 && k27_j == 31) // 1월이고 31일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 2 && k27_j == 28) // 2월이고 28일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 3 && k27_j == 31) // 3월이고 31일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 4 && k27_j == 30) // 4월이고 30일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 5 && k27_j == 31) // 5월이고 31일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 6 && k27_j == 30) // 6월이고 30일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 7 && k27_j == 31) // 7월이고 31일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 8 && k27_j == 31) // 8월이고 31일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 9 && k27_j == 30) // 9월이고 30일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 10 && k27_j == 31) // 10월이고 31일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 11 && k27_j == 30) // 11월이고 30일이면
					break; // 안쪽 for문 나가기
				if (k27_i == 12 && k27_j == 31) // 12월이고 31일이면
					break; // 안쪽 for문 나가기
			}
			System.out.printf("\n"); // 안쪽 for문이 끝난후 줄바꿈
		}
	}

}
