package Java_2_06;

public class P05_TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P05_Calc1 k27_cc = new P05_Calc1();
		// 다른 클래스를 받아 객체를 만들고 인스턴스를 생성하여 객체에 연결
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k27_cc.k27_sum2(1, 2));
		// 두 개의 정수를 받아서 더하고 정수로 돌려주는 메소드 호출
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k27_cc.k27_sum3(1, 2, 3));
		// 세 개의 정수를 받아서 다 더하고 정수로 돌려주는 메소드 호출
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k27_cc.k27_sum4(1, 2, 3, 4));
		// 네 개의 정수를 받아서 다 더하고 정수로 돌려주는 메소드 호출
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k27_cc.k27_sum(1.3, 2.4));
		// 두 개의 실수를 받아서 더하고 실수로 돌려주는 메소드 호출
	}

}
