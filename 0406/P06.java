package Apr6th;

import java.util.Stack;

public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("kim");
		System.out.println(stack);
		stack.add("lee");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
