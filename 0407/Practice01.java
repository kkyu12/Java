package Apr7st;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		for (int i = 1; i < 101; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}
}
