package Apr18th_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ��� 2
		//
		String k27_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)"; // ���ڿ� ���� ����� ����
		String k27_itemcode1 = "1031615"; // ���ڿ� ���� ����� ����
		int k27_price1 = 3000; // ������ ���� ����� ����
		int k27_amount1 = 10; // ������ ���� ����� ����
		String k27_itemname2 = "�����̵�ĸ���(������)(100ȣ)"; // ���ڿ� ���� ����� ����
		String k27_itemcode2 = "1008152"; // ���ڿ� ���� ����� ����
		int k27_price2 = 2000; // ������ ���� ����� ����
		int k27_amount2 = 10; // ������ ���� ����� ����
		String k27_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)"; // ���ڿ� ���� ����� ����
		String k27_itemcode3 = "1020800"; // ���ڿ� ���� ����� ����
		int k27_price3 = 5000; // ������ ���� ����� ����
		int k27_amount3 = 2; // ������ ���� ����� ����
		int k27_total = k27_price1 * k27_amount1 + k27_price2 * k27_amount2 + k27_price3 * k27_amount3;
		// �� ���� ���
		int k27_tax = k27_total / 11; // �ΰ��� �������� ���
		double k27_tax_check = k27_total / 11.0; // �ΰ��� �Ǽ������� ���
		if (k27_tax == k27_tax_check) { // ���� ���� ���ٸ� �� �������� ���̹Ƿ� �н�
		} else { // ���� �� ���� �ٸ��ٸ� �Ҽ��� ���� ���ڰ� �ִٴ� ���̰�
			k27_tax = k27_tax + 1; // ������ 1�� �̸��� ���� 1������ �÷��� �޴´�
		}
		int k27_bfPrice = k27_total - k27_tax; // ���� ������ �Ѱ��� - �ΰ���
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // ���ڸ����� ��ǥ���
		Calendar k27_calt = Calendar.getInstance(); // ���� ��¥ ��������
		SimpleDateFormat k27_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ��¥ ��� ���� ����
		String k27_after14 = k27_add_date(14); // 14�� ���� �� ���ϱ�
		k27_head_print();
		System.out.printf("%18s%s%s\n", "��ȯ/ȯ�� 14��", k27_after14, "�̳�,");
		// 14�� ���ѳ� �Է�
		k27_middle_print();
		System.out.printf("[POS 1058231]%35s\n", k27_sdt.format(k27_calt.getTime()));
		// ���� �ð��� ���˿� �°� ���
		k27_line2_print();
		System.out.printf("%s%9s%4d%9s\n", k27_subStrByte(k27_itemname1, 26), k27_df.format(k27_price1), k27_amount1,
				k27_df.format(k27_price1 * k27_amount1));
		// 1�� ��ǰ�� ���� �̸�, ����, ����, �Ѱ��� ���
		System.out.printf("[%s]\n", k27_itemcode1); // 1�� ��ǰ�� ��ǰ��ȣ ���
		System.out.printf("%s%9s%4d%9s\n", k27_subStrByte(k27_itemname2, 26), k27_df.format(k27_price2), k27_amount2,
				k27_df.format(k27_price2 * k27_amount2));
		// 2�� ��ǰ�� ���� �̸�, ����, ����, �Ѱ��� ���
		System.out.printf("[%s]\n", k27_itemcode2); // 2�� ��ǰ�� ��ǰ��ȣ ���
		System.out.printf("%s%9s%4d%9s\n", k27_subStrByte(k27_itemname3, 26), k27_df.format(k27_price3), k27_amount3,
				k27_df.format(k27_price3 * k27_amount3));
		// 3�� ��ǰ�� ���� �̸�, ����, ����, �Ѱ��� ���
		System.out.printf("[%s]\n", k27_itemcode3); // 3�� ��ǰ�� ��ǰ��ȣ ���
		System.out.printf("%18s%26s\n", "�����հ�", k27_df.format(k27_bfPrice));
		// ���ڸ����� ��ǥ + �������� ���
		System.out.printf("%19s%26s\n", "�ΰ���", k27_df.format(k27_tax));
		// ���ڸ����� ��ǥ + �ΰ��� ���
		k27_line_print();
		System.out.printf("%-10s%34s\n", "�Ǹ��հ�", k27_df.format(k27_total));
		// ���ڸ����� ��ǥ + �Ѱ��� ���
		k27_line2_print();
		System.out.printf("%-10s%34s\n", "�ſ�ī��", k27_df.format(k27_total));
		// ���ڸ����� ��ǥ + �Ѱ��� ���
		k27_line_print();
		System.out.printf("�츮ī��%40s\n", "538720**********");
		System.out.printf("%-17s %22s\n", "���ι�ȣ 77982843(0)", "���αݾ� " + k27_df.format(k27_total));
		// ���ڸ����� ��ǥ + �Ѱ��� ���
		k27_line2_print();
		System.out.printf("%28s �д缭����\n", k27_sdt.format(k27_calt.getTime()));
		// ���� �ð��� ���˿� �°� ���
		System.out.printf("��ǰ �� ��Ÿ ���� : 1544-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("%33s\n", "2112820610158231");
		k27_line_print();
		System.out.printf(" �� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n");
		System.out.printf("   ȸ������ �� �پ��� ������ ����������! ��\n");
	}

	public static String k27_subStrByte(String k27_source, int k27_cutLength) {
		// ��ǰ���� �ڸ��� �Լ� ���� ���ڿ��� �ڸ� ����� �޾ƿ´�
		k27_source = k27_source.trim(); // �����̳� ������ ���� ����
		if (k27_source.getBytes().length <= k27_cutLength) { // �ڸ��� ������ ���ڿ��� �۴ٸ�
			for (int k27_i = k27_cutLength - k27_source.getBytes().length; k27_i > 0; k27_i--) {
				k27_source += " "; // ������ ��ŭ ��ĭ ä���ֱ�
			}
			return k27_source; // ���ڿ��� �ǵ��� �ֱ�
		} else { // ���ڿ��� ũ�ٸ�
			StringBuffer k27_sb = new StringBuffer(k27_cutLength);
			// ���ڿ��� �߰��ϰų� �ڸ��� Ŭ������ �ν��Ͻ�
			int k27_cnt = 0; // ������ ���� ����� 0���� �ʱ�ȭ
			for (char k27_ch : k27_source.toCharArray()) { // ���������� �ű��
				k27_cnt += String.valueOf(k27_ch).getBytes().length; // ���ϴ� ���̸�ŭ�� �ѱ��ھ� �߰�
				if (k27_cnt > k27_cutLength) { // ������ �ڸ� ���� ������� ũ�ٸ�
					break; // for�� ������ ������
				}
				k27_sb.append(k27_ch); // ���ڿ��� �ڸ� ��ŭ�� �߰�
			}
			if (k27_sb.toString().getBytes().length == k27_cutLength - 1) {
				// ���� ���ڿ��� �ѱ� �߰��� ©���� �� ĭ �����ϴٸ�
				k27_sb.append(" "); // ��ĭ�� �� ĭ �߰�
			}
			return k27_sb.toString(); // ���ڿ��� �ǵ��� �ֱ�
		}
	}

	public static String k27_add_date(int k27_day) { // 14�� �߰��Ǵ� ��¥�� ����ϴ� �Լ� ����
		SimpleDateFormat k27_sdt = new SimpleDateFormat("(MM��dd��)"); // ��¥ ���� ����
		Calendar k27_calt = Calendar.getInstance(); // ���� ��¥ ��������
		k27_calt.add(Calendar.DATE, k27_day); // k27_day ��ŭ ��¥ ���ϱ�
		String k27_after = k27_sdt.format(k27_calt.getTime()); // ���ϴ� �������� ���ڿ��� ����
		return k27_after; // ���ڿ� �����ֱ�
	}
	
	public static void k27_line_print() { // ���� ����ϴ� �޼ҵ� �߰�
		System.out.printf("------------------------------------------------\n");
	}
	
	public static void k27_line2_print() { // ���� ����ϴ� �޼ҵ� �߰�
		System.out.printf("================================================\n");
	}
	
	public static void k27_head_print() { // ���κ��� ����ϴ� �޼ҵ� �߰�
		System.out.printf("%26s\n", "\"���ΰ���, ���̼�\"");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n");
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (����\n");
		System.out.printf("��)\n");
		k27_line2_print();
		System.out.printf("%27s\n", "�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%29s\n", "ISO 9001 ǰ���濵�ý��� �������");
		k27_line2_print();
	}
	
	public static void k27_middle_print() { // ��� �κ� ����ϴ� �޼ҵ� �߰�
		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n");
		System.out.printf("%27s\n", "����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%27s\n", "üũī�� ��� �� �ִ� 7�� �ҿ�");
		k27_line2_print();
	}
}
