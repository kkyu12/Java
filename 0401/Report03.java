package Apr1st;

import java.util.Scanner;

public class Report03 {
	public static String line = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputLine();
		reverseLine();
	}

	public static void inputLine() {
		Scanner sc = new Scanner(System.in);
		line = sc.nextLine();
	}

	public static void reverseLine() {
		String reverse = "";
		for (int i = (line.length() - 1); i >= 0; i--) {
			reverse = reverse + line.charAt(i);
		}
		System.out.println(reverse);
	}
}
