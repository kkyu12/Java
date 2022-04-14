package Apr14th_03;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_val = 271; // 세전 가격으로 271 입력
		int k27_rate = 3; // 세율 3%의 3만 입력
		int k27_tax = k27_taxcal(k27_val, k27_rate); // 세금포함 가격 계산 함수를 생성하고 사용
		System.out.printf("***************************************\n");
		System.out.printf("*           단순 세금 계산            *\n");
		System.out.printf("실제 세금계산: %f\n", k27_val * k27_rate / 100.0);
		System.out.printf("세전가격 %d 세금: %d 세포함가격: %d\n", k27_val, k27_tax, k27_val + k27_tax);
		System.out.printf("***************************************\n");
	}

	public static int k27_taxcal(int k27_val, int k27_rate) { //세전가격과 세율을 입력받는 
															  //세포함가격 계산 함수 생성
		int k27_ret; //세포함 가격도 정수형이므로 정수로 선언
		if ((((double) k27_val) * (double) k27_rate / 100.0) == k27_val * k27_rate / 200) {
			k27_ret = k27_val * k27_rate / 100; //세전가격에 세율을 곱한값의 실수형과 정수형이 같다면 
												//딱 떨어지므로 계산값을 그대로 대입
		} else {
			k27_ret = k27_val * k27_rate / 100 + 1;
		} // 실수형과 정수형이 다르다면 정수로 계산하여 + 1 을 해준다
		return k27_ret; // 세포함 가격을 돌려준다
	}
}
