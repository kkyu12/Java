package Apr15th_04;

public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Ƕ�̵� ���
		//
		int k27_n, k27_m; // ������ ���� �ΰ� ����
		k27_m = 20;
		k27_n = 1; // k27_m ���� 20 ���� k27_n ���� 1 ����
		while (true) { // while�� ���ǽĿ� true�� ����Ͽ� ���ѷ��� ����
			for (int k27_i = 0; k27_i < k27_m; k27_i++) { // k27_i�� 0 ���� k27_m-1���� for��
				System.out.printf(" "); // ���� ���
			}
			for (int k27_i = 0; k27_i < k27_n; k27_i++) { // k27_i�� 0 ���� k27_n-1���� for��
				System.out.printf("��"); // �� ���
			}
			System.out.printf("\n"); // �ٹٲٱ�
			k27_m = k27_m - 1; // k27_m ���� �Ѱ��� ���̱�
			k27_n = k27_n + 2; // k27_n ���� �ΰ��� Ű���
			if (k27_m < 0) { // ���� k27_m���� 0���� �۴ٸ�
				break; // while�� �����
			}
		}
	}

}
