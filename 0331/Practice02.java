package Mar31st;

public class Practice02 {
	public static final int johnsAge = 37;
	public static final int katesAge = 55;
	public static int mikesAge = 31;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mikesAge = 30; // final
		printAge(johnsAge);
		printAge(katesAge);
		printAge(mikesAge);

	}

	public static void printAge(int personsAge) {
		System.out.println("Age : " + personsAge);
	}

}
