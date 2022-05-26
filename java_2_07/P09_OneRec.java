package Java_2_07_1;

public class P09_OneRec {
	private int k27_student_id; // 학생 번호 정수형 변수 선언
	private String k27_name; // 학생 이름 문자열 변수 선언
	private int k27_kor; // 국어 성적 정수형 변수 선언
	private int k27_eng; // 영어 성적 정수형 변수 선언
	private int k27_mat; // 수학 성적 정수형 변수 선언

	public P09_OneRec(int k27_student_id, String k27_name, int k27_kor, int k27_eng, int k27_mat) {
		// 학생번호, 이름, 국어성적, 영어성적, 수학성적을 변수로 받는 메소드 생성
		this.k27_student_id = k27_student_id; //학생 번호를 학생번호로 받기
		this.k27_name = k27_name; // 학생 이름을 학생이름으로 받기
		this.k27_kor = k27_kor; // 국어성적을 국어성적으로 받기
		this.k27_eng = k27_eng; // 영어성적을 영어성적으로 받기
		this.k27_mat = k27_mat; // 수학성적을 수학성적으로 받기
	}

	public int k27_student_id() { // 학생번호에 관한 메소드 생성
		return this.k27_student_id; // 맨위의 학생번호를 돌려줌 
	}

	public String k27_name() { // 이름에 관한 메소드 생성
		return this.k27_name; // 맨위의 이름을 돌려줌
	}

	public int k27_kor() { // 국어 성적에 관한 메소드 생성
		return this.k27_kor; // 맨위의 국어 성적을 돌려줌
	}

	public int k27_eng() { // 영어 성적에 관한 메소드 생성
		return this.k27_eng; // 맨위의 영어 성적을 돌려줌
	}

	public int k27_mat() { // 수학 성적에 관한 메소드 생성
		return this.k27_mat; // 맨위의 수학 성적을 돌려줌
	}

	public int k27_sum() { // 성적의 합에 관한 메소드 생성
		return this.k27_kor + this.k27_eng + this.k27_mat;
		// 국어성정+영어성적+수학성적을 더한 값을 돌려줌
	}

	public double k27_avg() { // 성적의 평균에 관한 메소드 생성
		return k27_sum() / 3.0; // 위의 합을 3.0으로 나눈 값을 돌려줌
	}
}
