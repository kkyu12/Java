package Apr4th;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		String[][] point = new String[][] { { "Name", "Korean", "English", "Math" }, { "Jeong", "70", "80", "100" },
				{ "Pyo", "60", "70", "86" }, { "Choi", "54", "100", "82" }, { "Mike", "87", "95", "79" } };
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[i].length; j++) {
				System.out.print(point[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		int[] sumPerson = new int[point.length - 1];
		int[] avgPerson = new int[point.length - 1];
		int[] minPerson = new int[point.length - 1];
		int[] maxPerson = new int[point.length - 1];
		System.out.println("Name" + "\t" + "Sum" + "\t" + "Average" + "\t" + "minimum" + "\t" + "maximum");
		for (int i = 0; i < point.length - 1; i++) {
			minPerson[i] = Integer.MAX_VALUE;
			maxPerson[i] = Integer.MIN_VALUE;
			for (int j = 1; j < point[i].length; j++) {
				sumPerson[i] += Integer.parseInt(point[i + 1][j]);
				minPerson[i] = Math.min(minPerson[i], Integer.parseInt(point[i + 1][j]));
				maxPerson[i] = Math.max(maxPerson[i], Integer.parseInt(point[i + 1][j]));
			}
			avgPerson[i] = sumPerson[i] / (point[i].length - 1);
			System.out.println(point[i + 1][0] + "\t" + sumPerson[i] + "\t" + avgPerson[i] + "\t" + minPerson[i] + "\t"
					+ maxPerson[i]);
		}
		System.out.println();

		int[] sumSubject = new int[point[0].length - 1];
		int[] avgSubject = new int[point[0].length - 1];
		int[] minSubject = new int[point[0].length - 1];
		int[] maxSubject = new int[point[0].length - 1];
		System.out.println("Subject" + "\t" + "Sum" + "\t" + "Average" + "\t" + "minimum" + "\t" + "maximum");
		for (int i = 0; i < point[i].length - 1; i++) {
			minSubject[i] = Integer.MAX_VALUE;
			maxSubject[i] = Integer.MIN_VALUE;
			for (int j = 1; j < point.length; j++) {
				sumSubject[i] += Integer.parseInt(point[j][i + 1]);
				minSubject[i] = Math.min(minSubject[i], Integer.parseInt(point[j][i + 1]));
				maxSubject[i] = Math.max(maxSubject[i], Integer.parseInt(point[j][i + 1]));
			}
			avgSubject[i] = sumSubject[i] / (point.length - 1);
			System.out.println(point[0][i + 1] + "\t" + sumSubject[i] + "\t" + avgSubject[i] + "\t" + minSubject[i]
					+ "\t" + maxSubject[i]);
		}
	}
}
