package Apr15th_04;

public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 피라미드 찍기
		//
		int k27_n, k27_m; // 정수형 변수 두개 선언
		k27_m = 20;
		k27_n = 1; // k27_m 에는 20 대입 k27_n 에는 1 대입
		while (true) { // while문 조건식에 true를 사용하여 무한루프 설정
			for (int k27_i = 0; k27_i < k27_m; k27_i++) { // k27_i가 0 부터 k27_m-1까지 for문
				System.out.printf(" "); // 띄어쓰기 출력
			}
			for (int k27_i = 0; k27_i < k27_n; k27_i++) { // k27_i가 0 부터 k27_n-1까지 for문
				System.out.printf("★"); // 별 출력
			}
			System.out.printf("\n"); // 줄바꾸기
			k27_m = k27_m - 1; // k27_m 값은 한개씩 줄이기
			k27_n = k27_n + 2; // k27_n 값은 두개씩 키우기
			if (k27_m < 0) { // 만약 k27_m값이 0보다 작다면
				break; // while문 벗어나기
			}
		}
	}

}
