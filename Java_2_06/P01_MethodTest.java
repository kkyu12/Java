package Java_2_06;

public class P01_MethodTest {
	
	public static void k27_iamMethod() { // Method 선언
		System.out.printf("메소드라 불러줘요~~\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P01_MethodTest.k27_iamMethod(); // 메소드를 부르는 방법 1
		// 원칙적으로 메소드 부르는 법 클래스명.메소드명
		k27_iamMethod(); // 메소드를 부르는 방법2
		//같은 클래스 안에서 함수를 정의하면 함수 이름만으로 불러올 수 있다
	}

}
