package Java_2_07_1;

public class P04_CsvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k27_OneRec = { "코드,시설코드,년도,월,인원", "1,근로자종합복지관,2017,1,21862", "2,근로자종합복지관,2017,2,21691",
				"3,근로자종합복지관,2017,3,17164", "4,시민복지회관,2017,2,50", "5,시민복지회관,2017,3,1810", "6,안식원,2017,1,293",
				"7,안식원,2017,2,285", "8,안식원,2017,3,309", "9,안식공원,2017,1,54", "10,안식공원,2017,2,59" };
		// 문자열 배열 생성과 값을 대입
		String[] k27_field_name = k27_OneRec[0].split(","); // 헤더 부분 쉼표단위로 끊기
		for (int k27_i = 1; k27_i < k27_OneRec.length; k27_i++) { // 배열 0 은 헤더이므로 배열의 1 부터 끝까지 for문
			String[] k27_field = k27_OneRec[k27_i].split(","); // 내용 부분 쉼표단위로 끊기
			System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
			for (int k27_j = 0; k27_j < k27_field_name.length; k27_j++) {
				// 각 항목을 출력하기 위해 k27_field_name 의 길이 만큼 for문
				System.out.printf(" %s : %s\n", k27_field_name[k27_j], k27_field[k27_j]);
				// 헤더와 각 항목별 내용을 출력
			}
			k27_number_read(k27_field[4]); // 숫자읽기를 메소드로 만들고 제일 마지막 인원을 읽는 숫자로 바꿈
			System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");

		}

	}

	static void k27_number_read(String k27_string) {
		String k27_sNumVoice = ""; // 문자열 선언, ""으로 비어있는 값을 대입
		int k27_i, k27_j; // 정수형 변수 두 개 선언
		String[] k27_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 문자열 배열 선언과 숫자 읽는
		String[] k27_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		// 문자열 배열 선언과 숫자를 읽을 때 필요한 단위 대입
		k27_i = 0; // k27_i값을 0으로 초기화
		k27_j = k27_string.length() - 1; // k27_sNumVal의 길이보다 1 작은 값을 대입
		while (true) { // while문 조건식에 true를 사용하여 무한루프 설정
			if (k27_i >= k27_string.length()) // 만약 k27_i가 k27_sNumVal의 길이보다 크거나 같다면
				break; // while문 나가기
			// 한자리씩 잘라서 숫차 출력 + 그 숫자를 읽는 법으로 변환하여 출력
			if (k27_string.substring(k27_i, k27_i + 1).equals("0")) { // 해당자리가 0이면 단위값을 생략
				if (k27_unitX[k27_j].equals("만") || k27_unitX[k27_j].equals("억")) {
					k27_sNumVoice = k27_sNumVoice + "" + k27_unitX[k27_j];
					// 자리수가 만이거나 억일 때 만과 억을 추가
					if (k27_string.substring(k27_string.length() - 8, k27_string.length() - 4).equals("0000")) {
						k27_sNumVoice = k27_sNumVoice.replace("만", "");
						// 만약 천만 백만 십만 만 모두 0이라면 만을 공백으로 대체
					}
				}
			} else {
				k27_sNumVoice = k27_sNumVoice + k27_units[Integer.parseInt(k27_string.substring(k27_i, k27_i + 1))]
						+ k27_unitX[k27_j];
			} // 각 자리수에서 0이 아니라면 k27_sNumVoice 에 읽는 숫자를 한자리씩 더해준다
			k27_i++; // 앞에 숫자에서 뒤로 다음 숫자로 넘어가기
			k27_j--; // k27_unitX에서 뒤에서부터 앞으로 인덱스 넘어가기
		}
		System.out.printf(" [%s]\n", k27_sNumVoice); // 읽는 숫자로 출력
	}

}
