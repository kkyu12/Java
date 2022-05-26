package Java_2_07_1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class P12_ReportSheet2 {
	static ArrayList<P09_OneRec> k27_ArrayOneRec = new ArrayList<P09_OneRec>();
	// Ŭ���� ������ ArrayList ����
	static int k27_iPerson = 200; // ����ǥ�� ����� �� �л���
	static int k27_class_person = 30; // �� �б��̳� �������� �л� ��
	static int[] k27_sum = new int[4]; // �������� �հ踦 ���� �迭 ����
	static int[] k27_totalsum = new int[4]; // ���� �հ踦 ���� �迭 ����
	static double k27_avg_sum = 0; // �� �л��� ����� ������ ���� �Ǽ��� ���� ����� �ʱ�ȭ
	static int k27_cnt = 0; // ���� for�� ���ư��� �л� �� ��ŭ�� ����ϱ����� ������ ���� ����� �ʱ�ȭ

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k27_dataSet();
		k27_dataSort();
		int k27_max_page = k27_iPerson / k27_class_person; // �� �������� ���������� ���ϱ�
		double k27_max_page_check = (double) k27_iPerson / k27_class_person; // �� �������� �Ǽ������� ���ϱ�
		if (k27_max_page != k27_max_page_check) { // ���� �ٸ��ٸ� + 1 (������ �ΰ����� ���� ����)
			k27_max_page++;
		}
		int[] k27_cut = new int[k27_max_page + 1]; // �������� �л���ȣ�� ���� ���� ���� 0 ���� �������� ����� + 1
		int k27_k = 0; // �������� �л���ȣ�� �ֱ� ���� ���� ������ ���� ����� �ʱ�ȭ
		for (int k27_i = 0; k27_i < k27_cut.length - 1; k27_i++) {
			k27_cut[k27_i] = k27_k; // 0, 30, 60, 90 �� �ݸ��� ������ ��ȣ�� �ֱ�
			k27_k = k27_k + k27_class_person; // �� ���� ��� ��ŭ ��ȣ �ø���
		}

		k27_cut[k27_max_page] = k27_iPerson; // ���� ������ ���� �л� ����
		// �� ���� ���� �ƴ� ���� �����Ƿ� �� �л� ���� �ֱ�
		for (int k27_j = 0; k27_j < k27_max_page; k27_j++) { // ������ �� ��ŭ ���ư��� for��
			System.out.printf("%22s\n", "��������ǥ");
			System.out.printf("%s%2d%33s\n", "PAGE:", k27_j + 1, "������� : " + k27_date_print());
			// �������� ���ϴ� ��¥ �������� ��¥ ���
			k27_HeaderPrint();
			for (int k27_i = k27_cut[k27_j]; k27_i < k27_cut[k27_j + 1]; k27_i++) {
				// ó���� 0 ~ 29 �ι�° 30 ~ 59 ����° 60 ~ 89 �� ���ư��� for�� ����
				P09_OneRec k27_rec; // Ŭ���� ����
				k27_rec = k27_ArrayOneRec.get(k27_i); // ArrayList���� �ϳ��� ��������
				System.out.printf("%4d %6s %5d %5d %5d %5d %6.2f\n", k27_rec.k27_student_id() + 1, k27_rec.k27_name(),
						k27_rec.k27_kor(), k27_rec.k27_eng(), k27_rec.k27_mat(), k27_rec.k27_sum(), k27_rec.k27_avg());
				// ������ ���� ���
				k27_sum[0] += k27_rec.k27_kor(); // ���������� ���� ������ �� ���ϱ�
				k27_sum[1] += k27_rec.k27_eng(); // ���������� ���� ������ �� ���ϱ�
				k27_sum[2] += k27_rec.k27_mat(); // ���������� ���� ������ �� ���ϱ�
				k27_sum[3] += k27_rec.k27_sum(); // ���������� ��� ������ �� ���ϱ�
				k27_avg_sum += k27_rec.k27_avg(); // ���������� ��� ������ �� ���ϱ�
				k27_totalsum[0] += k27_rec.k27_kor(); // ���������� ���� ������ �� ���ϱ�
				k27_totalsum[1] += k27_rec.k27_eng(); // ���������� ���� ������ �� ���ϱ�
				k27_totalsum[2] += k27_rec.k27_mat(); // ���������� ���� ������ �� ���ϱ�
				k27_totalsum[3] += k27_rec.k27_sum();
				; // ���������� ��� ������ �� ���ϱ�
				k27_cnt++; // ���� �������� �л� �� ���� // ������ �忡 �� ���� �л����� ���� �� �����Ƿ�
			}
			System.out.printf("============================================\n");
			System.out.println("����������");
			System.out.printf("%-10s%6d%6d%6d%6d%8.1f\n", "�հ�", k27_sum[0], k27_sum[1], k27_sum[2], k27_sum[3],
					k27_avg_sum);
			System.out.printf("%-10s%6.1f%6.1f%6.1f%6.1f%8.1f\n", "���", (double) k27_sum[0] / k27_cnt,
					(double) k27_sum[1] / k27_cnt, (double) k27_sum[2] / k27_cnt, (double) k27_sum[3] / k27_cnt,
					k27_avg_sum / k27_cnt); // �Ǽ������� �� ��Ȯ�ϰ� ����ϱ�
			k27_sum = new int[4]; // ���� ������ ����� �������Ƿ� �迭 �ʱ�ȭ
			k27_avg_sum = 0; // ����� �յ� �ʱ�ȭ
			k27_cnt = 0; // ���� �������� �л� ���� �ʱ�ȭ
			System.out.printf("============================================\n");
			System.out.println("����������");
			System.out.printf("%-10s%6d%6d%6d%6d%8.1f\n", "�հ�", k27_totalsum[0], k27_totalsum[1], k27_totalsum[2],
					k27_totalsum[3], k27_totalsum[3] / 3.0); // ������������ �հ� ���
			System.out.printf("%-10s%6.1f%6.1f%6.1f%6.1f%8.1f\n\n", "���", (double) k27_totalsum[0] / k27_cut[k27_j + 1],
					(double) k27_totalsum[1] / k27_cut[k27_j + 1], (double) k27_totalsum[2] / k27_cut[k27_j + 1],
					(double) k27_totalsum[3] / k27_cut[k27_j + 1], (k27_totalsum[3] / 3.0) / k27_cut[k27_j + 1]);
		}
		// ������������ ��� ���
	}

	public static void k27_dataSet() { // ������ ���ÿ� ���� �޼ҵ� ����
		for (int k27_i = 0; k27_i < k27_iPerson; k27_i++) {
			String k27_name = String.format("�浿%02d", k27_i + 1); // �̸�
			int k27_kor = (int) (Math.random() * 100); // ���� ����
			int k27_eng = (int) (Math.random() * 100); // ���� ����
			int k27_mat = (int) (Math.random() * 100); // ���� ����
			k27_ArrayOneRec.add(new P09_OneRec(k27_i, k27_name, k27_kor, k27_eng, k27_mat));
			// ArrayList�� add�� ����Ͽ� ����
		}
	}

	public static void k27_HeaderPrint() { // ����μ⿡ ���� �޼ҵ� ����
		System.out.printf("============================================\n");
		System.out.printf("%s%5s%5s%4s%4s%4s%6s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.printf("============================================\n");
	}

	static String k27_date_print() { // ��¥�� ������ִ� �޼ҵ�
		SimpleDateFormat k27_format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		// ��µǴ� ��¥�� ������ ����
		Date k27_time = new Date();
		String k27_string_time = k27_format.format(k27_time);
		// ��¥�� ���ڿ��� ���ϴ� �������� �־��ֱ�
		return k27_string_time;
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

}
