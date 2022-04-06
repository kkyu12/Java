package Apr6th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Report02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareSTR();
	}
	
	public static void compareSTR() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first word - > ");
		String firstWord = sc.nextLine();
		System.out.println("Input Second word - > ");
		String SecondWord = sc.nextLine();
		List<String> listFW = Arrays.asList(firstWord.split(""));
		List<String> listSW = Arrays.asList(SecondWord.split(""));
		int count = 0;
		System.out.println("1 : " + listFW.size());
		System.out.println("2 : " + listSW.size());
		ArrayList<String> noOverFW = new ArrayList<>();
		ArrayList<String> noOverSW = new ArrayList<>();
		for (String overlap : listFW) {
			if (!noOverFW.contains(overlap)) {
				noOverFW.add(overlap);
			}
		}
		for (String overlap : listSW) {
			if (!noOverSW.contains(overlap)) {
				noOverSW.add(overlap);
			}
		}
		for (int i = 0; i < noOverFW.size(); i++) {
			for (int j = 0; j < noOverSW.size(); j++) {
				if (noOverFW.get(i).equals(noOverSW.get(j))) {
					count++;
				}
			}
		}
		System.out.println("3 : " + count);
	}
}
