package Apr18th_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ��� 1
		//
		Scanner k27_sc = new Scanner(System.in); // ������ ���� �ޱ����� �ν��Ͻ���
		System.out.printf("������ �Է����ּ��� => ");
		int k27_iPrice = k27_sc.nextInt(); // ������ ���� �޾ƿ���
		int k27_tax = k27_iPrice / 11; // �ΰ��� ���������� ����ϱ�
		double k27_tax_check = k27_iPrice / 11.0; // �ΰ��� �Ǽ������� ����ϱ�
		if (k27_tax == k27_tax_check) { // ���� ���� ���ٸ� �� �������� ���̹Ƿ� �н�
		} else { // ���� �� ���� �ٸ��ٸ� �Ҽ����ؿ� ���ڰ� �ִٴ� ���̰�
			k27_tax = k27_tax + 1; // ������ 1�� �̸��� ���� 1������ �÷��� �޴´�
		}
		int k27_bfPrice = k27_iPrice - k27_tax; // ���� ������ �Ѱ��� - �ΰ���
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // ���ڸ����� ��ǥ���
		Calendar k27_calt = Calendar.getInstance(); // ���� ��¥ ��������
		SimpleDateFormat k27_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ��¥ ��� ���� ���ϱ�
		System.out.printf("�ſ����\n");
		System.out.printf("�ܸ��� : 2N68665898%23s\n", "��ǥ��ȣ : 041218");
		System.out.printf("������ : �Ѿ��ġ�\n");
		System.out.printf("��  �� : ��� ������ �д籸 Ȳ�����351�� 10 ,\n");
		System.out.printf("1��\n");
		System.out.printf("��ǥ�� : ��â��\n");
		System.out.printf("����� : 752-53-00558 %24s\n", "TEL : 7055695");
		k27_line_print();
		System.out.printf("��  �� %35s  ��\n", k27_df.format(k27_bfPrice));
		// ���ڸ����� ��ǥó���� �������� ���
		System.out.printf("�ΰ��� %35s  ��\n", k27_df.format(k27_tax));
		// ���ڸ����� ��ǥó���� �ΰ��� ���
		System.out.printf("��  �� %35s  ��\n", k27_df.format(k27_iPrice));
		// ���ڸ����� ��ǥó���� �Ѱ��� ���
		k27_line_print();
		System.out.printf("�츮ī��\n");
		System.out.printf("ī���ȣ : 5387-20**-****4613(S)%11s\n", "�Ͻú�");
		System.out.printf("�ŷ��Ͻ� : %s\n", k27_sdt.format(k27_calt.getTime()));
		// ���� �ð��� ���˿� �°� ���
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		System.out.printf("���� : ��ī��� %19s \n", "���� : 720068568");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		k27_line_print();
		System.out.printf("%26s\n", "�� �����մϴ� ��");
		System.out.printf("%45s", "ǥ��V2.08_20200212");
	}
	public static void k27_line_print() { // ���� ����ϴ� �޼ҵ� �߰�
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - \n");
	}

}
