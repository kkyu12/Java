package Apr15th_04;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if ��
		//
		int k27_score = 91; // ������ ���� ����, ���� ���������� ������ �� ����
		int k27_num = 0; // ������ ���� ����, ���� ���������� ������ �� ����
		if (k27_score > 60) { // 60 ����ũ��
			System.out.println("�հ��Դϴ�.");
		}
		if (k27_score > 60) { // 60 ����ũ��
			System.out.println("�հ��Դϴ�.");
		} else { // 60 ���ϸ�
			System.out.println("���հ��Դϴ�.");
		}

		if (k27_num > 0) { // 0���� ũ��
			System.out.println("����Դϴ�.");
		} else if (k27_num < 0) { // 0���� ������
			System.out.println("�����Դϴ�.");
		} else { // �� ���� 0 �� ���
			System.out.println("���Դϴ�.");
		}

		if (k27_score >= 90) { // 90�̻��̸�
			System.out.println("A���");
		} else if (k27_score >= 80) { // 90�̸� 80�̻��̸�
			System.out.println("B���");
		} else if (k27_score >= 70) { // 80�̸� 70�̻��̸�
			System.out.println("C���");
		} else { // 70�̸��̸�
			System.out.println("F���");
		}

		System.out.println("\n");

		
		
		// switch / case ��
		//
		String k27_jumin = "123456-1234567"; // ���ڿ� ���� ����� ����
		switch (k27_jumin.charAt(7)) { // �ε��� 0 ���� ī��Ʈ�Ƿ� -�ڿ� ���ڸ� ������
		case '1': // �ֹι�ȣ ���ڸ��� ù��° ���ڰ� 1�̸�
			System.out.printf("20������ �¾ ���� ���\n");
			// case '1'���� break�� ���� ������ case '2'�� �Ѿ�� 20������ �¾ ���� ����� ��µ�
		case '2': // �ֹι�ȣ ���ڸ��� ù��° ���ڰ� 2�̸�
			System.out.printf("20������ �¾ ���� ���\n");
			break; // ���� ����� ����ߴٸ� switch������ ������
		case '3': // �ֹι�ȣ ���ڸ��� ù��° ���ڰ� 3�̸�
			System.out.printf("20������ �¾ ���� ���\n");
			break; // ���� ����� ����ߴٸ� switch������ ������
		case '4': // �ֹι�ȣ ���ڸ��� ù��° ���ڰ� 4�̸�
			System.out.printf("20������ �¾ ���� ���\n");
			break; // ���� ����� ����ߴٸ� switch������ ������
		default: // ���࿡ 1, 2, 3, 4 �� ���� �ƴ϶�� �׿��� ���̶��
			System.out.printf("���");
			break; // ���� ����� ����ߴٸ� switch������ ������
		}

		
		
		System.out.println("\n");
		
		

		// �⺻ for��
		//
		int k27_sum = 0; // ������ ���� ����, 0���� �ʱ�ȭ
		for (int k27_i = 0; k27_i < 10; k27_i++) { // ������ ���� k27_i�� 0~9���� 1�� �����ϴ� ����
			k27_sum = k27_sum + k27_i; // k27_sum�� k27_i�� ��� ���Ѵ�
		}
		System.out.printf("sum %d\n", k27_sum); // ������ ����̹Ƿ� %d ���

		System.out.println("\n");

		// ���� for��
		//
		for (int k27_i = 1; k27_i < 10; k27_i++) { // ������ ���� k27_i�� 1~9���� 1�� �����ϴ� for�� ���
			System.out.printf("****************\n");
			System.out.printf("   ������ %d��\n", k27_i); // ������ �� ������ ���
			System.out.printf("****************\n");
			for (int k27_j = 1; k27_j < 10; k27_j++) { // ������ ���� k27_j�� 1~9���� 1�� �����ϴ� for�� ���
				System.out.printf("   %d * %d = %2d \n", k27_i, k27_j, k27_i * k27_j);
				// �������� ��� �������� ���� ����� ��(k27_i * k27_j)���� 2ĭ�� ����
			}
		}
	}

}
