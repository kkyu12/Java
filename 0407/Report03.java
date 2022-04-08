package Apr7st;

import java.util.Scanner;

public class Report03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose = scanChoose();
		winLose(rpsResult(), choose);
	}

	public static int scanChoose() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Number");
		System.out.println("1 : Rock 2 : Paper 3 : Scissor");
		int choose = sc.nextInt();
		if (choose == 1 || choose == 2 || choose == 3) {
			return choose;
		} else {
			System.out.println("Wrong Number");
			return 0;
		}
	}

	public static String rpsResult() {
		String ret = "";
		int randomNumber = (int) (Math.random() * 3);
		if (randomNumber == 0) {
			ret = "Rock";
		} else if (randomNumber == 1) {
			ret = "Paper";
		} else {
			ret = "Scissor";
		}
		return ret;
	}

	public static void winLose(String computer, int personInput) {
		if (computer.equals("Rock")) {
			if (personInput == 1) {
				System.out.println("Draw");
			} else if (personInput == 2) {

				System.out.println("You Win");
			} else if (personInput == 3) {

				System.out.println("Computer Win");
			}
		} else if (computer.equals("Paper")) {
			if (personInput == 1) {
				System.out.println("Computer Win");
			} else if (personInput == 2) {
				System.out.println("Draw");
			} else if (personInput == 3) {
				System.out.println("You Win");
			}
		} else if (computer.equals("Scissor")) {
			if (personInput == 1) {
				System.out.println("You Win");
			} else if (personInput == 2) {
				System.out.println("Computer Win");
			} else if (personInput == 3) {
				System.out.println("Draw");
			}
		}
	}
}
