package Apr7st;

public class P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "abc";
		try {
			System.out.println(line.charAt(3));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		System.out.println("Hello world");
	}

}
