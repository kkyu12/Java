package Apr18th_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ��� 3
		//
		String[] k27_itemname = { "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 100cm", "��������E", "���� ���Ϸ� �� �Ѹ�", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ��120g*5", "(��)������������", "���ѱ� ������� 156g*4", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��D_WH", "�����̾��������ʹ�", "����ũ ����̿���500g", "���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ", "������ �������� 468g*12", "�ٳ������� 120ml*4",
				"����� ��� �� 10Kg+10KG", "ABC���� 187g" }; // ��ǰ 30�� �̻��� ���ڿ� �迭�� �߰�
		int[] k27_price = { 97500, 96900, 95980, 93300, 95500, 1113360, 196610, 92750, 10800, 4980, 2480, 97920, 94980,
				4980, 7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 19480, 7980, 3620, 3720, 27980,
				4000 };
		// ������ ������ ������ �迭�� ����
		int[] k27_num = { 10, 10, 10, 10, 10, 10, 10, 10, 20, 1, 1, 10, 10, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 50, 1,
				1, 1, 30, 1 };
		// ������ ������ ������ �迭�� ����
		boolean[] k27_taxfree = { true, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, true, false }; // �������� �ƴ��� ���� �迭�� ����
		int k27_no_tax = 0; // �鼼��ǰ���ݿ� ���� ���� ����� �ʱ�ȭ
		int k27_totalsum = 0; // �� ���� ���� ����� �ʱ�ȭ
		int k27_point = 5473; // ���� ����Ʈ ���� ����� ����
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // ���ڸ����� ��ǥ ���
		Calendar k27_calt = Calendar.getInstance(); // ���� ��¥ ��������
		SimpleDateFormat k27_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // ��¥ ���� ����1
		SimpleDateFormat k27_sdt2 = new SimpleDateFormat("YYYYMMdd"); // ��¥ ���� ����2
		SimpleDateFormat k27_sdt3 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // ��¥ ���� ����3
		k27_titel_print(); // ������ ���κ� ��� �Լ�
		System.out.printf("[�� ��]%s%18s\n", k27_sdt.format(k27_calt.getTime()), "POS:0011-9861"); // ���� ��¥ ����1�� ���
		k27_line_print();
		System.out.printf("%7s%13s%4s%8s\n", "�� ǰ ��", "�� ��", "����", "�� ��");
		k27_line_print();
		for (int k27_i = 0; k27_i < k27_itemname.length; k27_i++) { // ������ ������ŭ for�� ������
			if (k27_taxfree[k27_i] == true) { // ���� �迭���� ���� true��� * ���
				System.out.printf("* ");
				k27_no_tax = k27_no_tax + k27_price[k27_i] * k27_num[k27_i]; // ����� ��ǰ �� ���� ���ϱ�
			} else { // ������ǰ�̶�� ��ĭ ä���
				System.out.printf("  ");
			}
			System.out.printf("%s%10s%3d%11s\n", k27_subStrByte(k27_itemname[k27_i], 15),
					k27_df.format(k27_price[k27_i]), k27_num[k27_i], k27_df.format(k27_price[k27_i] * k27_num[k27_i]));
			// ��ǰ�� 20����Ʈ�� �ڸ���, ������ ���ڸ����� ��ǥ, ����, ǰ�񰡰�*������ ���ڸ����� ��ǥ ���
			k27_totalsum += k27_price[k27_i] * k27_num[k27_i];
			// �� ���� ���ϱ�
			if ((k27_i + 1) % 5 == 0) { // 5�ٸ��� �� ���
				k27_line_print();
			}
		}
		int k27_tax = (k27_totalsum - k27_no_tax) / 11; // �ΰ��� ���������� ���
		double k27_tax_check = (k27_totalsum - k27_no_tax) / 11.0; // �ΰ��� �Ǽ������� ���
		if (k27_tax == k27_tax_check) { // ���� �� ���� ���ٸ� �� �������� ���̹Ƿ� �н�
		} else { // ���� �� ���� �ٸ��ٸ� 1�� �̸� ���� �ְ�
			k27_tax = k27_tax + 1; // ������ 1�� �̸� ���� �÷��� �޴´�
		}
		int k27_bfPrice = k27_totalsum - k27_no_tax - k27_tax; // ���� ��ǰ ���
		System.out.println();
		System.out.printf("%22s%14d\n", "�� ǰ�� ����", k27_itemname.length); // �����۱������� �� ǰ�� ���� ���
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", k27_df.format(k27_no_tax)); // �鼼���� ���� + ���ڸ����� ��ǥ ���
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", k27_df.format(k27_bfPrice)); // �������� ���� + ���ڸ����� ��ǥ ���
		System.out.printf("%24s%14s\n", "��   ��   ��", k27_df.format(k27_tax)); // �ΰ��� + ���ڸ����� ��ǥ ���
		System.out.printf("%25s%14s\n", "��        ��", k27_df.format(k27_totalsum));
		// �鼼+����+�ΰ����� ��� ���� + ���ڸ����� ��ǥ ���
		System.out.printf("%-24s%11s\n", "�� �� �� �� �� ��", k27_df.format(k27_totalsum));
		k27_line_print();
		System.out.printf("%-14s%25s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%-17s%5s%11s\n", "ī�����(IC)", "�Ͻú� / ", k27_df.format(k27_totalsum));
		k27_line_print();
		System.out.printf("%20s\n", "[�ż�������Ʈ ����]");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("%-13s%8s%11s\n", "��ȸ�߻�����Ʈ", "9350**9995", k27_df.format(k27_totalsum / 1000));
		// 0.1% �� ���� ����Ʈ ��� �� ���ڸ����� ��ǥ ���
		System.out.printf("%-16s%7s%11s\n", "����(����)����Ʈ", k27_df.format(k27_totalsum / 1000 + k27_point) + "(",
				k27_df.format(k27_point) + ")");
		// �̹��� �����Ͽ� ���� ����Ʈ�� �ռ� ����Ʈ ���
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		k27_line_print();
		System.out.printf("%s\n", "    ���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%-10s%26s\n", "������ȣ :", "34��****");
		System.out.printf("%-10s%27s\n", "�����ð� :", k27_sdt3.format(k27_calt.getTime()));
		// ���� �ð��� ����3���� ��� �ٸ� �����ð��̶� ���Žð��� ������ ��
		k27_line_print();
		System.out.printf("%-16s%22s\n", "ĳ��:084599 ��OO", "1150");
		System.out.printf("%14s%s\n", k27_sdt2.format(k27_calt.getTime()), "/00119861/00164980/31");
		// ���� �ð��� ����2���� ���
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

	public static void k27_titel_print() { // �� �κ� ��� �κ��� ���� �Լ��� ����
		System.out.printf("%35s\n", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%30s\n", "emart     206-86-50913 ����");
		System.out.printf("%29s\n\n", "���� ������ ������� 552");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n\n");
	}

	public static void k27_line_print() { // ���� ����ϴ� �޼ҵ� �߰�
		System.out.println("-----------------------------------------");
	}
}
