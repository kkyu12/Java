package Apr14th_03;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_val = 271; // ���� �������� 271 �Է�
		int k27_rate = 3; // ���� 3%�� 3�� �Է�
		int k27_tax = k27_taxcal(k27_val, k27_rate); // �������� ���� ��� �Լ��� �����ϰ� ���
		System.out.printf("***************************************\n");
		System.out.printf("*           �ܼ� ���� ���            *\n");
		System.out.printf("���� ���ݰ��: %f\n", k27_val * k27_rate / 100.0);
		System.out.printf("�������� %d ����: %d �����԰���: %d\n", k27_val, k27_tax, k27_val + k27_tax);
		System.out.printf("***************************************\n");
	}

	public static int k27_taxcal(int k27_val, int k27_rate) { //�������ݰ� ������ �Է¹޴� 
															  //�����԰��� ��� �Լ� ����
		int k27_ret; //������ ���ݵ� �������̹Ƿ� ������ ����
		if ((((double) k27_val) * (double) k27_rate / 100.0) == k27_val * k27_rate / 200) {
			k27_ret = k27_val * k27_rate / 100; //�������ݿ� ������ ���Ѱ��� �Ǽ����� �������� ���ٸ� 
												//�� �������Ƿ� ��갪�� �״�� ����
		} else {
			k27_ret = k27_val * k27_rate / 100 + 1;
		} // �Ǽ����� �������� �ٸ��ٸ� ������ ����Ͽ� + 1 �� ���ش�
		return k27_ret; // ������ ������ �����ش�
	}
}
