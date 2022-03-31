package Mar31st;

import java.util.Scanner;

public class Practice03 {
	public static final String father = "Mike";
	public static final String mother = "Marry";
	public static final String son = "John";
	public static final String daughter = "Ann";
	public static final int fatherNum = 1;
	public static final int matherNum = 2;
	public static final int sonNum = 3;
	public static final int daughterNum = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		printMenu();
		int choice = sc.nextInt();
		printName(choice);
	}

	public static void printMenu() {
		System.out.println("# Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.println("input number ->");
	}

	public static void printName(int choice) {
		switch (choice) {
		case 1:
			System.out.println(father);
			break;
		case 2:
			System.out.println(mother);
			break;
		case 3:
			System.out.println(son);
			break;
		case 4:
			System.out.println(daughter);
			break;
		default:
			System.out.println("Wrong Number");
		}
	}

}
