package Apr15th_04;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ��2
		//
		for (int k27_i = 1; k27_i < 13; k27_i++) { // k27_i�� 1~12���� for�� ���ư���
			System.out.printf(" %d�� =>", k27_i); // �� ������ ���
			for (int k27_j = 1; k27_j < 32; k27_j++) { // k27_j�� 1~32���� for�� ���ư���
				System.out.printf("%d,", k27_j); // ��ĥ���� ���
				if (k27_i == 4 || k27_i == 6 || k27_i == 9 || k27_i == 11) { // 4�� 6�� 9�� 11���̸�
					if (k27_j == 30) // 30�ϱ��� ����ϰ�
						break; // ���� for�� ������
				}
				if (k27_i == 2) { // ���� 2���̸�
					if (k27_j == 28) // 28�ϱ��� ����ϰ�
						break; // ���� for�� ������
				}
			}
			System.out.printf("\n"); // ���� �Ѿ�� �� �� ����
		}
		

		
		

	}

}
