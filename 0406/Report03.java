package Apr6th;

import java.util.ArrayList;
import java.util.Scanner;

public class Report03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator();
	}

	public static void calculator() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input number -> ");
			int inputNum = sc.nextInt();
			numbers.add(inputNum);
			int sum = 0, mean = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			for (int i = 0; i < numbers.size(); i++) {
				sum += numbers.get(i);
				max = Math.max(max, numbers.get(i));
				min = Math.min(min, numbers.get(i));
			}
			mean = sum / numbers.size();
			System.out.println("Result : " + numbers.size() + " - Mean " + mean + 
					", Max " + max + ", Min " + min);
		}
	}
}
