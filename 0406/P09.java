package Apr6th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String addition2 = sc.nextLine();
			arrList.add(addition2);
			Collections.sort(arrList);
			System.out.println(arrList);
		}
	}
}
