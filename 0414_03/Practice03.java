package Apr14th_03;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_price = 1234; // 가격에 1234 대입
		double k27_tax_rate = 0.1; // 부가세율 0.1 대입

		int k27_netprice = k27_netprice(k27_price, k27_tax_rate); // 함수를 사용하여 세전가격을 구하기
		int k27_tax = k27_price - k27_netprice; // 포함된 세금을 계산, 세금 = 소비자가 - 세전가격

		System.out.printf("*********************************************\n");
		System.out.printf("*       소비자가, 세전가격, 세금 계산       *\n");
		System.out.printf(" 소비자가격: %d, 세전가격: %d, 세금 %d\n", k27_price, k27_netprice, k27_tax);
		System.out.printf("*********************************************\n");
	}

	public static int k27_netprice(int k27_price, double k27_rate) {
		return (int) (k27_price / (1 + k27_rate));
	}
	// 세전가격을 구하는 함수를 생성함
	// 가격 / (1 + 세율) 로 계산 이 때 정수형으로 결과값이 나와야 하므로 앞에 (int)를 써서 형변환을 함
}
