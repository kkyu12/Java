package Apr15th_04;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if 문
		//
		int k27_score = 91; // 정수형 변수 선언, 값을 유동적으로 대입해 볼 예정
		int k27_num = 0; // 정수형 변수 선언, 값을 유동적으로 대입해 볼 예정
		if (k27_score > 60) { // 60 보다크면
			System.out.println("합격입니다.");
		}
		if (k27_score > 60) { // 60 보다크면
			System.out.println("합격입니다.");
		} else { // 60 이하면
			System.out.println("불합격입니다.");
		}

		if (k27_num > 0) { // 0보다 크면
			System.out.println("양수입니다.");
		} else if (k27_num < 0) { // 0보다 작으면
			System.out.println("음수입니다.");
		} else { // 그 외인 0 일 경우
			System.out.println("영입니다.");
		}

		if (k27_score >= 90) { // 90이상이면
			System.out.println("A등급");
		} else if (k27_score >= 80) { // 90미만 80이상이면
			System.out.println("B등급");
		} else if (k27_score >= 70) { // 80미만 70이상이면
			System.out.println("C등급");
		} else { // 70미만이면
			System.out.println("F등급");
		}

		System.out.println("\n");

		
		
		// switch / case 문
		//
		String k27_jumin = "123456-1234567"; // 문자열 변수 선언과 대입
		switch (k27_jumin.charAt(7)) { // 인덱스 0 부터 카운트므로 -뒤에 숫자를 꺼내옴
		case '1': // 주민번호 뒷자리의 첫번째 숫자가 1이면
			System.out.printf("20세기전 태어난 남자 사람\n");
			// case '1'에서 break가 없기 때문에 case '2'로 넘어가서 20세기전 태어난 여자 사람도 출력됨
		case '2': // 주민번호 뒷자리의 첫번째 숫자가 2이면
			System.out.printf("20세기전 태어난 여자 사람\n");
			break; // 위의 결과를 출력했다면 switch문에서 나간다
		case '3': // 주민번호 뒷자리의 첫번째 숫자가 3이면
			System.out.printf("20세기후 태어난 남자 사람\n");
			break; // 위의 결과를 출력했다면 switch문에서 나간다
		case '4': // 주민번호 뒷자리의 첫번째 숫자가 4이면
			System.out.printf("20세기후 태어난 여자 사람\n");
			break; // 위의 결과를 출력했다면 switch문에서 나간다
		default: // 만약에 1, 2, 3, 4 의 값이 아니라면 그외의 값이라면
			System.out.printf("사람");
			break; // 위의 결과를 출력했다면 switch문에서 나간다
		}

		
		
		System.out.println("\n");
		
		

		// 기본 for문
		//
		int k27_sum = 0; // 정수형 변수 선언, 0으로 초기화
		for (int k27_i = 0; k27_i < 10; k27_i++) { // 정수형 변수 k27_i를 0~9까지 1씩 증가하는 동안
			k27_sum = k27_sum + k27_i; // k27_sum에 k27_i를 계속 더한다
		}
		System.out.printf("sum %d\n", k27_sum); // 정수형 출력이므로 %d 사용

		System.out.println("\n");

		// 복합 for문
		//
		for (int k27_i = 1; k27_i < 10; k27_i++) { // 정수형 변수 k27_i를 1~9까지 1씩 증가하는 for문 사용
			System.out.printf("****************\n");
			System.out.printf("   구구단 %d단\n", k27_i); // 구구단 몇 단인지 출력
			System.out.printf("****************\n");
			for (int k27_j = 1; k27_j < 10; k27_j++) { // 정수형 변수 k27_j를 1~9까지 1씩 증가하는 for문 사용
				System.out.printf("   %d * %d = %2d \n", k27_i, k27_j, k27_i * k27_j);
				// 구구단을 출력 가독성을 위해 결과값 중(k27_i * k27_j)에는 2칸을 설정
			}
		}
	}

}
