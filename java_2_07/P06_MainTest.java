package Java_2_07_1;

public class P06_MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_iPerson = 5; // �� ���� �ִ� ��ŭ ����� ����
		P06_OneRec[] k27_inData = new P06_OneRec[k27_iPerson];
		// Ŭ���� ������ �迭�� ����
		for (int k27_i = 0; k27_i < k27_iPerson; k27_i++) { // k27_iPerson ��ŭ ���ư��� for��
			String k27_name = String.format("�浿%02d", k27_i + 1); // �̸�
			int k27_kor = (int) (Math.random() * 100); // ���� ����
			int k27_eng = (int) (Math.random() * 100); // ���� ����
			int k27_mat = (int) (Math.random() * 100); // ���� ����
			k27_inData[k27_i] = new P06_OneRec(k27_name, k27_kor, k27_eng, k27_mat); // �迭�� ����

			System.out.printf("��ȣ:%d, �̸�:%s, ����:%3d, ����:%3d, ����:%3d, ����:%4d, ���:%5.1f\n", k27_i + 1,
					k27_inData[k27_i].k27_name(), k27_inData[k27_i].k27_kor(), k27_inData[k27_i].k27_eng(),
					k27_inData[k27_i].k27_mat(), k27_inData[k27_i].k27_sum(), k27_inData[k27_i].k27_avg());
			// ������ ���� ���
		}
	}
}
