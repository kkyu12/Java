package Apr7st;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[sc.nextInt()];
		sc.nextLine();
		System.out.println(numbers.length);
		String input = sc.nextLine();
		String[] cutInput = input.split(" ");
		try {
			for (int i = 0; i < cutInput.length; i++) {
				numbers[i] = Integer.parseInt(cutInput[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}