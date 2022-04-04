package Apr4th;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = new int[3][5];
		int cnt;
		cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				numbers[i][j] = cnt;
				cnt++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	}

}
