package Apr4th;

import java.util.Scanner;

public class Report01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findChar();
	}

	public static void findChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string");
		String line = sc.nextLine();
		String[] cutLine = line.split("");
		System.out.println("Input a character");
		String alphabet = sc.nextLine();
		for (int i = 0; i < cutLine.length; i++) {
			if (cutLine[i].equals(alphabet)) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}
