package Java_2_06;

public class P03_TestMain {

	private static int k27_inVal; // ������ ���� ����

	public static void k27_up2() {
		k27_inVal++;
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k27_inVal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k27_inVal = 0; // Ŭ���� ���� ���� ���
		P03_Elevater k27_elev; // Ŭ������ �޾� ��ü�� ����
		k27_elev = new P03_Elevater(); // �ν��Ͻ��� �����Ͽ� ��ü�� ����

		k27_up2(); // �̰� �׳� ���� Ŭ������ �޼ҵ�
		for (int k27_i = 0; k27_i < 10; k27_i++) { // 0~9���� for��
			k27_elev.k27_up(); // ���������� Ŭ������ ��
			// elev��ü(�̰� �ν��Ͻ��� ������ ����)�� k27_up()�޼ҵ�
			System.out.printf("MSG[%s]\n", k27_elev.k27_help); // elev���� k27_help�� ���
		}

		for (int k27_i = 0; k27_i < 10; k27_i++) { // 0~9���� for��
			k27_elev.k27_down(); // ���������� Ŭ������ elev��ü�� k27_down()�޼ҵ�
			System.out.printf("MSG[%s]\n", k27_elev.k27_help); // elev���� k27_help�� ���
		}
	}

}
