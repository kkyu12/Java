package Apr7st;

public class Practice05 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice05 connect = new Practice05();
		Thread thread = new Thread(connect);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Thread");
	}
}
