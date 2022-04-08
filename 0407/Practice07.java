package Apr7st;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 10, 12};
		
		try {
			System.out.println(numbers[3]);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointer Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(numbers[2]);
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds Exception");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("General Exception");
		} finally {
			System.out.println("finally");
		}
	}
}
