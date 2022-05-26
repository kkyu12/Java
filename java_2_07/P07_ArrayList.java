package Java_2_07_1;

import java.util.ArrayList; // ArrayList를 사용하기 위한 임포트

public class P07_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k27_iAl = new ArrayList();
		// ArrayList 생성
		k27_iAl.add("abc"); // ArrayList에 abc 추가
		k27_iAl.add("abcd"); // ArrayList에 abcd 추가
		k27_iAl.add("egag"); // ArrayList에 egag 추가
		k27_iAl.add("가나다0"); // ArrayList에 가나다0 추가
		k27_iAl.add("1234"); // ArrayList에 1234 추가
		k27_iAl.add("12rk34"); // ArrayList에 12가34 추가
		// k27_iAl.add(356); 어레이리스트를 스트링으로 쓰려고 하는데 중간에 숫자넣으면 에러

		System.out.println("********************************");
		System.out.printf(" 시작 ArraySize %d \n", k27_iAl.size()); // k27_iAl의 크기 출력
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl만큼의 for문
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// 인덱스와 그 곳의 내용 출력
		}

		k27_iAl.set(3, "가라라라"); // 3번 ArrayList 내용 변경
		System.out.println("********************************");
		System.out.printf(" 내용변경 ArraySize %d \n", k27_iAl.size()); // k27_iAl의 크기 출력
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl만큼의 for문
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// 인덱스와 그 곳의 내용 출력
		}

		k27_iAl.remove(4); // 4번 ArrayList 삭제
		System.out.println("********************************");
		System.out.printf(" 내용변경2 ArraySize %d \n", k27_iAl.size()); // k27_iAl의 크기 출력
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl만큼의 for문
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// 인덱스와 그 곳의 내용 출력
		}

		k27_iAl.sort(null); // ArrayList 순차정렬
		System.out.println("********************************");
		System.out.printf(" 리스트Sort ArraySize %d \n", k27_iAl.size()); // k27_iAl의 크기 출력
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl만큼의 for문
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// 인덱스와 그 곳의 내용 출력
		}

		k27_iAl.clear(); // ArrayList 모두 삭제
		System.out.println("********************************");
		System.out.printf(" 전부삭제 ArraySize %d \n", k27_iAl.size()); // k27_iAl의 크기 출력
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl만큼의 for문
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// 인덱스와 그 곳의 내용 출력 결과값 0 사이즈 값만 나오고 밑의 for문의 값은 안나온다(나올게 없으니까)
		}
	}

}
