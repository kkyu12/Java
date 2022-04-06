package Apr6th;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> setList = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		TreeSet tree = new TreeSet();
		for (int i = 0; i < 5; i++) {
			String addition = sc.nextLine();
			setList.add(addition);
			tree.addAll(setList);
			System.out.println(tree);
		}
	}
}
