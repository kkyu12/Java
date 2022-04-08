package Apr7st;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat fm = new SimpleDateFormat ("yyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = fm.format(time);

		System.out.println(dateAndTime);
		System.out.println("start");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		time = new Date();
		dateAndTime = fm.format(time);
		System.out.println(dateAndTime);
		System.out.println("end");
	}

}
