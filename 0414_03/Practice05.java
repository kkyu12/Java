package Apr14th_03;

import java.text.DecimalFormat; // 콤마를 찍기 위해 import 추가
import java.text.SimpleDateFormat; // 날짜를 출력하기 위해 import 추가
import java.util.Calendar; // 현재시간을 가져오기 위해 import

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 은행은 손해보면 안 된다

		// 1 단순 환전 계산
		//
		int k27_MyWon = 1000000; // 환전하고 싶은 원화 백만원을 변수 k27_MyWon에 대입
		double k27_MoneyEx = 1238.21; // 환율을 변수 k27_MoneyEx에 대입
		double k27_commission = 0.003; // 환전수수료인 0.003을 변수 k27_commission에 대입
										// 변수를 설정할때 잘생각해보고 변수의 자료형 설정하기-중요!
		int k27_usd = (int) (k27_MyWon / k27_MoneyEx); // 환전해서 받을 달러 계산하기 원화/환율 계산
													   //결과값을 k27_usd에 대입
		int k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx); // 남은 돈 계산하기 
														//0.1원은 없으니 정수형으로 설정과 형변환하기
		System.out.printf("*******************************************************\n");
		System.out.printf("*                   수수료없이 계산                   *\n");
		System.out.printf("총 한화환전금액: %d원=> 미화: %d달러, 잔돈: %d원\n", k27_MyWon, 
				k27_usd, k27_remain);
		System.out.printf("*******************************************************\n\n\n");

		// 2 수수료 포함 환전 계산_1
		//
		double k27_ComPerOne = k27_MoneyEx * k27_commission; // 1달러당 수수료 = 환율 * 환전수수료
		double k27_totalcom = k27_usd * k27_ComPerOne; // 총 수수료 = 환전해서 받을 달러 * 1달러당 수수료

		System.out.printf("*******************************************************************\n");
		System.out.printf("*                           수수료 계산                           *\n");
		System.out.printf("총 수수료: %f원=> 미화: %d달러, 달러당 수수료: %f원\n", k27_totalcom, 
				k27_usd, k27_ComPerOne);
		System.out.printf("*******************************************************************\n\n\n");

		// 3 수수료 포함 환전 계산_2
		//
		int k27_i_totalcom; // 총 수수료를 정수로 나타내야 한다 이 때 올림을 해야 함! 
							//수수료는 다 받아야 한다
		if (k27_totalcom != (double) ((int) k27_totalcom)) { // 두 값이 다르면 1원을 총 수수료에 1을 더해준다
			k27_i_totalcom = (int) k27_totalcom + 1; // 두 값이 다르려면 소숫점이하 자리가 있고 
													 //1원 미만값은 1원으로 올려서 받는다
		} else {
			k27_i_totalcom = (int) k27_totalcom; // 두 값이 같으면 그대로 정수형 총 수수료에 대입
		}

		System.out.printf("***************************************************************************\n");
		System.out.printf("*                             수수료 적용환전                             *\n");
		System.out.printf("총 수수료: %d원=> 미화: %d달러, 달러당 수수료: %f원\n", k27_i_totalcom, 
				k27_usd, k27_ComPerOne);
		k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx - k27_i_totalcom);
		System.out.printf("총 한화환전금액: %d원=> 미화: %d달러, 수수료징구:%d원 잔돈: %d원\n", k27_MyWon, 
				k27_usd, k27_i_totalcom, k27_remain);
		System.out.printf("***************************************************************************\n\n\n");
		// 잔돈이 음수가 나온다 이 때 손님이 갖고 있는 돈이 딱 100만원이라면 어떡하는가?

		// 4 수수료 포함 환전 계산_3
		//
		k27_usd = (int) (k27_MyWon / (k27_MoneyEx + k27_ComPerOne)); // 환전달러를 구할 때 
																	 //수수료를 포함해서 구하자
		k27_totalcom = k27_usd * k27_ComPerOne; // 총 수수료 = 받을 달러 * 1달러당 수수료이다
		if (k27_totalcom != (double) ((int) k27_totalcom)) { // 총 수수료의 실수형과 정수형 값이 다르면
			k27_i_totalcom = (int) k27_totalcom + 1; // 1원을 더해준다
		} else { // 총수수료의 실수형과 정수형이 같다면 그대로 정수형 총 수수료에 대입해 준다
			k27_i_totalcom = (int) k27_totalcom;
		}

		System.out.printf("*************************************************************************\n");
		System.out.printf("*                        (정확한) 수수료 적용환전                       *\n");
		System.out.printf("총 수수료: %d원=> 미화: %d달러, 달러당 수수료: %f원\n", k27_i_totalcom, 
				k27_usd, k27_ComPerOne);
		// 805달러가 출력되며 수수료가 양수 값이 출력
		k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx - k27_i_totalcom);
		System.out.printf("총 한화환전금액: %d원=> 미화: %d달러, 수수료징구:%d원 잔돈: %d원\n", k27_MyWon, 
				k27_usd, k27_i_totalcom, k27_remain);
		System.out.printf("*************************************************************************\n\n\n");

		// 5 콤마 찍기
		//
		DecimalFormat k27_df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat이란 
															//클래스를 사용하여 세자리마다 콤마를 찍어주자
		System.out.printf("****************************************************************************\n");
		System.out.printf("*                              콤마찍기 적용                               *\n");
		System.out.printf("총 수수료: %s원=> 미화: %s달러, 달러당 수수료: %f원\n", 
				k27_df.format(k27_i_totalcom), k27_df.format(k27_usd), k27_ComPerOne); 
				// 수수료는 실수형으로 나와도 되므로 포맷을 안바꿔준다
				// k27_df.format(변수)를 사용하여 세자리마다 콤마를 찍어준다
		k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx - k27_i_totalcom);
		System.out.printf("총 한화환전금액: %s원=> 미화: %s달러, 수수료징구:%s원 잔돈: %s원\n", 
				k27_df.format(k27_MyWon), k27_df.format(k27_usd), k27_df.format(k27_i_totalcom), 
				k27_df.format(k27_remain));
		System.out.printf("****************************************************************************\n\n\n");

		// 6 날짜 찍기
		//
		Calendar k27_calt = Calendar.getInstance(); // 시스템의 현재 시간 가져오기
		SimpleDateFormat k27_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		// 날짜 형식을 년/월/일 시:분:초 로 가져오기
		System.out.printf("****************************************************************************\n");
		System.out.printf("*                              현재날짜 적용                               *\n");
		System.out.printf("총 수수료: %s원=> 미화: %s달러, 달러당 수수료: %f원\n", 
				k27_df.format(k27_i_totalcom), k27_df.format(k27_usd), k27_ComPerOne);
		k27_remain = (int) (k27_MyWon - k27_usd * k27_MoneyEx - k27_i_totalcom);
		System.out.printf("총 한화환전금액: %s원=> 미화: %s달러, 수수료징구:%s원 잔돈: %s원\n", 
				k27_df.format(k27_MyWon), k27_df.format(k27_usd), k27_df.format(k27_i_totalcom), 
				k27_df.format(k27_remain));
		System.out.printf("최종실행시간: %s\n", k27_sdt.format(k27_calt.getTime())); 
		// 시스템에서 가져온 시간을 원하는 형식으로 출력
		System.out.printf("****************************************************************************\n\n\n");
	}
}
