package Apr15th_04;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자형, 문자형 비교
		//
		int k27_iI; // 정수형 변수 선언
		double k27_iD; // 실수형 변수 선언

		k27_iI = 10 / 3; // 정수형 변수 이므로 계산하면 몫인 3이 대입됨
		k27_iD = 10 / 3.0; // 실수형 변수 이므로 계산하면 3.333333이 대입됨

		// int와 double은 정수형연산과 실수형연산이다
		if (k27_iI == k27_iD) { // k27_iI 와 k27_iD 가 같다면
			System.out.printf("equal\n"); // equal을 출력
		} else { // k27_iI 와 k27_iD 가 다르다면
			System.out.printf("Not equal[%f][%f]\n", (double) k27_iI, k27_iD); // Not equal과 값을 출력
			// k27_iI는 이미 정수값인 3이 입력되었으므로 앞에 실수형으로 형변환을 해도 3.000000이 출력됨
		}

		// 단지 유효숫자까지 표시된 것 뿐이지 다르다
		if (k27_iD == 3.333333) { // k27_iD 가 3.333333이 같으면
			System.out.printf("equal\n");
		} else { // k27_iD 가 3.333333이 다르면
			System.out.printf("Not equal[3.333333][%f]\n", k27_iD);
		} // 실제 k27_iD는 3.3333333333333333...의 값을 가진다 3.333333과는 다른값이다

		k27_iD = (int) k27_iD; // k27_iD을 정수형으로 형변환 3.000000 이 대입된다
		if (k27_iI == k27_iD) { // k27_iI 와 k27_iI 의 값이 같으면
			System.out.printf("equal\n"); // 실수형 변수값이 3.000000이므로 같다고 출력
		} else { // k27_iI 와 k27_iI 의 값이 다르면
			System.out.printf("Not equal[%f][%f]\n", (double) k27_iI, k27_iD);
		}

		System.out.printf("int로 인쇄[%d][%f]\n", k27_iI, k27_iD); // 정수형으로 인쇄
		System.out.printf("double로 인쇄[%f][%f]\n", (double) k27_iI, k27_iD); // 실수형으로 인쇄

		char k27_a = 'c'; // k27_a라는 문자형 변수 선언, 'c'값을 대입

		if (k27_a == 'b') { // k27_a 가 'b' 라면
			System.out.printf("k27_a는 b이다\n"); // 출력
		}
		if (k27_a == 'c') { // k27_a 가 'c' 라면
			System.out.printf("k27_a는 c이다\n"); // 출력
		}
		if (k27_a == 'd') { // k27_a 가 'd' 라면
			System.out.printf("k27_a는 d이다\n"); // 출력
		} // 결과값은 'k27_a는 c이다' 가 출력된다
		  // 문자형을 비교할 때 작은따옴표인 것을 주의하자

		String k27_aa = "abcd"; // k27_aa라는 문자열 변수 선언, "abcd"값을 대입

		if (k27_aa.equals("abcd")) { // 문자열을 비교할 때는 equal을 사용
			System.out.printf("k27_aa는 abcd이다\n"); // k27_aa와 "abcd"가 같다면 출력
		} else {
			System.out.printf("k27_aa는 abcd가 아니다\n"); // k27_aa와 "abcd"가 다르다면 출력
		} // 결과값은 'k27_aa는 abcd이다'가 출력된다
		  // 문자열을 비교할 때 큰 따옴표인 것을 주의하자

		boolean k27_bb = true; // 논리형 변수 선언과 true을 대입

		if (!!k27_bb) { // true의 아니고(false) 아니면(true) true값으로 돌아온다
			System.out.printf("k27_bb가 아니고 아니면 참이다\n");
		} else {
			System.out.printf("k27_bb가 아니고 아니면 거짓이다\n");
		} // 결과값은 'k27_bb가 아니고 아니면 참이다'가 출력된다
	}

}
