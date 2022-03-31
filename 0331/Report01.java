package Mar31st;

import java.util.Scanner;

public class Report01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1 - num2;
		System.out.print("P(" + num1 + ", " + num2 + ") = ");
		System.out.print(num1 + "! / (" + num1 + " - " + num2 + ")! = (");
		for (int i = num1; i > 1; i--) {
			System.out.print(i + " X ");
		}
		System.out.print("1) / (");
		for (int i = num3; i > 1; i--) {
			System.out.print(i + " x ");
		}
		System.out.print("1) = ");
		System.out.print(factorial(num1) + " / " + factorial(num3) + " = ");
		System.out.println(factorial(num1) / factorial(num3));
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(--n);
		}
	}

}
