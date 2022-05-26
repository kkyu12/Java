package Java_2_07_1;

import java.util.ArrayList; // ArrayList를 사용하기 위한 임포트
import java.util.Collections;
import java.util.Comparator;

public class P11_MainTest {
	static ArrayList<P09_OneRec> k27_ArrayOneRec = new ArrayList<P09_OneRec>();
	// 클래스 형태의 ArrayList 생성
	static int k27_sumkor = 0; // 국어점수의 합계를 위한 정수형 변수 선언과 0으로 초기화
	static int k27_sumeng = 0; // 영어점수의 합계를 위한 정수형 변수 선언과 0으로 초기화
	static int k27_summat = 0; // 수학점수의 합계를 위한 정수형 변수 선언과 0으로 초기화
	static int k27_sumsum = 0; // 점수들의 합계를 위한 정수형 변수 선언과 0으로 초기화
	static int k27_sumavg = 0; // 합계의 평균을 위한 정수형 변수 선언과 0으로 초기화
	static final int k27_iPerson = 20; // 국어점수의 합계를 위한 정수형 변수 선언과 0으로 초기화

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k27_dataSet(); // 데이터 세팅
		k27_dataSort(); // 데이터 정렬
		k27_HeaderPrint(); // 헤더인쇄
		for (int k27_i = 0; k27_i < k27_ArrayOneRec.size(); k27_i++) {
			k27_ItemPrint(k27_i); // 내용인쇄
		}
		k27_TailPrint(); // 꼬리인쇄
	}

	public static void k27_dataSet() { // 데이터 세팅에 관한 메소드 생성
		for (int k27_i = 0; k27_i < k27_iPerson; k27_i++) {
			String k27_name = String.format("길동%02d", k27_i + 1); // 이름 만들기
			int k27_kor = (int) (Math.random() * 100); // 국어 성적 만들기
			int k27_eng = (int) (Math.random() * 100); // 영어 성적 만들기
			int k27_mat = (int) (Math.random() * 100); // 수학 성적 만들기
			k27_ArrayOneRec.add(new P09_OneRec(k27_i, k27_name, k27_kor, k27_eng, k27_mat));
			// ArrayList의 add를 사용하여 저장
		}
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

	public static void k27_HeaderPrint() { // 헤더인쇄에 관한 메소드 생성
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		System.out.printf("%2s %4s %2s %2s %2s %2s   %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
	}

	public static void k27_ItemPrint(int k27_i) { // 내용인쇄에 관한 메소드 생성 매개변수로 k27_i가 필요
		P09_OneRec k27_rec; // 클래스 선언
		k27_rec = k27_ArrayOneRec.get(k27_i); // ArrayList에서 하나씩 가져오기
		System.out.printf("%4d %4s %4d %4d %4d %4d %6.2f\n", k27_rec.k27_student_id() + 1, k27_rec.k27_name(),
				k27_rec.k27_kor(), k27_rec.k27_eng(), k27_rec.k27_mat(), k27_rec.k27_sum(), k27_rec.k27_avg());
		// 가져온 값을 출력
		k27_sumkor += k27_rec.k27_kor(); // 국어합계 변수에 국어 점수 저장
		k27_sumeng += k27_rec.k27_eng(); // 영어합계 변수에 영어 점수 저장
		k27_summat += k27_rec.k27_mat(); // 수학합계 변수에 수학 점수 저장
		k27_sumsum += k27_rec.k27_sum(); // 합계 변수에 함계 점수 저장
		k27_sumavg += k27_rec.k27_avg(); // 평균 변수에 평균 저장
	}

	public static void k27_TailPrint() { // 꼬리인쇄에 관한 메소드 생성
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		System.out.printf("국어합계  %5d   국어평균: %6.2f\n", k27_sumkor, k27_sumkor / (double) k27_ArrayOneRec.size());
		// 국어합계와 국어의 평균을 계산하여 출력
		System.out.printf("영어합계  %5d   영어평균: %6.2f\n", k27_sumeng, k27_sumeng / (double) k27_ArrayOneRec.size());
		// 영어합계와 영어의 평균을 계산하여 출력
		System.out.printf("수학합계  %5d   수학평균: %6.2f\n", k27_summat, k27_summat / (double) k27_ArrayOneRec.size());
		// 수학합계와 수학의 평균을 계산하여 출력
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		System.out.printf("반평균합계 %4d   반평균: %6.2f\n", k27_sumavg, k27_sumavg / (double) k27_ArrayOneRec.size());
		// 반평균의 합계와 반평균을 계산하여 출력
	}

}
