package Apr7st;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rpsResult();
	}

	public static void rpsResult() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.rock 2.scissor 3. paper 4.exit");
			int user = sc.nextInt();
			int com = (int) (Math.random() * 3 + 1);
			if (!(user == 1 || user == 2 || user == 3 || user == 4)) {
				System.out.println("Wrong Number");
				
			} else if (user == 4) {
				System.out.println("Game End");
				break;
			} else {
				if (user - com == 0) {
					System.out.println("Draw");
					
				} else if (user - com == -1 || user - com == 2) {
					System.out.println("You Win");
					
				} else {
					System.out.println("You Lose");		
				}
			}
			System.out.println(currentTime());
		}
		System.out.println(currentTime());
	}
	public static String currentTime() {
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
}

