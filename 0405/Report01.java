package Apr5th;

import java.util.Scanner;

public class Report01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateNum();
	}

	public static void duplicateNum() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input first numbers");
			System.out.println("Ex) 1.3 2 4.5 2.7 -6 2.0");
			String numbers1 = sc.nextLine();
			System.out.println("Input second numbers");
			System.out.println("Ex) 3.6 4.0 1.0 -6.4");
			String numbers2 = sc.nextLine();
			String[] arrNum1 = numbers1.split(" ");
			String[] arrNum2 = numbers2.split(" ");
			for (int i = 0; i < arrNum1.length; i++) {
				for (int j = 0; j < arrNum2.length; j++) {
					if (Float.parseFloat(arrNum1[i]) == Float.parseFloat(arrNum2[j])) {
						System.out.print(Float.parseFloat(arrNum1[i]) + " ");
					}
				}
			}
			System.out.println("\n");
		}
	}
}
