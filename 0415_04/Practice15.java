package Apr15th_04;

import java.text.DecimalFormat;

public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ĭ ���߱� �ǽ�
		//
		String k27_item = "���"; // ���ڿ� ���� ����, "���"�� ����
		int k27_unit_price = 5000; // ������ ���� ����, 5000�� ����
		int k27_num = 500; // ������ ���� ����, 500�� ����
		int k27_total = 0; // ������ ���� ���� 0���� �ʱ�ȭ

		DecimalFormat k27_df = new DecimalFormat(" ###,###,###,###,###"); // DecimalFormat�̶� Ŭ������ ���
		// ���ڸ����� �޸��� �����
		
		// ��� ���
		System.out.printf("=======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%10.10s\n", "ǰ��", "�ܰ�", "����", "�հ�");
		// %20.20s ���� ������ ����Ͽ� ĭ���� �����
		System.out.printf("=======================================================\n");
		// �� ���
		System.out.printf("%20.20s%10.10s%10.10s%12.12s\n", k27_item, k27_df.format(k27_unit_price),
				k27_df.format(k27_num), k27_df.format(k27_unit_price * k27_num));
		// ���ݰ� ���� �հ迡 k27_df.format�� ����Ͽ� ���ڸ����� �޸��� ����ϵ��� ����
		System.out.printf("=======================================================\n");
	}

}
