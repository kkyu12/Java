package Apr15th_04;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����б�
		//
		// ������ �ִ� ��, ���� �ڸ���
		String[] k27_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		// ���ڿ� �迭 ����� �� ����
		for (int k27_i = 0; k27_i < 101; k27_i++) { // 0 ~ 100 ���� for��
			if (k27_i >= 0 && k27_i < 10) { // k27_i ���� 0 ~ 9���
				System.out.printf("���� �ڸ� : %s\n", k27_units[k27_i]);
			} else if (k27_i >= 10 && k27_i < 100) { // k27_i ���� 10 ~ 99���
				int k27_i10, k27_i0; // ������ ���� �ΰ� ����
				k27_i10 = k27_i / 10; // k27_i�� 10 ���� ���� ���� k27_i10 ����
				k27_i0 = k27_i % 10; // k27_i�� 10���� ���� �������� k27_i0 �� ����
				if (k27_i0 == 0) { // ���� k27_i�� 10���� ���� �������� 0�̶��
					System.out.printf("���� �ڸ� : %s��\n", k27_units[k27_i10]); // �۽��� ���
				} else { // �� �� k27_i�� 10���� ���� �������� 0�� �ƴ϶��
					System.out.printf("���� �ڸ� : %s��%s\n", k27_units[k27_i10], k27_units[k27_i0]);
				} // �۽ʡ��� ����� ���
			} else {
				System.out.printf("==> %d\n", k27_i); // ���������� k27_i�� 100�� �� ���
			}
		}
	}

}
