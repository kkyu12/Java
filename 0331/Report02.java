package Mar31st;

import java.util.Scanner;

public class Report02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1 - num2;
		System.out.print("C(" + num1 + ", " + num2 + ") = ");
		System.out.print(num1 + "! / (" + num1 + " - " + num2 + ")! / " + num2 + "! = (");
		for (int i = num1; i > 1; i--) {
			System.out.print(i + " X ");
		}
		System.out.print("1) / (");
		for (int i = num3; i > 1; i--) {
			System.out.print(i + " X ");
		}
		System.out.print("1) / (");
		for (int i = num2; i > 1; i--) {
			System.out.print(i + " X ");
		}
		System.out.println("1) ");
		System.out.print("\t= " + factorial(num1) + " / " + factorial(num3) + 
				" / " + factorial(num2) + " = ");
		System.out.println(factorial(num1) / (factorial(num2) * factorial(num3)));
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(--n);
		}
	}

}
