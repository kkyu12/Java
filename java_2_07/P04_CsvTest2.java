package Java_2_07_1;

public class P04_CsvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k27_OneRec = { "�ڵ�,�ü��ڵ�,�⵵,��,�ο�", "1,�ٷ������պ�����,2017,1,21862", "2,�ٷ������պ�����,2017,2,21691",
				"3,�ٷ������պ�����,2017,3,17164", "4,�ùκ���ȸ��,2017,2,50", "5,�ùκ���ȸ��,2017,3,1810", "6,�ȽĿ�,2017,1,293",
				"7,�ȽĿ�,2017,2,285", "8,�ȽĿ�,2017,3,309", "9,�Ƚİ���,2017,1,54", "10,�Ƚİ���,2017,2,59" };
		// ���ڿ� �迭 ������ ���� ����
		String[] k27_field_name = k27_OneRec[0].split(","); // ��� �κ� ��ǥ������ ����
		for (int k27_i = 1; k27_i < k27_OneRec.length; k27_i++) { // �迭 0 �� ����̹Ƿ� �迭�� 1 ���� ������ for��
			String[] k27_field = k27_OneRec[k27_i].split(","); // ���� �κ� ��ǥ������ ����
			System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
			for (int k27_j = 0; k27_j < k27_field_name.length; k27_j++) {
				// �� �׸��� ����ϱ� ���� k27_field_name �� ���� ��ŭ for��
				System.out.printf(" %s : %s\n", k27_field_name[k27_j], k27_field[k27_j]);
				// ����� �� �׸� ������ ���
			}
			k27_number_read(k27_field[4]); // �����б⸦ �޼ҵ�� ����� ���� ������ �ο��� �д� ���ڷ� �ٲ�
			System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");

		}

	}

	static void k27_number_read(String k27_string) {
		String k27_sNumVoice = ""; // ���ڿ� ����, ""���� ����ִ� ���� ����
		int k27_i, k27_j; // ������ ���� �� �� ����
		String[] k27_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		// ���ڿ� �迭 ����� ���� �д�
		String[] k27_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
		// ���ڿ� �迭 ����� ���ڸ� ���� �� �ʿ��� ���� ����
		k27_i = 0; // k27_i���� 0���� �ʱ�ȭ
		k27_j = k27_string.length() - 1; // k27_sNumVal�� ���̺��� 1 ���� ���� ����
		while (true) { // while�� ���ǽĿ� true�� ����Ͽ� ���ѷ��� ����
			if (k27_i >= k27_string.length()) // ���� k27_i�� k27_sNumVal�� ���̺��� ũ�ų� ���ٸ�
				break; // while�� ������
			// ���ڸ��� �߶� ���� ��� + �� ���ڸ� �д� ������ ��ȯ�Ͽ� ���
			if (k27_string.substring(k27_i, k27_i + 1).equals("0")) { // �ش��ڸ��� 0�̸� �������� ����
				if (k27_unitX[k27_j].equals("��") || k27_unitX[k27_j].equals("��")) {
					k27_sNumVoice = k27_sNumVoice + "" + k27_unitX[k27_j];
					// �ڸ����� ���̰ų� ���� �� ���� ���� �߰�
					if (k27_string.substring(k27_string.length() - 8, k27_string.length() - 4).equals("0000")) {
						k27_sNumVoice = k27_sNumVoice.replace("��", "");
						// ���� õ�� �鸸 �ʸ� �� ��� 0�̶�� ���� �������� ��ü
					}
				}
			} else {
				k27_sNumVoice = k27_sNumVoice + k27_units[Integer.parseInt(k27_string.substring(k27_i, k27_i + 1))]
						+ k27_unitX[k27_j];
			} // �� �ڸ������� 0�� �ƴ϶�� k27_sNumVoice �� �д� ���ڸ� ���ڸ��� �����ش�
			k27_i++; // �տ� ���ڿ��� �ڷ� ���� ���ڷ� �Ѿ��
			k27_j--; // k27_unitX���� �ڿ������� ������ �ε��� �Ѿ��
		}
		System.out.printf(" [%s]\n", k27_sNumVoice); // �д� ���ڷ� ���
	}

}
