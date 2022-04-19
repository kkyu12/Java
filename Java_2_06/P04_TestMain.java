package Java_2_06;

public class P04_TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P04_TvRemocon k27_remote = new P04_TvRemocon(); // 다른 클래스를 받아 객체를 만들고
		// 인스턴스를 생성하여 객체에 연결
		for (int k27_i = 0; k27_i < 10; k27_i++) { // 10번의 for문
			k27_remote.k27_ChannelUp(); // 채널 올리기 메소드 가져오기
			System.out.printf("MSG[%s]\n", k27_remote.k27_help); // P04_TvRemocon안의 k27_help 출력
		}

		for (int k27_i = 0; k27_i < 10; k27_i++) { // 10번의 for문
			k27_remote.k27_ChannelDown(); // 채널 내리기 메소드 가져오기
			System.out.printf("MSG[%s]\n", k27_remote.k27_help); // P04_TvRemocon안의 k27_help 출력
		}

		for (int k27_i = 0; k27_i < 5; k27_i++) { // 5번의 for문
			k27_remote.k27_VolUp(); // 볼륨 올리기 메소드 가져오기
			System.out.printf("MSG[%s]\n", k27_remote.k27_help); // P04_TvRemocon안의 k27_help 출력
		}

		for (int k27_i = 0; k27_i < 5; k27_i++) { // 5번의 for문
			k27_remote.k27_VolDn(); // 볼륨 내리기 메소드 가져오기
			System.out.printf("MSG[%s]\n", k27_remote.k27_help); // P04_TvRemocon안의 k27_help 출력
		}
	}

}
