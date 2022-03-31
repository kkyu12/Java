package Mar31st;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		printMenu();
		int num1 = sc.nextInt();
		addition(num1);

	}

	public static void printMenu() {
		System.out.println("# Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.println("input number ->");
	}

	public static void addition(int familyMember) {
		switch (familyMember) {
		case 1:
			System.out.println("Mike");
			break;
		case 2:
			System.out.println("Marry");
			break;
		case 3:
			System.out.println("John");
			break;
		case 4:
			System.out.println("Ann");
			break;
		default:
			System.out.println("Wrong Number");
		}
	}

}
