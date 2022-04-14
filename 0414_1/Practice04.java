package Apr14th_1;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영수증 만들기 실습
		String[] k27_item = { "새우깡", "옥수수깡", "빈츠", "마가렛트", "오예스" }; // 과자이름을 배열에 넣기
		int[] k27_price = { 1200, 1500, 1400, 3200, 3000 }; // 각각의 과자 가격을 배열에 넣기
		int[] k27_amount = { 10, 2, 1, 3, 5 }; // 각각의 구매한 과자 개수를 배열에 넣기
		double k27_tax_rate = 0.1; // 부가세율 10% = 0.1
		int k27_total_sum = 0; // 총 합계를 초기화

		System.out.printf("**************************************\n");
		System.out.printf("                영수증                \n");
		System.out.printf(" 항 목          단 가  수 량      합계\n");
		for (int k27_i = 0; k27_i < k27_item.length; k27_i++) { // 0부터 과자배열의 길이만큼 for문 돌리기
			int k27_sum = k27_price[k27_i] * k27_amount[k27_i]; // 각각의 합계는 과자가격 * 과자개수
			k27_total_sum = k27_total_sum + k27_sum; // 총 합계는 각각의 합계를 다 더한 값
			System.out.printf("%-6s\t%5d\t%4d %9d\n", k27_item[k27_i], k27_price[k27_i], k27_amount[k27_i], 
					k27_sum);
		} // 항목 칸은 -6을 써서 왼쪽정렬, 6칸을 주었음 단가 수량 합계는 각각 맞는 크기를 줌
		System.out.printf("**************************************\n");
		System.out.printf("지불 금액 : %26d\n", k27_total_sum); // 총 가격을 출력 가독성을 위해 
																//26칸의 크기를 줌
		int k27_total_net_price = (int) (k27_total_sum / (1 + k27_tax_rate)); // 수수료없는 가격을 
					//계산하기위해 총가격을 1+세율로 나눔 정수값이 나와야 하므로 앞에 (int) 있는 것을 주의
		System.out.printf("과세금액  : %26d\n", k27_total_net_price); // 과세 금액을 출력 
																	  //가독성을 위해 26칸을 줌
		int k27_tax = k27_total_sum - k27_total_net_price; // 세율 계산은 총 가격에서 과세금액을 뺌
		System.out.printf("세     금 : %26d\n", k27_tax); // 세금을 출력 가독성을 위해 26칸을 줌
	}
}
