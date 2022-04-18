package Apr15th_04;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단순비교
		//
		int k27_iA, k27_iB; // 정수형 변수 두개 선언
		k27_iA = 0; // k27_iA의 값을 초기화
		while (true) { // while문 조건식에 true를 사용하여 무한루프 설정
			k27_iB = 0; // k27_iB의 값을 초기화
			while (true) { // while문 조건식에 true를 사용하여 무한루프 설정
				System.out.printf("★"); // 별을 출력
				if (k27_iA == k27_iB) { // k27_iA 와 k27_iB 의 값이 같다면
					break; // 안쪽 while문을 나가기
				}
				k27_iB++; // k27_iB의 값을 1 증가
			}
			System.out.printf("\n"); // 별을 설정한 개수만큼 출력했으면 줄바꿈
			k27_iA++; // k27_iA의 값을 1 증가
			if (k27_iA == 30) { // k27_iA의 값이 30이라면
				break; // 바같쪽 while문을 나가기
			}
		} // k27_iA는 몇 번째 줄인가 k27_iB는 그 줄의 별의 개수
	}
}
