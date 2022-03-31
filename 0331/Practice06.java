package Mar31st;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator();
	}

	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		String[] operArr = { "+", "-", "*", "/" };
		String outputOper = "";
		double num1 = 0, num2 = 0;
		int cut = 0;

		String text = sc.next();

		for (int i = 0; i < operArr.length; i++) {
			if (text.contains(operArr[i])) {
				cut = text.lastIndexOf(operArr[i]);
				num1 = Double.valueOf(text.substring(0, cut));
				num2 = Double.valueOf(text.substring(cut + 1));
				outputOper = operArr[i];
				break;
			}
		}

		if (outputOper.equals(operArr[0])) {
			addition(num1, num2);
		} else if (outputOper.equals(operArr[1])) {
			subtraction(num1, num2);
		} else if (outputOper.equals(operArr[2])) {
			multiplication(num1, num2);
		} else if (outputOper.equals(operArr[3])) {
			division(num1, num2);
		} else {
			System.out.println("Invalid operator used"); // ��ȿ��
		}
	}

	public static double addition(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
		return result;
	}

	public static double subtraction(double num1, double num2) {
		double result = num1 - num2;
		System.out.println(result);
		return result;
	}

	public static double multiplication(double num1, double num2) {
		double result = num1 * num2;
		System.out.println(result);
		return result;
	}

	public static double division(double num1, double num2) {
		double result = 0;
		if (num2 == 0) {
			System.out.println("Indivisible by zero");
		} else {
			result = num1 / num2;
			System.out.println(result);
		}
		return result;
	}

}
