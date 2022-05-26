package Java_2_07_1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class P12_ReportSheet2 {
	static ArrayList<P09_OneRec> k27_ArrayOneRec = new ArrayList<P09_OneRec>();
	// 클래스 형태의 ArrayList 생성
	static int k27_iPerson = 200; // 성적표를 출력할 총 학생수
	static int k27_class_person = 30; // 각 학급이나 페이지별 학생 수
	static int[] k27_sum = new int[4]; // 페이지별 합계를 구할 배열 생성
	static int[] k27_totalsum = new int[4]; // 누적 합계를 구할 배열 생성
	static double k27_avg_sum = 0; // 각 학생의 평균의 총합을 구할 실수형 변수 선언과 초기화
	static int k27_cnt = 0; // 안쪽 for이 돌아가는 학생 수 만큼을 계산하기위한 정수형 변수 선언과 초기화

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k27_dataSet();
		k27_dataSort();
		int k27_max_page = k27_iPerson / k27_class_person; // 총 페이지를 정수형으로 구하기
		double k27_max_page_check = (double) k27_iPerson / k27_class_person; // 총 페이지를 실수형으로 구하기
		if (k27_max_page != k27_max_page_check) { // 둘이 다르다면 + 1 (예전의 부과세와 같은 원리)
			k27_max_page++;
		}
		int[] k27_cut = new int[k27_max_page + 1]; // 페이지별 학생번호를 넣을 변수 선언 0 부터 넣을꺼라서 사이즈에 + 1
		int k27_k = 0; // 페이지별 학생번호를 넣기 위해 만든 정수형 변수 선언과 초기화
		for (int k27_i = 0; k27_i < k27_cut.length - 1; k27_i++) {
			k27_cut[k27_i] = k27_k; // 0, 30, 60, 90 등 반마다 마지막 번호를 넣기
			k27_k = k27_k + k27_class_person; // 한 반의 명수 만큼 번호 늘리기
		}

		k27_cut[k27_max_page] = k27_iPerson; // 제일 마지막 반의 학생 수는
		// 딱 맞을 수도 아닐 수도 있으므로 총 학생 수를 넣기
		for (int k27_j = 0; k27_j < k27_max_page; k27_j++) { // 페이지 수 만큼 돌아가는 for문
			System.out.printf("%22s\n", "성적집계표");
			System.out.printf("%s%2d%33s\n", "PAGE:", k27_j + 1, "출력일자 : " + k27_date_print());
			// 페이지와 원하는 날짜 포맷으로 날짜 출력
			k27_HeaderPrint();
			for (int k27_i = k27_cut[k27_j]; k27_i < k27_cut[k27_j + 1]; k27_i++) {
				// 처음엔 0 ~ 29 두번째 30 ~ 59 세번째 60 ~ 89 씩 돌아가는 for문 생성
				P09_OneRec k27_rec; // 클래스 선언
				k27_rec = k27_ArrayOneRec.get(k27_i); // ArrayList에서 하나씩 가져오기
				System.out.printf("%4d %6s %5d %5d %5d %5d %6.2f\n", k27_rec.k27_student_id() + 1, k27_rec.k27_name(),
						k27_rec.k27_kor(), k27_rec.k27_eng(), k27_rec.k27_mat(), k27_rec.k27_sum(), k27_rec.k27_avg());
				// 가져온 값을 출력
				k27_sum[0] += k27_rec.k27_kor(); // 현재페이지 국어 성적을 다 더하기
				k27_sum[1] += k27_rec.k27_eng(); // 현재페이지 영어 성적을 다 더하기
				k27_sum[2] += k27_rec.k27_mat(); // 현재페이지 수학 성적을 다 더하기
				k27_sum[3] += k27_rec.k27_sum(); // 현재페이지 모든 성적을 다 더하기
				k27_avg_sum += k27_rec.k27_avg(); // 현재페이지 평균 성적을 다 더하기
				k27_totalsum[0] += k27_rec.k27_kor(); // 누적페이지 국어 성적을 다 더하기
				k27_totalsum[1] += k27_rec.k27_eng(); // 누적페이지 영어 성적을 다 더하기
				k27_totalsum[2] += k27_rec.k27_mat(); // 누적페이지 수학 성적을 다 더하기
				k27_totalsum[3] += k27_rec.k27_sum();
				; // 누적페이지 모든 성적을 다 더하기
				k27_cnt++; // 현재 페이지의 학생 수 세기 // 마지막 장에 한 반의 학생보다 적을 수 있으므로
			}
			System.out.printf("============================================\n");
			System.out.println("현재페이지");
			System.out.printf("%-10s%6d%6d%6d%6d%8.1f\n", "합계", k27_sum[0], k27_sum[1], k27_sum[2], k27_sum[3],
					k27_avg_sum);
			System.out.printf("%-10s%6.1f%6.1f%6.1f%6.1f%8.1f\n", "평균", (double) k27_sum[0] / k27_cnt,
					(double) k27_sum[1] / k27_cnt, (double) k27_sum[2] / k27_cnt, (double) k27_sum[3] / k27_cnt,
					k27_avg_sum / k27_cnt); // 실수형으로 더 정확하게 계산하기
			k27_sum = new int[4]; // 현재 페이지 계산이 끝났으므로 배열 초기화
			k27_avg_sum = 0; // 평균의 합도 초기화
			k27_cnt = 0; // 현재 페이지의 학생 수도 초기화
			System.out.printf("============================================\n");
			System.out.println("누적페이지");
			System.out.printf("%-10s%6d%6d%6d%6d%8.1f\n", "합계", k27_totalsum[0], k27_totalsum[1], k27_totalsum[2],
					k27_totalsum[3], k27_totalsum[3] / 3.0); // 누적페이지별 합계 출력
			System.out.printf("%-10s%6.1f%6.1f%6.1f%6.1f%8.1f\n\n", "평균", (double) k27_totalsum[0] / k27_cut[k27_j + 1],
					(double) k27_totalsum[1] / k27_cut[k27_j + 1], (double) k27_totalsum[2] / k27_cut[k27_j + 1],
					(double) k27_totalsum[3] / k27_cut[k27_j + 1], (k27_totalsum[3] / 3.0) / k27_cut[k27_j + 1]);
		}
		// 누적페이지별 평균 출력
	}

	public static void k27_dataSet() { // 데이터 세팅에 관한 메소드 생성
		for (int k27_i = 0; k27_i < k27_iPerson; k27_i++) {
			String k27_name = String.format("길동%02d", k27_i + 1); // 이름
			int k27_kor = (int) (Math.random() * 100); // 국어 성적
			int k27_eng = (int) (Math.random() * 100); // 영어 성적
			int k27_mat = (int) (Math.random() * 100); // 수학 성적
			k27_ArrayOneRec.add(new P09_OneRec(k27_i, k27_name, k27_kor, k27_eng, k27_mat));
			// ArrayList의 add를 사용하여 저장
		}
	}

	public static void k27_HeaderPrint() { // 헤더인쇄에 관한 메소드 생성
		System.out.printf("============================================\n");
		System.out.printf("%s%5s%5s%4s%4s%4s%6s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("============================================\n");
	}

	static String k27_date_print() { // 날짜를 출력해주는 메소드
		SimpleDateFormat k27_format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		// 출력되는 날짜의 포맷을 설정
		Date k27_time = new Date();
		String k27_string_time = k27_format.format(k27_time);
		// 날짜를 문자열로 원하는 포맷으로 넣어주기
		return k27_string_time;
	}
	
	public static void k27_dataSort() { // 데이터 정렬에 관한 메소드 생성
		Comparator<P09_OneRec> k27_bikyeokijun = new Comparator<P09_OneRec>() {
			// Comparator 클래스를 생성
			public int compare(P09_OneRec k27_a1, P09_OneRec k27_a2) {
				// compare 메소드를 오버로딩(재정의)
				// 만일 문자형 비교면 아래와 같이 써줌
				// return
				// (String.valueOf(k27_a1.k27_sum).compareTo(String.valueOf(k27_a2.k27_sum)));
				return (k27_a2.k27_sum() - k27_a1.k27_sum());
				// k27_a2.하고 뒷부분에 무엇을 넣을지에 따라 정렬 기준이 바뀜
			}
		};
		Collections.sort(k27_ArrayOneRec, k27_bikyeokijun); // 설정한 내용대로 정렬(sort!)
		// Collections.reverse(k27_ArrayOneRec); // 역정렬(뒤집기)
	}

}
