package Apr18th_05;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k27_i = 1; k27_i < 10; k27_i = k27_i + 3) { // 3���� �þ�� for�� ����
			System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
			System.out.printf(" ������ %d ��     ������ %d ��     ������ %d��\n", k27_i, k27_i + 1, k27_i + 2);
			// (1,2,3), (4,5,6) (7,8,9)���� ������ ���
			System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");
			for (int k27_j = 1; k27_j < 10; k27_j++) { // 1���� 9���� 1�� �þ�� for�� ����
				System.out.printf(" %d �� %d = %2d      %d �� %d = %2d      %d �� %d = %2d\n", k27_i, k27_j, k27_i * k27_j,
						k27_i + 1, k27_j, (k27_i + 1) * (k27_j), k27_i + 2, k27_j, (k27_i + 2) * (k27_j));
				// 9���� ���� ��µǵ��� ���� k27_i���� 1�� Ŀ���� �����ϰ� k27_j���� ����
			}
		}
	}

}
