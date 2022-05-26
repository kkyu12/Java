package Java_2_07_1;

public class P06_MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_iPerson = 5; // 이 값을 주는 만큼 저장소 생성
		P06_OneRec[] k27_inData = new P06_OneRec[k27_iPerson];
		// 클래스 형태의 배열이 생성
		for (int k27_i = 0; k27_i < k27_iPerson; k27_i++) { // k27_iPerson 만큼 돌아가는 for문
			String k27_name = String.format("길동%02d", k27_i + 1); // 이름
			int k27_kor = (int) (Math.random() * 100); // 국어 성적
			int k27_eng = (int) (Math.random() * 100); // 영어 성적
			int k27_mat = (int) (Math.random() * 100); // 수학 성적
			k27_inData[k27_i] = new P06_OneRec(k27_name, k27_kor, k27_eng, k27_mat); // 배열에 저장

			System.out.printf("번호:%d, 이름:%s, 국어:%3d, 영어:%3d, 수학:%3d, 총점:%4d, 평균:%5.1f\n", k27_i + 1,
					k27_inData[k27_i].k27_name(), k27_inData[k27_i].k27_kor(), k27_inData[k27_i].k27_eng(),
					k27_inData[k27_i].k27_mat(), k27_inData[k27_i].k27_sum(), k27_inData[k27_i].k27_avg());
			// 각각의 값을 출력
		}
	}
}
