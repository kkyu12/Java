package Apr15th_04;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array�̿� ��
		//
		int[] k27_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // ������ �迭 k27_iLMD �����
		// ������ ������ �ϼ��� �迭�� ����
		for (int k27_i = 1; k27_i < 13; k27_i++) { // 1������ 12�� ���� for��
			System.out.printf(" %d�� =>", k27_i); // ���� ���
			for (int k27_j = 1; k27_j < 32; k27_j++) { // 1�Ϻ��� 31�ϱ��� for��
				System.out.printf("%d", k27_j); // ���� ���
				if (k27_iLMD[k27_i - 1] == k27_j) // �迭�� �ε����� 0���� �����ϹǷ� k27_i - 1 �� ���
					break; // �迭�� ���ڿ� ���� for���� k27_j���� ������ ���� for�� ������
				System.out.printf(","); // ������ ��ǥ�� �� ���
			}
			System.out.printf("\n"); // ������ �ٹٲ�
		}
	}

}
