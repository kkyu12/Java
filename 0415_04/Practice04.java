package Apr15th_04;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �־� ��(ã��)
		//
		int k27_iVal; // ������ ���� ����
		for (int k27_i = 0; k27_i < 300; k27_i++) { // 0~299���� for��
			k27_iVal = 5 * k27_i; // ������ ���� k27_iVal�� 5 * k27_i ���� ����
			if (k27_iVal >= 0 && k27_iVal < 10) { // k27_iVal ���� 0~9���
				System.out.printf("�� %d\n", k27_iVal);
			} else if (k27_iVal >= 10 && k27_iVal < 100) { // k27_iVal ���� 10~99���
				System.out.printf("�� %d\n", k27_iVal);
			} else if (k27_iVal >= 100 && k27_iVal < 1000) { // k27_iVal ���� 100~999���
				System.out.printf("�� %d\n", k27_iVal);
			} else { // k27_iVal ���� 1000�̻��̶��
				System.out.printf("õ %d\n", k27_iVal);
			}
		}
	}

}
