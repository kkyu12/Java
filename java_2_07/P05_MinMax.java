package Java_2_07_1;

public class P05_MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k27_iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };
		// 정수형 배열 선언과 값 대입
		for (int k27_i = 0; k27_i < k27_iArray.length; k27_i++) { // 배열의 길이만큼 for문
			System.out.printf("k27_iArray[%d]=%d\n", k27_i, k27_iArray[k27_i]);
			// 배열의 인덱스 번호와 그 자리에 있는 값 출력
		}
		//
		// MAX 찾기
		int k27_iMax = k27_iArray[0]; // 인덱스0의 배열값을 초기값으로 대입
		int k27_iMaxPt = 0; // 배열의 위치를 체크하는 정수형 변수 선언과 초기화
		for (int k27_i = 0; k27_i < k27_iArray.length; k27_i++) { // 배열의 길이만큼 for문
			if (k27_iMax < k27_iArray[k27_i]) { // k27_iMax 보다 배열의 값이 크다면
				k27_iMax = k27_iArray[k27_i]; // k27_iMax에 배열의 값을 대입
				k27_iMaxPt = k27_i; // 그 때의 인덱스값을 대입
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k27_iMaxPt, k27_iMax);
		// 최대값을 갖고 있는 배열의 인덱스와 최대값 출력
		//
		// MIN 찾기
		int k27_iMin = k27_iArray[0]; // 인덱스0의 배열값을 초기값으로 대입
		int k27_iMinPt = 0; // 배열의 위치를 체크하는 정수형 변수 선언과 초기화
		for (int k27_i = 0; k27_i < k27_iArray.length; k27_i++) {
			if (k27_iMin > k27_iArray[k27_i]) { // k27_iMin 보다 배열의 값이 작다면
				k27_iMin = k27_iArray[k27_i]; // k27_iMin에 배열의 값을 대입
				k27_iMinPt = k27_i; // 그 때의 인덱스값을 대입
			}
		}
		System.out.printf("MIN : iArray[%d]=%d\n", k27_iMinPt, k27_iMin);
		// 최소값을 갖고 있는 배열의 인덱스와 최소값 출력
	}

}
