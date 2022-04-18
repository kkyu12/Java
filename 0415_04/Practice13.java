package Apr15th_04;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sin함수 그래프
		//
		// 360도 : 2pi = 1도 : x
		double k27_fSin; // 실수형 변수 선언
		for (int k27_i = 0; k27_i < 360; k27_i++) { // k27_i 는 0 부터 359 까지 for문
			k27_fSin = Math.sin(k27_i * 3.141592 / 180); // sin함수값을 계산
			System.out.printf("%d sin ==> %f\n", k27_i, k27_fSin);
		} // 1 라디안은 180도/파이 이고 1도는 파이/180라디안 이다
			// 즉 k27_i * 3.141592 / 180 은 0도에서 359도까지의 라디안 값이 계산된다

		System.out.printf("\n\n");

		for (int k27_i = 0; k27_i < 360; k27_i++) { // k27_i 는 0 부터 359 까지 for문
			k27_fSin = Math.sin(k27_i * 3.141592 / 180); // sin함수값을 계산
			int k27_iSpace = (int) ((1.0 - k27_fSin) * 50); // 띄어쓰기를 얼마나 할지 계산
			// sin함수값은 -1에서 1까지 나온다 1 - sin 으로 0에서 2가 출력
			// 그리고 그 값에 * 50을 하여 0에서 100까지 나오도록 설정하였다
			for (int k27_j = 0; k27_j < k27_iSpace; k27_j++) { // k27_j는 0부터 k27_iSpace 까지 for문
				System.out.printf(" "); // 띄어쓰기를 출력
			}
			System.out.printf("★[%f][%d]\n", k27_fSin, k27_iSpace); // 별과 사인값과 띄어쓰기개수를 출력
		}
	}
}
