package Apr4th;

import java.util.Arrays;
import java.util.Collections;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1 + i; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				temp = 0;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1 + i; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				temp = 0;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		

		/*
		 * Arrays.sort(array); for (int i = 0; i < array.length; i++) {
		 * System.out.print(array[i] + " "); } // 2, 5, 7, ... System.out.println(); for
		 * (int i = array.length - 1; i >= 0; i--) { System.out.print(array[i] + " "); }
		 * // 99, 53, 34, ...
		 */

		// Arrays.sort(array,Collections.reverseOrder());
		// System.out.println(Arrays.toString(array));

	}

}
