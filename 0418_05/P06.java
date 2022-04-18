package Apr18th_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k27_itemname = { "����Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 100cm", "��������E", "���� ���Ϸ� �� �Ѹ�", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ��120g*5", "(��)������������", "���ѱ� ������� 156g*4", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����",
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��D_WH", "�����̾��������ʹ�", "����ũ ����̿���500g", "���� ���ִ¿���GT ������",
				"���������÷�10��", "��������(��)65*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
				"����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư", "������ݺ�����ġ��ȹ", "������ �������� 468g*12", "�ٳ������� 120ml*4",
				"����� ��� �� 10Kg", "ABC���� 187g" }; // ��ǰ 30�� �̻��� ���ڿ� �迭�� �߰�
		int[] k27_price = { 7500, 6900, 5980, 3300, 5500, 3360, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 9480, 7980, 3620, 3720, 27980, 4000 };
		// ������ ������ ������ �迭�� ����
		int[] k27_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 };
		// ������ ������ ������ �迭�� ����
		boolean[] k27_taxfree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false,
				false, false, true, false }; // �������� �ƴ��� ���� �迭�� ����
		int k27_no_tax = 0; // �� ���� ���� ����� �ʱ�ȭ
		int k27_totalsum = 0; // �� ���� ���� ����� �ʱ�ȭ
		int k27_point = 5473; // ���� ����Ʈ ���� ����� ����
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // ���ڸ����� ��ǥ ���
		Calendar k27_calt = Calendar.getInstance(); // ���� ��¥ ��������
		SimpleDateFormat k27_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // ��¥ ���� ����1
		SimpleDateFormat k27_sdt2 = new SimpleDateFormat("YYYYMMdd"); // ��¥ ���� ����2
		k27_titel_print(); // ������ ���κ� ��� �Լ�
		System.out.printf("[�� ��]%s%23s\n", k27_sdt.format(k27_calt.getTime()), "POS:0011-9861"); // ���� ��¥ ����1�� ���
		System.out.printf("----------------------------------------------\n");
		System.out.printf("%6s%21s%4s%6s\n", "��ǰ��", "�� ��", "����", "�� ��");
		System.out.printf("----------------------------------------------\n");
		for (int k27_i = 0; k27_i < k27_itemname.length; k27_i++) { // ������ ������ŭ for�� ������
			if (k27_taxfree[k27_i] == true) { // ���� �迭���� ���� true��� * ���
				System.out.printf(" * ");
				k27_no_tax = k27_no_tax + k27_price[k27_i] * k27_num[k27_i]; // ����� ��ǰ �� ���� ���ϱ�
			} else {
				System.out.printf("   ");
			}
			System.out.printf("%s %9s %3d %8s\n", k27_subStrByte(k27_itemname[k27_i], 20),
					k27_df.format(k27_price[k27_i]), k27_num[k27_i], k27_df.format(k27_price[k27_i] * k27_num[k27_i]));
			k27_totalsum += k27_price[k27_i] * k27_num[k27_i];

			if ((k27_i + 1) % 5 == 0) {
				System.out.printf("----------------------------------------------\n");
			}
		}
		int k27_tax = (k27_totalsum - k27_no_tax)/ 11;
		double k27_tax_check = (k27_totalsum - k27_no_tax) / 11.0;
		if (k27_tax == k27_tax_check) {
		} else {
			k27_tax = k27_tax + 1;
		}
		int k27_bfPrice = k27_totalsum - k27_no_tax - k27_tax;
		System.out.println();
		System.out.printf("%22s%19d\n", "�� ǰ�� ����", k27_itemname.length);
		System.out.printf("%23s%19s\n", "(*)�� ��  �� ǰ", k27_df.format(k27_no_tax));
		System.out.printf("%23s%19s\n", "�� ��  �� ǰ", k27_df.format(k27_bfPrice));
		System.out.printf("%24s%19s\n", "��   ��   ��", k27_df.format(k27_tax));
		System.out.printf("%25s%19s\n", "��        ��", k27_df.format(k27_totalsum));
		System.out.printf("%-25s%15s\n", "�� �� �� �� �� ��", k27_df.format(k27_totalsum));
		System.out.printf("----------------------------------------------\n");
		System.out.printf("%-14s%30s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%-24s%6s%9s\n", "ī�����(IC)", "�Ͻú� / ", k27_df.format(k27_totalsum));
		System.out.printf("----------------------------------------------\n");
		System.out.printf("%23s\n", "[�ż�������Ʈ ����]");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("%-14s%14s%11s\n", "��ȸ�߻�����Ʈ", "9350**9995", k27_df.format(k27_totalsum / 1000));
		System.out.printf("%-16s%12s%11s\n", "����(����)����Ʈ", k27_df.format(k27_totalsum / 1000 + k27_point) + "(",
				k27_df.format(k27_point) + ")");
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("----------------------------------------------\n");
		System.out.printf("%s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%-10s%31s\n", "������ȣ :", "34��****");
		System.out.printf("%-10s%32s\n", "�����ð� :", "2022-04-18 12:20:04");
		System.out.printf("----------------------------------------------\n");
		System.out.printf("%-16s%27s\n", "ĳ��:084599 ��OO", "1150");
		System.out.printf("%16s%s\n", k27_sdt2.format(k27_calt.getTime()), "/00119861/00164980/31");
	}

	public static String k27_subStrByte(String k27_source, int k27_cutLength) {
		// ��ǰ���� �ڸ��� �Լ� ���� ���ڿ��� �ڸ� ����� �޾ƿ´�
		if (!k27_source.isEmpty()) { // ���ڿ��� ������� �ʴٸ�
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
				if (k27_sb.toString().getBytes().length == k27_cutLength-1) { 
					// ���� ���ڿ��� �ѱ� �߰��� ©���� �� ĭ �����ϴٸ�
					k27_sb.append(" "); // ��ĭ�� �� ĭ �߰�
				}
				return k27_sb.toString(); // ���ڿ��� �ǵ��� �ֱ�
			}
		} else { // ���ڿ��� ��� �ִٸ�
			return ""; // ��� �ִ� ���ڿ� �ǵ��� �ֱ�
		}
	}

	public static void k27_titel_print() { // �� �κ� ��� �κ��� ���� �Լ��� ����
		System.out.printf("emart\n");
		System.out.printf("�̸�Ʈ �׼��� (031)888-1234\n");
		System.out.printf("206-86-50913 ����\n");
		System.out.printf("���� ������ ������� 552\n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n\n");

	}
}
