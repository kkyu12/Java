package Apr15th_04;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자읽기고급
		//
		// 1001034567 2000000000 2030200000
		int k27_iNumVal = 2030200000; // 정수형 변수 선언과 값 대입
		String k27_sNumVal = String.valueOf(k27_iNumVal); // 문자열 선언, k27_iNumVal를 형변환 후 대입
		String k27_sNumVoice = ""; // 문자열 선언, ""으로 비어있는 값을 대입
		System.out.printf("==> %s [%d자리]\n", k27_sNumVal, k27_sNumVal.length());
		// 변수 k27_iNumVal의 자리수를 계산하고 출력
		int k27_i, k27_j; // 정수형 변수 두 개 선언

		String[] k27_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 문자열 배열 선언과 숫자 읽는
		String[] k27_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		// 문자열 배열 선언과 숫자를 읽을 때 필요한 단위 대입
		k27_i = 0; // k27_i값을 0으로 초기화
		k27_j = k27_sNumVal.length() - 1; // k27_sNumVal의 길이보다 1 작은 값을 대입
		while (true) { // while문 조건식에 true를 사용하여 무한루프 설정
			if (k27_i >= k27_sNumVal.length()) // 만약 k27_i가 k27_sNumVal의 길이보다 크거나 같다면
				break; // while문 나가기
			System.out.printf("%s[%s]", k27_sNumVal.substring(k27_i, k27_i + 1),
					k27_units[Integer.parseInt(k27_sNumVal.substring(k27_i, k27_i + 1))]);
			// 한자리씩 잘라서 숫차 출력 + 그 숫자를 읽는 법으로 변환하여 출력
			if (k27_sNumVal.substring(k27_i, k27_i + 1).equals("0")) { // 해당자리가 0이면 단위값을 생략
				if (k27_unitX[k27_j].equals("만") || k27_unitX[k27_j].equals("억")) {
					k27_sNumVoice = k27_sNumVoice + "" + k27_unitX[k27_j];
					// 자리수가 만이거나 억일 때 만과 억을 추가
					if (k27_sNumVal.substring(k27_sNumVal.length() - 8, k27_sNumVal.length() - 4).equals("0000")) {
						k27_sNumVoice = k27_sNumVoice.replace("만", "");
						// 만약 천만 백만 십만 만 모두 0이라면 만을 공백으로 대체
					}
				}
			} else {
				k27_sNumVoice = k27_sNumVoice + 
						k27_units[Integer.parseInt(k27_sNumVal.substring(k27_i, k27_i + 1))] 
						+ k27_unitX[k27_j];
			} // 각 자리수에서 0이 아니라면 k27_sNumVoice 에 읽는 숫자를 한자리씩 더해준다
			k27_i++; // 앞에 숫자에서 뒤로 다음 숫자로 넘어가기
			k27_j--; // k27_unitX에서 뒤에서부터 앞으로 인덱스 넘어가기
		}
		System.out.printf("\n %s[%s]\n", k27_sNumVal, k27_sNumVoice);

	}

}
