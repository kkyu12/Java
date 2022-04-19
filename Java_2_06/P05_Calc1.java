package Java_2_06;

public class P05_Calc1 {

	public int k27_sum2(int k27_a, int k27_b) {
		return k27_a + k27_b;
	} // 두 개의 정수를 받아서 더하고 정수로 돌려주는 메소드

	public int k27_sum3(int k27_a, int k27_b, int k27_c) {
		return k27_a + k27_b + k27_c;
	} // 세 개의 정수를 받아서 다 더하고 정수로 돌려주는 메소드

	public int k27_sum4(int k27_a, int k27_b, int k27_c, int k27_d) {
		return k27_a + k27_b + k27_c + k27_d;
	} // 네 개의 정수를 받아서 다 더하고 정수로 돌려주는 메소드

	public double k27_sum(double k27_a, double k27_b) {
		return k27_a + k27_b;
	} // 두 개의 실수를 받아서 더하고 실수로 돌려주는 메소드

	/*
	 * 만일 위의 sum와 아래 sum은 같이 정의할 수 없다 왜냐면 받는 매개변수가 똑같아서 구별할 수 없기 때문이다 public int
	 * k27_sum(double k27_a, double k27_b) { return (int) (k27_a + k27_b); }
	 */
}
