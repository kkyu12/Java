package Apr4th;

import java.util.Scanner;

public class Practice06 { // 0329 P13 more correct

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getString();
	}

	public static void getString() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a sentence");
		String line = sc.nextLine();
		System.out.println("Input an word or character");
		String target = sc.nextLine();

		if (target.length() > 1) {
			String[] cutLine = line.split(" ");
			for (int i = 0; i < cutLine.length; i++) {
				if (cutLine[i].contains(target)) {
					count++;
				}
			}
		} else {
			String[] cutLine = line.split("");
			for (int i = 0; i < cutLine.length; i++) {
				if (cutLine[i].equals(target)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
