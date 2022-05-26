package Java_2_07_1;

import java.util.ArrayList; // ArrayList�� ����ϱ� ���� ����Ʈ
import java.util.Collections;
import java.util.Comparator;

public class P11_MainTest {
	static ArrayList<P09_OneRec> k27_ArrayOneRec = new ArrayList<P09_OneRec>();
	// Ŭ���� ������ ArrayList ����
	static int k27_sumkor = 0; // ���������� �հ踦 ���� ������ ���� ����� 0���� �ʱ�ȭ
	static int k27_sumeng = 0; // ���������� �հ踦 ���� ������ ���� ����� 0���� �ʱ�ȭ
	static int k27_summat = 0; // ���������� �հ踦 ���� ������ ���� ����� 0���� �ʱ�ȭ
	static int k27_sumsum = 0; // �������� �հ踦 ���� ������ ���� ����� 0���� �ʱ�ȭ
	static int k27_sumavg = 0; // �հ��� ����� ���� ������ ���� ����� 0���� �ʱ�ȭ
	static final int k27_iPerson = 20; // ���������� �հ踦 ���� ������ ���� ����� 0���� �ʱ�ȭ

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k27_dataSet(); // ������ ����
		k27_dataSort(); // ������ ����
		k27_HeaderPrint(); // ����μ�
		for (int k27_i = 0; k27_i < k27_ArrayOneRec.size(); k27_i++) {
			k27_ItemPrint(k27_i); // �����μ�
		}
		k27_TailPrint(); // �����μ�
	}

	public static void k27_dataSet() { // ������ ���ÿ� ���� �޼ҵ� ����
		for (int k27_i = 0; k27_i < k27_iPerson; k27_i++) {
			String k27_name = String.format("�浿%02d", k27_i + 1); // �̸� �����
			int k27_kor = (int) (Math.random() * 100); // ���� ���� �����
			int k27_eng = (int) (Math.random() * 100); // ���� ���� �����
			int k27_mat = (int) (Math.random() * 100); // ���� ���� �����
			k27_ArrayOneRec.add(new P09_OneRec(k27_i, k27_name, k27_kor, k27_eng, k27_mat));
			// ArrayList�� add�� ����Ͽ� ����
		}
	}

	public static void k27_dataSort() { // ������ ���Ŀ� ���� �޼ҵ� ����
		Comparator<P09_OneRec> k27_bikyeokijun = new Comparator<P09_OneRec>() {
			// Comparator Ŭ������ ����
			public int compare(P09_OneRec k27_a1, P09_OneRec k27_a2) {
				// compare �޼ҵ带 �����ε�(������)
				// ���� ������ �񱳸� �Ʒ��� ���� ����
				// return
				// (String.valueOf(k27_a1.k27_sum).compareTo(String.valueOf(k27_a2.k27_sum)));
				return (k27_a2.k27_sum() - k27_a1.k27_sum());
				// k27_a2.�ϰ� �޺κп� ������ �������� ���� ���� ������ �ٲ�
			}
		};
		Collections.sort(k27_ArrayOneRec, k27_bikyeokijun); // ������ ������ ����(sort!)
		// Collections.reverse(k27_ArrayOneRec); // ������(������)
	}

	public static void k27_HeaderPrint() { // ����μ⿡ ���� �޼ҵ� ����
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		System.out.printf("%2s %4s %2s %2s %2s %2s   %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
	}

	public static void k27_ItemPrint(int k27_i) { // �����μ⿡ ���� �޼ҵ� ���� �Ű������� k27_i�� �ʿ�
		P09_OneRec k27_rec; // Ŭ���� ����
		k27_rec = k27_ArrayOneRec.get(k27_i); // ArrayList���� �ϳ��� ��������
		System.out.printf("%4d %4s %4d %4d %4d %4d %6.2f\n", k27_rec.k27_student_id() + 1, k27_rec.k27_name(),
				k27_rec.k27_kor(), k27_rec.k27_eng(), k27_rec.k27_mat(), k27_rec.k27_sum(), k27_rec.k27_avg());
		// ������ ���� ���
		k27_sumkor += k27_rec.k27_kor(); // �����հ� ������ ���� ���� ����
		k27_sumeng += k27_rec.k27_eng(); // �����հ� ������ ���� ���� ����
		k27_summat += k27_rec.k27_mat(); // �����հ� ������ ���� ���� ����
		k27_sumsum += k27_rec.k27_sum(); // �հ� ������ �԰� ���� ����
		k27_sumavg += k27_rec.k27_avg(); // ��� ������ ��� ����
	}

	public static void k27_TailPrint() { // �����μ⿡ ���� �޼ҵ� ����
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		System.out.printf("�����հ�  %5d   �������: %6.2f\n", k27_sumkor, k27_sumkor / (double) k27_ArrayOneRec.size());
		// �����հ�� ������ ����� ����Ͽ� ���
		System.out.printf("�����հ�  %5d   �������: %6.2f\n", k27_sumeng, k27_sumeng / (double) k27_ArrayOneRec.size());
		// �����հ�� ������ ����� ����Ͽ� ���
		System.out.printf("�����հ�  %5d   �������: %6.2f\n", k27_summat, k27_summat / (double) k27_ArrayOneRec.size());
		// �����հ�� ������ ����� ����Ͽ� ���
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		System.out.printf("������հ� %4d   �����: %6.2f\n", k27_sumavg, k27_sumavg / (double) k27_ArrayOneRec.size());
		// ������� �հ�� ������� ����Ͽ� ���
	}

}
