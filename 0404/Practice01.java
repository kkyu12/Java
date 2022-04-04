package Apr4th;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		String[] name = { "kim", "lee", "park", "choi" };
		System.out.println(name.length);

		// name = {"kim","lee","choi","park"}; Error
		name[0] = "hong";

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		// int[] kopoNum = new int[5];
		// kopoNum[0] = 232;
		// System.out.println(kopoNum[0]);
		// for (int i = 0; i < kopoNum.length; i++) {
		// kopoNum[i] = i * 10;
		// }
		// for (int i = 0; i < kopoNum.length; i++) {
		// System.out.println(kopoNum[i]);
		// }

	}

}
