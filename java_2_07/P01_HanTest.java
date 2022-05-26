package Java_2_07_1;

public class P01_HanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n", k27_han_blank_foreword("�ѱ�abcd", 15));
		// ���ڿ� �ѱ�abcd �տ� ��ĭ �߰�, �� ���̰� 15��ŭ �ǵ���
		System.out.printf("HanBlankForeword[%s]\n", k27_han_blank_foreword("�ѱ��ѱ�aa", 15));
		// ���ڿ� �ѱ��ѱ�aa �տ� ��ĭ �߰�, �� ���̰� 15��ŭ �ǵ���
		System.out.printf("HanBlankForeword[%s]\n", k27_han_blank_backword("�ѱ�aa", 15));
		// ���ڿ� �ѱ�aa �ڿ� ��ĭ �߰�, �� ���̰� 15��ŭ �ǵ���
		System.out.printf("HanBlankForeword[%s]\n", k27_han_blank_backword("�ѱ��ѱ�aa", 15));
		// ���ڿ� �ѱ��ѱ�aa �ڿ� ��ĭ �߰�, �� ���̰� 15��ŭ �ǵ���
		System.out.printf("�ѱ��� [%d]��\n", k27_han_conut("�ѱ��ѱ�aa"));
		// �ѱ��ѱ�aa�� �ѱ��� �� ���� �ִ���
	}

	static String k27_han_blank_foreword(String k27_string, int k27_i) {
		// �ѱ� �տ� ��ĭ ä��� �޼ҵ� �� ������ ���̴� k27_i��ŭ
		byte[] k27_byte = k27_string.getBytes(); // ���ڿ��� ����Ʈ �迭�� ����
		String k27_result = ""; // ��� ���ڿ��� �����ϰ� ""��ĭ���� �ʱ�ȭ
		for (int k27_j = 0; k27_j < k27_i - k27_byte.length; k27_j++) {
			// �־���� ��ĭ�� k27_i - k27_byte.length ���� ����ϱ�
			k27_result = k27_result + " "; // ���ڿ��� ��ĭ �ֱ�
		}
		k27_result = k27_result + k27_string; // ���ʿ� �޾ƿ� ���ڿ� �߰�
		return k27_result; // ������� �����ش�
	}

	static String k27_han_blank_backword(String k27_string, int k27_i) {
		// �ѱ� �ڿ� ��ĭ ä��� �޼ҵ� �� ������ ���̴� k27_i��ŭ
		byte[] k27_byte = k27_string.getBytes(); // ���ڿ��� ����Ʈ �迭�� ����
		String k27_result = ""; // ��� ���ڿ��� �����ϰ� ""��ĭ���� �ʱ�ȭ
		for (int k27_j = 0; k27_j < k27_i - k27_byte.length; k27_j++) {
			// �־���� ��ĭ�� k27_i - k27_byte.length ���� ����ϱ�
			k27_result = k27_result + " "; // ���ڿ��� ��ĭ �ֱ�
		}
		k27_result = k27_string + k27_result; // ���ʿ� �޾ƿ� ���ڿ� �߰�
		return k27_result; // ������� �����ش�
	}

	static int k27_han_conut(String k27_string) {
		// ���ڿ��� �� ���� �ѱ��� �ִ��� Ȯ���ϴ� �޼ҵ�
		byte[] k27_byte = k27_string.getBytes(); // ���ڿ��� ����Ʈ �迭�� ����
		int k27_result = k27_byte.length - k27_string.length(); // ����Ʈ���� - ���ڿ�����
		// �׻� ����Ʈ�� ���
		return k27_result; // ������� �����ش�
	}

}
