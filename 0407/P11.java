package Apr7st;

public class P11 implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		P11 main = new P11();
		Thread thread = new Thread(main);
		thread.start();
	}
	
	public void run() {
		System.out.println("Thread");
	}

}
