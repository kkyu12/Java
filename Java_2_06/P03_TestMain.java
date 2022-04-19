package Java_2_06;

public class P03_TestMain {

	private static int k27_inVal; // 정수형 변수 선언

	public static void k27_up2() {
		k27_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", k27_inVal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k27_inVal = 0; // 클래스 안의 변수 사용
		P03_Elevater k27_elev; // 클래스를 받아 객체를 만듬
		k27_elev = new P03_Elevater(); // 인스턴스를 생성하여 객체에 연결

		k27_up2(); // 이건 그냥 현재 클래스내 메소드
		for (int k27_i = 0; k27_i < 10; k27_i++) { // 0~9까지 for문
			k27_elev.k27_up(); // 엘레베이터 클래스를 찍어낸
			// elev객체(이건 인스턴스를 가지고 있음)의 k27_up()메소드
			System.out.printf("MSG[%s]\n", k27_elev.k27_help); // elev내의 k27_help를 출력
		}

		for (int k27_i = 0; k27_i < 10; k27_i++) { // 0~9까지 for문
			k27_elev.k27_down(); // 엘레베이터 클래스의 elev객체의 k27_down()메소드
			System.out.printf("MSG[%s]\n", k27_elev.k27_help); // elev내의 k27_help를 출력
		}
	}

}
