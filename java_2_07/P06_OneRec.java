package Java_2_07_1;

public class P06_OneRec {
	private String k27_name; // �л� �̸� ���ڿ� ���� ����
	private int k27_kor; // ���� ���� ������ ���� ����
	private int k27_eng; // ���� ���� ������ ���� ����
	private int k27_mat; // ���� ���� ������ ���� ����

	public P06_OneRec(String k27_name, int k27_kor, int k27_eng, int k27_mat) {
		this.k27_name = k27_name; // �л� �̸��� �л��̸����� �ޱ�
		this.k27_kor = k27_kor; // ������� ��������� �ޱ�
		this.k27_eng = k27_eng; // ������� ��������� �ޱ�
		this.k27_mat = k27_mat; // ���м����� ���м������� �ޱ�
	}

	public String k27_name() { // �̸��� ���� �޼ҵ� ����
		return this.k27_name; // ���� �̸��� ������
	}

	public int k27_kor() { // ���� ������ ���� �޼ҵ� ����
		return this.k27_kor; // ���� ���� ������ ������
	}

	public int k27_eng() { // ���� ������ ���� �޼ҵ� ����
		return this.k27_eng; // ���� ���� ������ ������
	}

	public int k27_mat() { // ���� ������ ���� �޼ҵ� ����
		return this.k27_mat; // ���� ���� ������ ������
	}

	public int k27_sum() { // ������ �տ� ���� �޼ҵ� ����
		return this.k27_kor + this.k27_eng + this.k27_mat;
		// �����+�����+���м����� ���� ���� ������
	}

	public double k27_avg() { // ������ ��տ� ���� �޼ҵ� ����
		return k27_sum() / 3.0; // ���� ���� 3.0���� ���� ���� ������
	}
}
