package Apr15th_04;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܼ���
		//
		int k27_iA, k27_iB; // ������ ���� �ΰ� ����
		k27_iA = 0; // k27_iA�� ���� �ʱ�ȭ
		while (true) { // while�� ���ǽĿ� true�� ����Ͽ� ���ѷ��� ����
			k27_iB = 0; // k27_iB�� ���� �ʱ�ȭ
			while (true) { // while�� ���ǽĿ� true�� ����Ͽ� ���ѷ��� ����
				System.out.printf("��"); // ���� ���
				if (k27_iA == k27_iB) { // k27_iA �� k27_iB �� ���� ���ٸ�
					break; // ���� while���� ������
				}
				k27_iB++; // k27_iB�� ���� 1 ����
			}
			System.out.printf("\n"); // ���� ������ ������ŭ ��������� �ٹٲ�
			k27_iA++; // k27_iA�� ���� 1 ����
			if (k27_iA == 30) { // k27_iA�� ���� 30�̶��
				break; // �ٰ��� while���� ������
			}
		} // k27_iA�� �� ��° ���ΰ� k27_iB�� �� ���� ���� ����
	}
}
