package Apr15th_04;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������, ������ ��
		//
		int k27_iI; // ������ ���� ����
		double k27_iD; // �Ǽ��� ���� ����

		k27_iI = 10 / 3; // ������ ���� �̹Ƿ� ����ϸ� ���� 3�� ���Ե�
		k27_iD = 10 / 3.0; // �Ǽ��� ���� �̹Ƿ� ����ϸ� 3.333333�� ���Ե�

		// int�� double�� ����������� �Ǽ��������̴�
		if (k27_iI == k27_iD) { // k27_iI �� k27_iD �� ���ٸ�
			System.out.printf("equal\n"); // equal�� ���
		} else { // k27_iI �� k27_iD �� �ٸ��ٸ�
			System.out.printf("Not equal[%f][%f]\n", (double) k27_iI, k27_iD); // Not equal�� ���� ���
			// k27_iI�� �̹� �������� 3�� �ԷµǾ����Ƿ� �տ� �Ǽ������� ����ȯ�� �ص� 3.000000�� ��µ�
		}

		// ���� ��ȿ���ڱ��� ǥ�õ� �� ������ �ٸ���
		if (k27_iD == 3.333333) { // k27_iD �� 3.333333�� ������
			System.out.printf("equal\n");
		} else { // k27_iD �� 3.333333�� �ٸ���
			System.out.printf("Not equal[3.333333][%f]\n", k27_iD);
		} // ���� k27_iD�� 3.3333333333333333...�� ���� ������ 3.333333���� �ٸ����̴�

		k27_iD = (int) k27_iD; // k27_iD�� ���������� ����ȯ 3.000000 �� ���Եȴ�
		if (k27_iI == k27_iD) { // k27_iI �� k27_iI �� ���� ������
			System.out.printf("equal\n"); // �Ǽ��� �������� 3.000000�̹Ƿ� ���ٰ� ���
		} else { // k27_iI �� k27_iI �� ���� �ٸ���
			System.out.printf("Not equal[%f][%f]\n", (double) k27_iI, k27_iD);
		}

		System.out.printf("int�� �μ�[%d][%f]\n", k27_iI, k27_iD); // ���������� �μ�
		System.out.printf("double�� �μ�[%f][%f]\n", (double) k27_iI, k27_iD); // �Ǽ������� �μ�

		char k27_a = 'c'; // k27_a��� ������ ���� ����, 'c'���� ����

		if (k27_a == 'b') { // k27_a �� 'b' ���
			System.out.printf("k27_a�� b�̴�\n"); // ���
		}
		if (k27_a == 'c') { // k27_a �� 'c' ���
			System.out.printf("k27_a�� c�̴�\n"); // ���
		}
		if (k27_a == 'd') { // k27_a �� 'd' ���
			System.out.printf("k27_a�� d�̴�\n"); // ���
		} // ������� 'k27_a�� c�̴�' �� ��µȴ�
		  // �������� ���� �� ��������ǥ�� ���� ��������

		String k27_aa = "abcd"; // k27_aa��� ���ڿ� ���� ����, "abcd"���� ����

		if (k27_aa.equals("abcd")) { // ���ڿ��� ���� ���� equal�� ���
			System.out.printf("k27_aa�� abcd�̴�\n"); // k27_aa�� "abcd"�� ���ٸ� ���
		} else {
			System.out.printf("k27_aa�� abcd�� �ƴϴ�\n"); // k27_aa�� "abcd"�� �ٸ��ٸ� ���
		} // ������� 'k27_aa�� abcd�̴�'�� ��µȴ�
		  // ���ڿ��� ���� �� ū ����ǥ�� ���� ��������

		boolean k27_bb = true; // ���� ���� ����� true�� ����

		if (!!k27_bb) { // true�� �ƴϰ�(false) �ƴϸ�(true) true������ ���ƿ´�
			System.out.printf("k27_bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		} else {
			System.out.printf("k27_bb�� �ƴϰ� �ƴϸ� �����̴�\n");
		} // ������� 'k27_bb�� �ƴϰ� �ƴϸ� ���̴�'�� ��µȴ�
	}

}
