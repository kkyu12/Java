package Apr6th;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the names");
		String nameStr = sc.nextLine();
		String[] str1 = nameStr.split(" ");
		System.out.println("Input the scores");
		String scoreStr = sc.nextLine();
		String[] str2 = scoreStr.split(" ");
		
		Arrays.sort(str1);
		System.out.println("Ascending : " + Arrays.toString(str1));
		Arrays.sort(str1,Collections.reverseOrder());
		System.out.println("Descending : " + Arrays.toString(str1));
		
		Arrays.sort(str2);
		System.out.println("Ascending : " + Arrays.toString(str2));
		Arrays.sort(str2,Collections.reverseOrder());
		System.out.println("Descending : " + Arrays.toString(str2));
	}
}
