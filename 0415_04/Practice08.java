package Apr15th_04;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case�� ��
		//
		for (int k27_i = 1; k27_i < 13; k27_i++) { // k27_i�� 1~12���� for�� ���ư���
			System.out.printf(" %d�� =>", k27_i); // �� ������ ���
			LOOP: for (int k27_j = 1; k27_j < 32; k27_j++) { // k27_j�� 1~31���� for�� ���ư���
				System.out.printf("%d,", k27_j); // ��ĥ���� ���
				switch (k27_i) { // ��������� �������� ���
				case 4: // 4���̸�
				case 6: // 6���̸�
				case 9: // 9���̸�
				case 11: // 11���̸�
					if (k27_j == 30) // ���� 30���̸�
						break LOOP; // ���߰� ���� for������ ���ư���
					break; // ���� for�� ������
					// ���� �̷� ǥ���� �Ⱦ��� LOOP��� ǥ���ڰ� ������ ������ ����� ���´�
				case 2: // 2���̰�
					if (k27_j == 28) // 28���̸�
						break LOOP; // ���߰� ���� for������ ���ư���
					break; // ���� for�� ������
				}
			}
			System.out.printf("\n"); // ���� ������ �� �� ����
		}
	}

}
