package Apr14th_1;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ����� �ǽ�
		String[] k27_item = { "�����", "��������", "����", "������Ʈ", "������" }; // �����̸��� �迭�� �ֱ�
		int[] k27_price = { 1200, 1500, 1400, 3200, 3000 }; // ������ ���� ������ �迭�� �ֱ�
		int[] k27_amount = { 10, 2, 1, 3, 5 }; // ������ ������ ���� ������ �迭�� �ֱ�
		double k27_tax_rate = 0.1; // �ΰ����� 10% = 0.1
		int k27_total_sum = 0; // �� �հ踦 �ʱ�ȭ

		System.out.printf("**************************************\n");
		System.out.printf("                ������                \n");
		System.out.printf(" �� ��          �� ��  �� ��      �հ�\n");
		for (int k27_i = 0; k27_i < k27_item.length; k27_i++) { // 0���� ���ڹ迭�� ���̸�ŭ for�� ������
			int k27_sum = k27_price[k27_i] * k27_amount[k27_i]; // ������ �հ�� ���ڰ��� * ���ڰ���
			k27_total_sum = k27_total_sum + k27_sum; // �� �հ�� ������ �հ踦 �� ���� ��
			System.out.printf("%-6s\t%5d\t%4d %9d\n", k27_item[k27_i], k27_price[k27_i], k27_amount[k27_i], 
					k27_sum);
		} // �׸� ĭ�� -6�� �Ἥ ��������, 6ĭ�� �־��� �ܰ� ���� �հ�� ���� �´� ũ�⸦ ��
		System.out.printf("**************************************\n");
		System.out.printf("���� �ݾ� : %26d\n", k27_total_sum); // �� ������ ��� �������� ���� 
																//26ĭ�� ũ�⸦ ��
		int k27_total_net_price = (int) (k27_total_sum / (1 + k27_tax_rate)); // ��������� ������ 
					//����ϱ����� �Ѱ����� 1+������ ���� �������� ���;� �ϹǷ� �տ� (int) �ִ� ���� ����
		System.out.printf("�����ݾ�  : %26d\n", k27_total_net_price); // ���� �ݾ��� ��� 
																	  //�������� ���� 26ĭ�� ��
		int k27_tax = k27_total_sum - k27_total_net_price; // ���� ����� �� ���ݿ��� �����ݾ��� ��
		System.out.printf("��     �� : %26d\n", k27_tax); // ������ ��� �������� ���� 26ĭ�� ��
	}
}
