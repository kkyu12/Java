package Java_2_06;

public class P03_Elevater {
	int k27_limit_up_floor = 10; // 정수형 변수 선언, 최상층값을 대입
	int k27_limit_down_floor = 0; // 정수형 변수 선언, 최하층값을 대입
	int k27_floor = 1; // 정수형 변수 선언, 현재 층을 대입
	String k27_help; // 문자열 변수 선언

	void k27_up() { // 올라가는 메소드 선언
		if (k27_floor == k27_limit_up_floor) { // 만약 현재층이 최상층이라면
			k27_help = "마지막층입니다"; // 마지막층입니다 출력
		} else { // 현재층이 최상층이 아니라면
			k27_floor++; // 한 층 올라감
			k27_help = String.format("%d층입니다", k27_floor); // 올라간 층이 몇층인지 출력
		}
	}

	void k27_down() { // 내려가는 메소드 선언
		if (k27_floor == k27_limit_down_floor) { // 만약 현재층이 최하층이라면
			k27_help = "처음층입니다"; // 처음층입니다 출력
		} else { // 현재층이 최하층이 아니라면
			k27_floor--; // 한 층 내려감
			k27_help = String.format("%d층입니다", k27_floor); // 내려간 층이 몇층인지 출력
		}
	}

}
