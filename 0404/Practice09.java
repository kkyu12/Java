package Apr4th;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] cutLine = line.split(" ");
		for (int i = 0; i < cutLine.length; i++) {
			System.out.println(cutLine[i]);
		}
	}

}
