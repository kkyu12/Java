package Apr1st;

import java.util.Scanner;

public class Report02 {
	public static int inputNum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputNum();
		reverseNum();
	}

	public static void inputNum() {
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();
	}

	public static void reverseNum() {
		int reverse = 0;
		while (inputNum != 0) {
			int digit = inputNum % 10;
			reverse = reverse * 10 + digit;
			inputNum /= 10;
		}
		System.out.println(reverse);
	}
}
