package Apr5th;

import java.util.Scanner;

public class Report02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMiddleChar();
	}

	public static void printMiddleChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input word");
		String word = sc.nextLine();
		char[] charToWord = word.toCharArray();
		int half = charToWord.length / 2;
		if (charToWord.length % 2 == 0) {
			System.out.print(charToWord[half - 1]);
			System.out.println(charToWord[half]);
		} else if (charToWord.length % 2 == 1) {
			System.out.println(charToWord[half]);
		}
	}
}
