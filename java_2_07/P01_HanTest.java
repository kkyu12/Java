package Java_2_07_1;

public class P01_HanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n", k27_han_blank_foreword("한글abcd", 15));
		// 문자열 한글abcd 앞에 빈칸 추가, 총 길이가 15만큼 되도록
		System.out.printf("HanBlankForeword[%s]\n", k27_han_blank_foreword("한글한글aa", 15));
		// 문자열 한글한글aa 앞에 빈칸 추가, 총 길이가 15만큼 되도록
		System.out.printf("HanBlankForeword[%s]\n", k27_han_blank_backword("한글aa", 15));
		// 문자열 한글aa 뒤에 빈칸 추가, 총 길이가 15만큼 되도록
		System.out.printf("HanBlankForeword[%s]\n", k27_han_blank_backword("한글한글aa", 15));
		// 문자열 한글한글aa 뒤에 빈칸 추가, 총 길이가 15만큼 되도록
		System.out.printf("한글은 [%d]개\n", k27_han_conut("한글한글aa"));
		// 한글한글aa에 한글이 몇 글자 있는지
	}

	static String k27_han_blank_foreword(String k27_string, int k27_i) {
		// 한글 앞에 빈칸 채우는 메소드 총 문자의 길이는 k27_i만큼
		byte[] k27_byte = k27_string.getBytes(); // 문자열을 바이트 배열에 저장
		String k27_result = ""; // 결과 문자열을 선언하고 ""빈칸으로 초기화
		for (int k27_j = 0; k27_j < k27_i - k27_byte.length; k27_j++) {
			// 넣어야할 빈칸을 k27_i - k27_byte.length 으로 계산하기
			k27_result = k27_result + " "; // 문자열에 빈칸 넣기
		}
		k27_result = k27_result + k27_string; // 뒤쪽에 받아온 문자열 추가
		return k27_result; // 결과값을 돌려준다
	}

	static String k27_han_blank_backword(String k27_string, int k27_i) {
		// 한글 뒤에 빈칸 채우는 메소드 총 문자의 길이는 k27_i만큼
		byte[] k27_byte = k27_string.getBytes(); // 문자열을 바이트 배열에 저장
		String k27_result = ""; // 결과 문자열을 선언하고 ""빈칸으로 초기화
		for (int k27_j = 0; k27_j < k27_i - k27_byte.length; k27_j++) {
			// 넣어야할 빈칸을 k27_i - k27_byte.length 으로 계산하기
			k27_result = k27_result + " "; // 문자열에 빈칸 넣기
		}
		k27_result = k27_string + k27_result; // 앞쪽에 받아온 문자열 추가
		return k27_result; // 결과값을 돌려준다
	}

	static int k27_han_conut(String k27_string) {
		// 문자열에 몇 개의 한글이 있는지 확인하는 메소드
		byte[] k27_byte = k27_string.getBytes(); // 문자열을 바이트 배열에 저장
		int k27_result = k27_byte.length - k27_string.length(); // 바이트길이 - 문자열길이
		// 항상 바이트가 길다
		return k27_result; // 결과값을 돌려준다
	}

}
