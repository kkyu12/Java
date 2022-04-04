package Apr4th;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] chars = line.toCharArray();
		char[] result = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			result[i] = (char) (219 - chars[i]);
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

}
