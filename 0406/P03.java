package Apr6th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("park");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------------");

		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("--------------------");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			numbers.add((int) (Math.random() * 100));
		}
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		numbers.remove((numbers.size() / 2));
		numbers.remove((numbers.size() / 2));
		System.out.println(numbers);
	}
}
