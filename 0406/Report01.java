package Apr6th;

import java.util.ArrayList;
import java.util.Scanner;

public class Report01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci();
	}

	public static void fibonacci() {
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number -> ");
		int input = sc.nextInt();
		if (input < 1) {
			System.out.println("Wrong number");
		} else {
			fibonacci.add(0);
			if (input >= 2) {
				fibonacci.add(1);
				for (int i = 0; i < input - 2; i++) {
					fibonacci.add(fibonacci.get(i) + fibonacci.get(i + 1));
				}
			}
			System.out.println(fibonacci);
		}	
	}
}
