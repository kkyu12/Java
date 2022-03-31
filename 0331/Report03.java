package Mar31st;

import java.util.Scanner;

public class Report03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 1 && num < 10) {
			multiplication(num, 2);
		} else {
			System.out.println("Please enter an integer from 2 to 9");
		}
	}

	public static void multiplication(int n, int i) {
		if (i > 9) {
			return;
		} else {
			System.out.println(n + " X " + i + " = " + (n * i));
			multiplication(n, i + 1);
		}
	}

}
