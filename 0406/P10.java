package Apr6th;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> num = new LinkedList<Integer>();
		Random rand = new Random();
		int inputNum; 
		while (num.size() != 10) {
			inputNum = rand.nextInt(29) + 1;
			if (inputNum % 2 == 0) {
				continue;
			} else {
				num.add(inputNum);
			}
		}
		for (int k = 0; k < 10; k++) {
			for (int i = 1, j = 2; i < 31; i += 3, j += 3) {
				num.remove(i);
				num.remove(j);
			}
		}
		System.out.println(num);
	}

}
