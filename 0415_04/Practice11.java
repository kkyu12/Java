package Apr15th_04;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����б���
		//
		// 1001034567 2000000000 2030200000
		int k27_iNumVal = 2030200000; // ������ ���� ����� �� ����
		String k27_sNumVal = String.valueOf(k27_iNumVal); // ���ڿ� ����, k27_iNumVal�� ����ȯ �� ����
		String k27_sNumVoice = ""; // ���ڿ� ����, ""���� ����ִ� ���� ����
		System.out.printf("==> %s [%d�ڸ�]\n", k27_sNumVal, k27_sNumVal.length());
		// ���� k27_iNumVal�� �ڸ����� ����ϰ� ���
		int k27_i, k27_j; // ������ ���� �� �� ����

		String[] k27_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		// ���ڿ� �迭 ����� ���� �д�
		String[] k27_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
		// ���ڿ� �迭 ����� ���ڸ� ���� �� �ʿ��� ���� ����
		k27_i = 0; // k27_i���� 0���� �ʱ�ȭ
		k27_j = k27_sNumVal.length() - 1; // k27_sNumVal�� ���̺��� 1 ���� ���� ����
		while (true) { // while�� ���ǽĿ� true�� ����Ͽ� ���ѷ��� ����
			if (k27_i >= k27_sNumVal.length()) // ���� k27_i�� k27_sNumVal�� ���̺��� ũ�ų� ���ٸ�
				break; // while�� ������
			System.out.printf("%s[%s]", k27_sNumVal.substring(k27_i, k27_i + 1),
					k27_units[Integer.parseInt(k27_sNumVal.substring(k27_i, k27_i + 1))]);
			// ���ڸ��� �߶� ���� ��� + �� ���ڸ� �д� ������ ��ȯ�Ͽ� ���
			if (k27_sNumVal.substring(k27_i, k27_i + 1).equals("0")) { // �ش��ڸ��� 0�̸� �������� ����
				if (k27_unitX[k27_j].equals("��") || k27_unitX[k27_j].equals("��")) {
					k27_sNumVoice = k27_sNumVoice + "" + k27_unitX[k27_j];
					// �ڸ����� ���̰ų� ���� �� ���� ���� �߰�
					if (k27_sNumVal.substring(k27_sNumVal.length() - 8, k27_sNumVal.length() - 4).equals("0000")) {
						k27_sNumVoice = k27_sNumVoice.replace("��", "");
						// ���� õ�� �鸸 �ʸ� �� ��� 0�̶�� ���� �������� ��ü
					}
				}
			} else {
				k27_sNumVoice = k27_sNumVoice + 
						k27_units[Integer.parseInt(k27_sNumVal.substring(k27_i, k27_i + 1))] 
						+ k27_unitX[k27_j];
			} // �� �ڸ������� 0�� �ƴ϶�� k27_sNumVoice �� �д� ���ڸ� ���ڸ��� �����ش�
			k27_i++; // �տ� ���ڿ��� �ڷ� ���� ���ڷ� �Ѿ��
			k27_j--; // k27_unitX���� �ڿ������� ������ �ε��� �Ѿ��
		}
		System.out.printf("\n %s[%s]\n", k27_sNumVal, k27_sNumVoice);

	}

}
