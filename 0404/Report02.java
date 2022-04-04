package Apr4th;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Report02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMatchNum();
	}

	public static void findMatchNum() {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		int currentNum, inputNumDigit, numLength;
		System.out.println("Input number 1 ~ 9");
		int target = sc.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			currentNum = numbers[i];
			numLength = (int) (Math.log10(numbers[i]) + 1);
			for (int j = 0; j < numLength; j++) {
				inputNumDigit = currentNum % 10;
				currentNum /= 10;
				if (inputNumDigit == target) {
					System.out.print(numbers[i] + " ");
				}
			}
		}

	}
}
