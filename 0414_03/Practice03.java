package Apr14th_03;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_price = 1234; // ���ݿ� 1234 ����
		double k27_tax_rate = 0.1; // �ΰ����� 0.1 ����

		int k27_netprice = k27_netprice(k27_price, k27_tax_rate); // �Լ��� ����Ͽ� ���������� ���ϱ�
		int k27_tax = k27_price - k27_netprice; // ���Ե� ������ ���, ���� = �Һ��ڰ� - ��������

		System.out.printf("*********************************************\n");
		System.out.printf("*       �Һ��ڰ�, ��������, ���� ���       *\n");
		System.out.printf(" �Һ��ڰ���: %d, ��������: %d, ���� %d\n", k27_price, k27_netprice, k27_tax);
		System.out.printf("*********************************************\n");
	}

	public static int k27_netprice(int k27_price, double k27_rate) {
		return (int) (k27_price / (1 + k27_rate));
	}
	// ���������� ���ϴ� �Լ��� ������
	// ���� / (1 + ����) �� ��� �� �� ���������� ������� ���;� �ϹǷ� �տ� (int)�� �Ἥ ����ȯ�� ��
}
