package Apr14th_03;

import java.text.DecimalFormat; // �޸��� ��� ���� import �߰�
import java.text.SimpleDateFormat; // ��¥�� ����ϱ� ���� import �߰�
import java.util.Calendar; // ����ð��� �������� ���� import

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���غ��� �� �ȴ�

		// 1 �ܼ� ȯ�� ���
		//
		int k27_MyWon = 1000000; // ȯ���ϰ� ���� ��ȭ �鸸���� ���� k27_MyWon�� ����
		double k27_MoneyEx = 1238.21; // ȯ���� ���� k27_MoneyEx�� ����
		double k27_commission = 0.003; // ȯ���������� 0.003�� ���� k27_commission�� ����
										// ������ �����Ҷ� �߻����غ��� ������ �ڷ��� �����ϱ�-�߿�!
		int k27_usd = (int) (k27_MyWon / k27_MoneyEx); // ȯ���ؼ� ���� �޷� ����ϱ� ��ȭ/ȯ�� ���
													   //������� k27_usd�� ����
		int k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx); // ���� �� ����ϱ� 
														//0.1���� ������ ���������� ������ ����ȯ�ϱ�
		System.out.printf("*******************************************************\n");
		System.out.printf("*                   ��������� ���                   *\n");
		System.out.printf("�� ��ȭȯ���ݾ�: %d��=> ��ȭ: %d�޷�, �ܵ�: %d��\n", k27_MyWon, 
				k27_usd, k27_remain);
		System.out.printf("*******************************************************\n\n\n");

		// 2 ������ ���� ȯ�� ���_1
		//
		double k27_ComPerOne = k27_MoneyEx * k27_commission; // 1�޷��� ������ = ȯ�� * ȯ��������
		double k27_totalcom = k27_usd * k27_ComPerOne; // �� ������ = ȯ���ؼ� ���� �޷� * 1�޷��� ������

		System.out.printf("*******************************************************************\n");
		System.out.printf("*                           ������ ���                           *\n");
		System.out.printf("�� ������: %f��=> ��ȭ: %d�޷�, �޷��� ������: %f��\n", k27_totalcom, 
				k27_usd, k27_ComPerOne);
		System.out.printf("*******************************************************************\n\n\n");

		// 3 ������ ���� ȯ�� ���_2
		//
		int k27_i_totalcom; // �� �����Ḧ ������ ��Ÿ���� �Ѵ� �� �� �ø��� �ؾ� ��! 
							//������� �� �޾ƾ� �Ѵ�
		if (k27_totalcom != (double) ((int) k27_totalcom)) { // �� ���� �ٸ��� 1���� �� �����ῡ 1�� �����ش�
			k27_i_totalcom = (int) k27_totalcom + 1; // �� ���� �ٸ����� �Ҽ������� �ڸ��� �ְ� 
													 //1�� �̸����� 1������ �÷��� �޴´�
		} else {
			k27_i_totalcom = (int) k27_totalcom; // �� ���� ������ �״�� ������ �� �����ῡ ����
		}

		System.out.printf("***************************************************************************\n");
		System.out.printf("*                             ������ ����ȯ��                             *\n");
		System.out.printf("�� ������: %d��=> ��ȭ: %d�޷�, �޷��� ������: %f��\n", k27_i_totalcom, 
				k27_usd, k27_ComPerOne);
		k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx - k27_i_totalcom);
		System.out.printf("�� ��ȭȯ���ݾ�: %d��=> ��ȭ: %d�޷�, ������¡��:%d�� �ܵ�: %d��\n", k27_MyWon, 
				k27_usd, k27_i_totalcom, k27_remain);
		System.out.printf("***************************************************************************\n\n\n");
		// �ܵ��� ������ ���´� �� �� �մ��� ���� �ִ� ���� �� 100�����̶�� ��ϴ°�?

		// 4 ������ ���� ȯ�� ���_3
		//
		k27_usd = (int) (k27_MyWon / (k27_MoneyEx + k27_ComPerOne)); // ȯ���޷��� ���� �� 
																	 //�����Ḧ �����ؼ� ������
		k27_totalcom = k27_usd * k27_ComPerOne; // �� ������ = ���� �޷� * 1�޷��� �������̴�
		if (k27_totalcom != (double) ((int) k27_totalcom)) { // �� �������� �Ǽ����� ������ ���� �ٸ���
			k27_i_totalcom = (int) k27_totalcom + 1; // 1���� �����ش�
		} else { // �Ѽ������� �Ǽ����� �������� ���ٸ� �״�� ������ �� �����ῡ ������ �ش�
			k27_i_totalcom = (int) k27_totalcom;
		}

		System.out.printf("*************************************************************************\n");
		System.out.printf("*                        (��Ȯ��) ������ ����ȯ��                       *\n");
		System.out.printf("�� ������: %d��=> ��ȭ: %d�޷�, �޷��� ������: %f��\n", k27_i_totalcom, 
				k27_usd, k27_ComPerOne);
		// 805�޷��� ��µǸ� �����ᰡ ��� ���� ���
		k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx - k27_i_totalcom);
		System.out.printf("�� ��ȭȯ���ݾ�: %d��=> ��ȭ: %d�޷�, ������¡��:%d�� �ܵ�: %d��\n", k27_MyWon, 
				k27_usd, k27_i_totalcom, k27_remain);
		System.out.printf("*************************************************************************\n\n\n");

		// 5 �޸� ���
		//
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat�̶� 
															//Ŭ������ ����Ͽ� ���ڸ����� �޸��� �������
		System.out.printf("****************************************************************************\n");
		System.out.printf("*                              �޸���� ����                               *\n");
		System.out.printf("�� ������: %s��=> ��ȭ: %s�޷�, �޷��� ������: %f��\n", 
				k27_df.format(k27_i_totalcom), k27_df.format(k27_usd), k27_ComPerOne); 
				// ������� �Ǽ������� ���͵� �ǹǷ� ������ �ȹٲ��ش�
				// k27_df.format(����)�� ����Ͽ� ���ڸ����� �޸��� ����ش�
		k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx - k27_i_totalcom);
		System.out.printf("�� ��ȭȯ���ݾ�: %s��=> ��ȭ: %s�޷�, ������¡��:%s�� �ܵ�: %s��\n", 
				k27_df.format(k27_MyWon), k27_df.format(k27_usd), k27_df.format(k27_i_totalcom), 
				k27_df.format(k27_remain));
		System.out.printf("****************************************************************************\n\n\n");

		// 6 ��¥ ���
		//
		Calendar k27_calt = Calendar.getInstance(); // �ý����� ���� �ð� ��������
		SimpleDateFormat k27_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		// ��¥ ������ ��/��/�� ��:��:�� �� ��������
		System.out.printf("****************************************************************************\n");
		System.out.printf("*                              ���糯¥ ����                               *\n");
		System.out.printf("�� ������: %s��=> ��ȭ: %s�޷�, �޷��� ������: %f��\n", 
				k27_df.format(k27_i_totalcom), k27_df.format(k27_usd), k27_ComPerOne);
		k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx - k27_i_totalcom);
		System.out.printf("�� ��ȭȯ���ݾ�: %s��=> ��ȭ: %s�޷�, ������¡��:%s�� �ܵ�: %s��\n", 
				k27_df.format(k27_MyWon), k27_df.format(k27_usd), k27_df.format(k27_i_totalcom), 
				k27_df.format(k27_remain));
		System.out.printf("��������ð�: %s\n", k27_sdt.format(k27_calt.getTime())); 
		// �ý��ۿ��� ������ �ð��� ���ϴ� �������� ���
		System.out.printf("****************************************************************************\n\n\n");
	}
}
