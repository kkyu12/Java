package Apr6th;

import java.util.Scanner;
import java.util.Stack;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> num = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int output = sc.nextInt();
		int cnt = 0;
		String[] cutInput = input.split(" ");
		for (int i = 0; i < cutInput.length; i++) {
			num.add(Integer.parseInt(cutInput[i]));
		}
		int size = num.size();
		if (input.contains(String.valueOf(output))) {
			for (int i = num.size(); i > 0; i--) {
				if (num.pop().equals(output)) {
					System.out.println(size - i + 1);
					cnt++;
					break;
				}
			}
		}
		if (cnt == 0) {
			System.out.println("Wrong number");
		}
	}
}
