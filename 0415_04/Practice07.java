package Apr15th_04;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ��3
		//
		for (int k27_i = 1; k27_i < 13; k27_i++) { // k27_i�� 1~12���� for�� ���ư���
			System.out.printf(" %d�� =>", k27_i); // �� ������ ���
			for (int k27_j = 1; k27_j < 32; k27_j++) { // k27_j�� 1~31���� for�� ���ư���
				System.out.printf("%d,", k27_j); // ��ĥ���� ���
				if ((k27_i == 4 || k27_i == 6 || k27_i == 9 || k27_i == 11) && (k27_j == 30))
					break; // (4�� or 6�� or 9�� or 11��) �׸��� 30���̸� ���� for�� ������
				if (k27_i == 2 && k27_j == 28) // 2���̰� 28���̸�
					break; //���� for�� ������
			}
			System.out.printf("\n"); // ���� �Ѿ�� �� �� ����
		}
	}

}
