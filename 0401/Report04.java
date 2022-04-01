package Apr1st;

import java.util.Scanner;

public class Report04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a series of numbers "
				+ "(Enter a space between numbers ex: 1.1 2.2 -5.7)");
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
		String[] array = numbers.split(" ");
		System.out.println("Please input a number among the numbers above");
		float target = sc.nextFloat();
		float near = 0;
		float min = Float.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			float diff = Math.abs((Float.parseFloat(array[i]) - target));
			if (min > diff) {
				if (diff == 0) {
					continue;
				} else {
					min = diff;
					near = Float.parseFloat(array[i]);
				}
			}
		}
		System.out.println(near);
	}
}
