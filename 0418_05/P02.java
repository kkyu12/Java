package Apr18th_05;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k27_i = 1; k27_i < 4; k27_i++) { // 1에서 3까지 1씩 늘어나는 for문 생성
			System.out.printf("★★★★★★★★★★★★★★★ ★★★★★★★★★★★★★★★ ★★★★★★★★★★★★★★★\n");
			System.out.printf(" 구구단 %d 단     구구단 %d 단     구구단 %d단\n", k27_i, k27_i + 3, k27_i + 6);
			// (1,4,7) (2,5,8) (3,6,9)단이 묶여서 출력
			System.out.printf("★★★★★★★★★★★★★★★ ★★★★★★★★★★★★★★★ ★★★★★★★★★★★★★★★\n");
			for (int k27_j = 1; k27_j < 10; k27_j++) { // 1에서 9까지 1씩 늘어나는 for문 생성
				System.out.printf(" %d ★ %d = %2d      %d ★ %d = %2d      %d ★ %d = %2d\n", k27_i, k27_j, k27_i * k27_j,
						k27_i + 3, k27_j, (k27_i + 3) * (k27_j), k27_i + 6, k27_j, (k27_i + 6) * (k27_j));
				// 9개의 값이 출력되도록 설정 k27_i는 3씩 커지게 설정 k27_j값은 고정
			}
		}
	}

}
