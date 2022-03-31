package Mar31st;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Input Number ->");
			int inputNum = sc.nextInt();
			multi(inputNum);
		}
	}

	public static void multi(int inputNum) {
		if (inputNum >= 2 && inputNum <= 9) {
			for (int i = 2; i < 10; i++) {
				System.out.println(inputNum + " X " + i + " = " + (inputNum * i));
			}
		} else {
			System.out.println("Please input 2 ~ 9");
		}
	}

}
