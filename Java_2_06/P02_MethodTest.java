package Java_2_06;

public class P02_MethodTest {

	static int k27_iStatic; // Ŭ������ ���� ���� static�� ����, ���� ��� ���� �ȴ�

	public static void k27_add(int k27_i) { // ���ϴ� �޼ҵ带 ����
		k27_iStatic++; // k27_iStatic�� 1�� ����
		k27_i++; // k27_i�� 1�� ����
		System.out.printf("add�޼ҵ忡��->k27_iStatic=[%d]\n", k27_iStatic); // �޼ҵ带 ���� k27_iStatic + 1
		System.out.printf("add�޼ҵ忡��->k27_i=[%d]\n", k27_i); // �޼ҵ带 ���� k27_i + 1
	}

	public static int k27_add2(int k27_i) { // void ��ſ� int �� �� �ִ� �޼ҵ� ����
		k27_iStatic++; // k27_iStatic�� 1�� ����
		k27_i++; // k27_i�� 1�� ����
		System.out.printf("add2�޼ҵ忡��->k27_iStatic=[%d]\n", k27_iStatic); // �޼ҵ带 ���� k27_iStatic + 1
		System.out.printf("add2�޼ҵ忡��->k27_i=[%d]\n", k27_i); // �޼ҵ带 ���� k27_i + 1
		return k27_i; // k27_i ���� �������� �ٽ� ������
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_iMain; // ������ ���� ����
		k27_iMain = 1; // �� 1 ����
		k27_iStatic = 1; // k27_iStatic�� �� 1 ����
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k27_iStatic=[%d]\n", k27_iStatic); // ����� 1
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k27_iMain=[%d]\n", k27_iMain); // ����� 1
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");

		k27_add(k27_iMain); // ���ϴ� �Լ� ȣ�� ����� 2, 2

		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k27_iStatic=[%d]\n", k27_iStatic); // ����� 2
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k27_iMain=[%d]\n", k27_iMain); // ����� 1
		// k27_iMain���� 1�� ���� ���ϴ� �Լ����� ���ϱ� ������ �ٽ� �������� ���ߴ�
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");

		k27_iMain = k27_add2(k27_iMain); // ���� �����ϰ� return�� ����Ͽ� ���� �ٽ� �޴� ����� ���ذ� ����
		// ���������� ���� �� ��� �޼ҵ带 ���ؼ� ���� ����Ǵ��� ������ �ľ��ϱ� ��ƴ�
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->k27_iStatic=[%d]\n", k27_iStatic); // ����� 3
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->k27_iMain=[%d]\n", k27_iMain); // ����� 2
		// k27_add �� �ٸ��� k27_add2�� ���� �������ֹǷ� ������� 2�� �Ǿ� ��µȴ�
		System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
	}
}
