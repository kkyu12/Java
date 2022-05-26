package Java_2_07_1;

import java.text.DecimalFormat;

public class P02_ProveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // ���ڸ����� ��ǥ ���
		String[] k27_OneRec = { // ������ ��� ��������
				"����Ȩ SAFE365 10,000,000  1 10,000,000", "(G)LH��������ȭ     6,900 11     75,900",
				"��������E           5,980  1      5,980", "���� ���Ϸ�       3,300  1      3,000",
				"����Ȩ SAFE ��      5,500  2     11,000", "��� �Ŷ��120g     3,360  1      3,360",
				"(��)��������      6,610  1      6,010", "���ѱ� �������     2,750  1      2,750",
				"GAP ������ 4-    10,800  1     10,800", "����ũ ź�θ�       2,480  1      2,480",
				"(����)����߰�      7,920  1      7,920", "DZ�ִϾ�縻3��      4,980  1      4,980",
				"DZ�ִϾ�縻3��     4,980  1      4,980", "�����̾�������      7,130  1      7,130",
				"����ũ ����̿�     3,980  1      3,980", "���� ���ִ¿���     4,480  1      4,480",
				"���������÷�1     4,980  1      4,980", "��������(��)6     3,210  1      3,210",
				"�ɶ�ý� ����       6,950  1      6,950", "Ǫ���� �̼�����     2,980  2      6,960",
				"���Ϸν�������      1,990  1      1,990", "CJ ����Ĩ 20G     1,980  1      1,980",
				"����ũ ����̿�     3,980  1      3,980", "����� ���� ��      4,480  1      4,480",
				"������������9     4,380  2      8,760", "Ʈ���ǽ�Ʈ ����     8,980  1      8,980",
				"������ġ���ڱ�1     5,980  1      5,980", "���ѱ� ����Űģ     5,980  1      5,980",
				"ġŲ����ī�� 20    26,080  1      2,800" };
		String k27_price = "";
		String k27_total = "";
		String k27_amount = "";
		String k27_replace = "";
		// ���ڿ� ���� 4�� ����� �ʱ�ȭ (����, ����, �Ѱ���, ��ȯ�� ���ڿ�)
		int k27_int_price = 0;
		int k27_int_total = 0;
		int k27_int_amount = 0;
		// ������ ���� 3�� ����� �ʱ�ȭ ( ����, ����, �Ѱ���)
		for (int i = 0; i < k27_OneRec.length; i++) { // ������ ����� �� �迭�� ũŰ��ŭ�� for��
			k27_total = k27_OneRec[i].substring(k27_OneRec[i].length() - 10, k27_OneRec[i].length());
			// �� �ڿ������� ������ 10ĭ���� ���ڿ� �ڸ��� = �Ѱ����� ���ڿ�
			k27_amount = k27_OneRec[i].substring(k27_OneRec[i].length() - 14, k27_OneRec[i].length() - 11);
			// �ڿ��� 14ĭ���� 11ĭ���� �ڸ��� = ������ ���ڿ�
			k27_price = k27_OneRec[i].substring(k27_OneRec[i].length() - 24, k27_OneRec[i].length() - 14);
			// �ڿ��� 24ĭ���� 14ĭ���� �ڸ��� = ������ ���ڿ�

			k27_price = k27_price.replaceAll(",", "").trim(); // ��ǥ ����� ��ĭ �����
			k27_int_price = Integer.parseInt(k27_price); // ���ڿ� ������ ������ �������� ��ȯ
			k27_amount = k27_amount.replaceAll(",", "").trim(); // ��ǥ ����� ��ĭ �����
			k27_int_amount = Integer.parseInt(k27_amount); // ���ڿ� ������ ������ �������� ��ȯ
			k27_total = k27_total.replaceAll(",", "").trim(); // ��ǥ ����� ��ĭ �����
			k27_int_total = Integer.parseInt(k27_total); // ���ڿ� �Ѱ����� ������ �Ѱ������� ��ȯ

			if (k27_int_price * k27_int_amount != k27_int_total) { // ���� ���� * ������ �ٸ��ٸ�
				k27_replace = k27_df.format(k27_int_price * k27_int_amount);
				// ��ȯ�� ���ڿ��� ����*������ ����ϰ� ���ڸ����� ��ǥ ��� �˾Ƽ� ���ڿ��� �ٲ�
				k27_replace = k27_han_blank_foreword(k27_replace, 10); // �տ� �� ������ �� ��ĭ�־��ִ� �޼ҵ� ���
				System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
				System.out.printf("���� %s\n", k27_OneRec[i]); // ���� �迭 ��������
				System.out.printf("���� %s\n", k27_OneRec[i].replace(
						k27_OneRec[i].substring(k27_OneRec[i].length() - 10, k27_OneRec[i].length()), k27_replace));
				// �� �ڿ� �Ѱ��ݺκ��� ���� k27_replace�� ��ü
				System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
			}
		}
	}

	static String k27_han_blank_foreword(String k27_string, int k27_i) {
		// ���ڿ� �տ� ��ĭ ä��� �޼ҵ�
		byte[] k27_byte = k27_string.getBytes(); // ���ڿ��� ����Ʈ �迭�� ����
		String k27_result = ""; // ��� ���ڿ��� �����ϰ� ""��ĭ���� �ʱ�ȭ
		for (int k27_j = 0; k27_j < k27_i - k27_byte.length; k27_j++) {
			// �־���� ��ĭ�� k27_i - k27_byte.length ���� ����ϱ�
			k27_result = k27_result + " "; // ���ڿ��� ��ĭ �ֱ�
		}
		k27_result = k27_result + k27_string; // ���ʿ� �޾ƿ� ���ڿ� �߰�
		return k27_result; // ������� �����ش�
	}
}
