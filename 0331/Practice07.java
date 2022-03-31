package Mar31st;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		int num1 = sc.nextInt();
		System.out.println(factorial(num1));
	}
	
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(--n);
		}
	}

}
