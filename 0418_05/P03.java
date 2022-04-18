package Apr18th_05;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_iWeekday = 5; // 1월1일이 금요일
		int[] k27_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 윤년인 년도의 달마다 마지막날을 모아둔 배열
		for (int k27_iMon = 0; k27_iMon < 12; k27_iMon++) { // 배열을 꺼내 써야 하므로 0~11까지 for문 설정
			System.out.printf("\t %2d월\n", k27_iMon + 1); // k27_iMon이 0부터 시작하므로 +1
			System.out.printf("=====================\n");
			System.out.printf(" 일 월 화 수 목 금 토\n");
			for (int k27_j = k27_iWeekday; k27_j > 0; k27_j--) {
				System.out.printf("   "); // 시작날만큼 빈칸설정
			}
			for (int k27_i = 1; k27_i <= k27_iEnd[k27_iMon]; k27_i++, k27_iWeekday++) {
				//k27_i는 1일부터 마지막날까지 출력 k27_iWeekday도 1씩 같이 증가
				if (k27_iWeekday % 7 == 6) { // k27_iWeekday를 7로 나누어 나머지가 6 일 때 한 줄 띄우기
					System.out.printf("%3d\n", k27_i);
					k27_iWeekday = k27_iWeekday - 7; // 다시 -1~6 (7일)을 계산하기 위해 -7
				} else { // 나머지가 6이 아니라면 날짜 출력
					System.out.printf("%3d", k27_i);
				}
			}
			System.out.printf("\n\n"); // 한달이 끝난 후 줄 띄우기
		}
	}

}
