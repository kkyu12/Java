package Apr7st;

import java.util.Scanner;

public class Report02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scanNum();
		running(num);
	}
	
	public static int scanNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input running number -> ");
		int number = sc.nextInt();
		return number;
	}

	public static void running(int number) {
		double[][] runArr = new double[number][10];
		double r = 0, result = 0;
		for (int i = 0; i < runArr.length; i++) {
			for (int j = 0; j < runArr[i].length; j++) {
				if (j == 0) {
					result = Math.random() * 9 + 1;
					runArr[i][j] = Math.round(result * 10) / 10.0;
				} else {
					result = Math.random() * 9 + 1 + runArr[i][j - 1];
					runArr[i][j] = Math.round(result * 10) / 10.0;
				}
			}
		}
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				for (int j = 0; j < runArr.length; j++) {
					for (int k = 0; k < i; k++) {
						System.out.print(runArr[j][k] + " ");
					}
					System.out.println();
				}
			} catch (Exception e) {
			}
		}
	}
}
