package Mar29th;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String code = sc.nextLine();
		char[] lineToChar = line.toCharArray();
		char[] codeToChar = code.toCharArray();
		char[] alphaArr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[] alphaNumLineArr = new int[26];
		int[] alphaNumCodeArr = new int[26];

		for (int i = 0; i < alphaArr.length; i++) {
			for (int j = 0; j < line.length(); j++) {
				if (alphaArr[i] == lineToChar[j]) {
					alphaNumLineArr[i]++;
				}
			}
		}

		for (int i = 0; i < alphaArr.length; i++) {
			for (int j = 0; j < code.length(); j++) {
				if (alphaArr[i] == codeToChar[j]) {
					alphaNumCodeArr[i]++;
				}
			}
		}

		int[] compareArr = new int[alphaNumCodeArr.length];
		for (int i = 0; i < alphaArr.length; i++) {
			if (alphaNumCodeArr[i] != 0) {
				compareArr[i] = alphaNumLineArr[i] / alphaNumCodeArr[i];
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < compareArr.length; i++) {
			if (compareArr[i] != 0 && compareArr[i] < min) {
				min = compareArr[i];
			}
		}
		System.out.println(min);
	}

}
