package Java_2_06;

public class P04_TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P04_TvRemocon k27_remote = new P04_TvRemocon(); // �ٸ� Ŭ������ �޾� ��ü�� �����
		// �ν��Ͻ��� �����Ͽ� ��ü�� ����
		for (int k27_i = 0; k27_i < 10; k27_i++) { // 10���� for��
			k27_remote.k27_ChannelUp(); // ä�� �ø��� �޼ҵ� ��������
			System.out.printf("MSG[%s]\n", k27_remote.k27_help); // P04_TvRemocon���� k27_help ���
		}

		for (int k27_i = 0; k27_i < 10; k27_i++) { // 10���� for��
			k27_remote.k27_ChannelDown(); // ä�� ������ �޼ҵ� ��������
			System.out.printf("MSG[%s]\n", k27_remote.k27_help); // P04_TvRemocon���� k27_help ���
		}

		for (int k27_i = 0; k27_i < 5; k27_i++) { // 5���� for��
			k27_remote.k27_VolUp(); // ���� �ø��� �޼ҵ� ��������
			System.out.printf("MSG[%s]\n", k27_remote.k27_help); // P04_TvRemocon���� k27_help ���
		}

		for (int k27_i = 0; k27_i < 5; k27_i++) { // 5���� for��
			k27_remote.k27_VolDn(); // ���� ������ �޼ҵ� ��������
			System.out.printf("MSG[%s]\n", k27_remote.k27_help); // P04_TvRemocon���� k27_help ���
		}
	}

}
