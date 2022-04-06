package Apr6th;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> num = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int output = sc.nextInt();
		int cnt = 0;
		String[] cutInput = input.split(" ");
		for (int i = 0; i < cutInput.length; i++) {
			num.offer(Integer.parseInt(cutInput[i]));
		}
		if (input.contains(String.valueOf(output))) {
			for (int i = 0; i < num.size(); i++) {
				if (num.poll().equals(output) ) {
					System.out.println(i + 1);
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
