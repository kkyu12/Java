package Apr15th_04;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sin�Լ� �׷���
		//
		// 360�� : 2pi = 1�� : x
		double k27_fSin; // �Ǽ��� ���� ����
		for (int k27_i = 0; k27_i < 360; k27_i++) { // k27_i �� 0 ���� 359 ���� for��
			k27_fSin = Math.sin(k27_i * 3.141592 / 180); // sin�Լ����� ���
			System.out.printf("%d sin ==> %f\n", k27_i, k27_fSin);
		} // 1 ������ 180��/���� �̰� 1���� ����/180���� �̴�
			// �� k27_i * 3.141592 / 180 �� 0������ 359�������� ���� ���� ���ȴ�

		System.out.printf("\n\n");

		for (int k27_i = 0; k27_i < 360; k27_i++) { // k27_i �� 0 ���� 359 ���� for��
			k27_fSin = Math.sin(k27_i * 3.141592 / 180); // sin�Լ����� ���
			int k27_iSpace = (int) ((1.0 - k27_fSin) * 50); // ���⸦ �󸶳� ���� ���
			// sin�Լ����� -1���� 1���� ���´� 1 - sin ���� 0���� 2�� ���
			// �׸��� �� ���� * 50�� �Ͽ� 0���� 100���� �������� �����Ͽ���
			for (int k27_j = 0; k27_j < k27_iSpace; k27_j++) { // k27_j�� 0���� k27_iSpace ���� for��
				System.out.printf(" "); // ���⸦ ���
			}
			System.out.printf("��[%f][%d]\n", k27_fSin, k27_iSpace); // ���� ���ΰ��� ���ⰳ���� ���
		}
	}
}
