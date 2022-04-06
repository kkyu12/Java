package Apr6th;

import java.util.ArrayList;
import java.util.Collections;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");
		
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(2));
		
		name.remove(1);
		System.out.println(name);
		
		name.set(1, "park");
		System.out.println(name);
		System.out.println(name.size());
		
		name.add("lee");
		System.out.println(name);
		
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
		
		name.add("lee");
		System.out.println(name);
		
		ArrayList<String> randNum = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			randNum.add(String.valueOf((int)(Math.random()*1000)));
		}
		System.out.println(randNum);
		Collections.sort(randNum);
		System.out.println(randNum);
		
		Collections.reverse(randNum);
		System.out.println(randNum);
	}

}
