package Mar31st;

import java.util.Scanner;

public class Report04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	public static int fibonacci(int number) {
		if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

}
