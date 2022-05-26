package Java_2_07_1;

import java.util.ArrayList; // ArrayList를 쓰기 위한 임포트

public class P08_ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_iTestMAX = 100000;	// 정수형 변수 선언, 원하는 값 입력
		// 큰 값도 시간이 걸리지만 잘 정렬된다
		ArrayList k27_iAL = new ArrayList(); // ArrayList 사용
		for(int k27_i = 0; k27_i < k27_iTestMAX; k27_i++) {
			// 원하는 값까지 도는 for문 선언
			k27_iAL.add((int)(Math.random()*1000000)); // Math.random()을 사용하여 값을 추가
			// 0 ~ 1000000 값이 들어갈 수 있음
		}
		
		for(int k27_i = 0; k27_i < k27_iTestMAX; k27_i++) {
			// 원하는 값까지 도는 for문 선언
			System.out.printf(" ArrayList %d = %d\n", k27_i, k27_iAL.get(k27_i));
			// ArrayList의 인덱스와 그 곳의 값을 출력
		}
		
		System.out.println("*********************************");
		k27_iAL.sort(null); // sort로 정렬

		for(int k27_i = 0; k27_i < k27_iAL.size(); k27_i++) {
			// 원하는 값까지 도는 for문 선언
			System.out.printf(" ArrayList %d = %d\n", k27_i, k27_iAL.get(k27_i));
			// 정렬된 값 기준으로 인덱스와 값 출력
		}
	}

}
