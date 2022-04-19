package Java_2_06;

public class P02_MethodTest {

	static int k27_iStatic; // 클래스내 전역 변수 static에 주의, 값이 계속 유지 된다

	public static void k27_add(int k27_i) { // 더하는 메소드를 선언
		k27_iStatic++; // k27_iStatic에 1을 더함
		k27_i++; // k27_i에 1을 더함
		System.out.printf("add메소드에서->k27_iStatic=[%d]\n", k27_iStatic); // 메소드를 통해 k27_iStatic + 1
		System.out.printf("add메소드에서->k27_i=[%d]\n", k27_i); // 메소드를 통해 k27_i + 1
	}

	public static int k27_add2(int k27_i) { // void 대신에 int 가 들어가 있는 메소드 선언
		k27_iStatic++; // k27_iStatic에 1을 더함
		k27_i++; // k27_i에 1을 더함
		System.out.printf("add2메소드에서->k27_iStatic=[%d]\n", k27_iStatic); // 메소드를 통해 k27_iStatic + 1
		System.out.printf("add2메소드에서->k27_i=[%d]\n", k27_i); // 메소드를 통해 k27_i + 1
		return k27_i; // k27_i 값을 메인으로 다시 돌려줌
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_iMain; // 정수형 변수 선언
		k27_iMain = 1; // 값 1 대입
		k27_iStatic = 1; // k27_iStatic에 값 1 대입
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		System.out.printf("메소드호출전 메인에서->k27_iStatic=[%d]\n", k27_iStatic); // 결과값 1
		System.out.printf("메소드호출전 메인에서->k27_iMain=[%d]\n", k27_iMain); // 결과값 1
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");

		k27_add(k27_iMain); // 더하는 함수 호출 결과값 2, 2

		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		System.out.printf("메소드호출후 메인에서->k27_iStatic=[%d]\n", k27_iStatic); // 결과값 2
		System.out.printf("메소드호출후 메인에서->k27_iMain=[%d]\n", k27_iMain); // 결과값 1
		// k27_iMain값이 1인 이유 더하는 함수에서 더하긴 했지만 다시 돌려받지 못했다
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");

		k27_iMain = k27_add2(k27_iMain); // 값을 전달하고 return을 사용하여 값을 다시 받는 방법이 이해가 쉽다
		// 전역변수로 선언 후 어느 메소드를 통해서 값이 변경되는지 로직을 파악하기 어렵다
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		System.out.printf("메소드 add2호출후 메인에서->k27_iStatic=[%d]\n", k27_iStatic); // 결과값 3
		System.out.printf("메소드 add2호출후 메인에서->k27_iMain=[%d]\n", k27_iMain); // 결과값 2
		// k27_add 와 다르게 k27_add2은 값을 리턴해주므로 결과값이 2가 되어 출력된다
		System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
	}
}
