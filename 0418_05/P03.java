package Apr18th_05;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_iWeekday = 5; // 1��1���� �ݿ���
		int[] k27_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // ������ �⵵�� �޸��� ���������� ��Ƶ� �迭
		for (int k27_iMon = 0; k27_iMon < 12; k27_iMon++) { // �迭�� ���� ��� �ϹǷ� 0~11���� for�� ����
			System.out.printf("\t %2d��\n", k27_iMon + 1); // k27_iMon�� 0���� �����ϹǷ� +1
			System.out.printf("=====================\n");
			System.out.printf(" �� �� ȭ �� �� �� ��\n");
			for (int k27_j = k27_iWeekday; k27_j > 0; k27_j--) {
				System.out.printf("   "); // ���۳���ŭ ��ĭ����
			}
			for (int k27_i = 1; k27_i <= k27_iEnd[k27_iMon]; k27_i++, k27_iWeekday++) {
				//k27_i�� 1�Ϻ��� ������������ ��� k27_iWeekday�� 1�� ���� ����
				if (k27_iWeekday % 7 == 6) { // k27_iWeekday�� 7�� ������ �������� 6 �� �� �� �� ����
					System.out.printf("%3d\n", k27_i);
					k27_iWeekday = k27_iWeekday - 7; // �ٽ� -1~6 (7��)�� ����ϱ� ���� -7
				} else { // �������� 6�� �ƴ϶�� ��¥ ���
					System.out.printf("%3d", k27_i);
				}
			}
			System.out.printf("\n\n"); // �Ѵ��� ���� �� �� ����
		}
	}

}
