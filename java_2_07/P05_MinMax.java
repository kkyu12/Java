package Java_2_07_1;

public class P05_MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k27_iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };
		// ������ �迭 ����� �� ����
		for (int k27_i = 0; k27_i < k27_iArray.length; k27_i++) { // �迭�� ���̸�ŭ for��
			System.out.printf("k27_iArray[%d]=%d\n", k27_i, k27_iArray[k27_i]);
			// �迭�� �ε��� ��ȣ�� �� �ڸ��� �ִ� �� ���
		}
		//
		// MAX ã��
		int k27_iMax = k27_iArray[0]; // �ε���0�� �迭���� �ʱⰪ���� ����
		int k27_iMaxPt = 0; // �迭�� ��ġ�� üũ�ϴ� ������ ���� ����� �ʱ�ȭ
		for (int k27_i = 0; k27_i < k27_iArray.length; k27_i++) { // �迭�� ���̸�ŭ for��
			if (k27_iMax < k27_iArray[k27_i]) { // k27_iMax ���� �迭�� ���� ũ�ٸ�
				k27_iMax = k27_iArray[k27_i]; // k27_iMax�� �迭�� ���� ����
				k27_iMaxPt = k27_i; // �� ���� �ε������� ����
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k27_iMaxPt, k27_iMax);
		// �ִ밪�� ���� �ִ� �迭�� �ε����� �ִ밪 ���
		//
		// MIN ã��
		int k27_iMin = k27_iArray[0]; // �ε���0�� �迭���� �ʱⰪ���� ����
		int k27_iMinPt = 0; // �迭�� ��ġ�� üũ�ϴ� ������ ���� ����� �ʱ�ȭ
		for (int k27_i = 0; k27_i < k27_iArray.length; k27_i++) {
			if (k27_iMin > k27_iArray[k27_i]) { // k27_iMin ���� �迭�� ���� �۴ٸ�
				k27_iMin = k27_iArray[k27_i]; // k27_iMin�� �迭�� ���� ����
				k27_iMinPt = k27_i; // �� ���� �ε������� ����
			}
		}
		System.out.printf("MIN : iArray[%d]=%d\n", k27_iMinPt, k27_iMin);
		// �ּҰ��� ���� �ִ� �迭�� �ε����� �ּҰ� ���
	}

}
