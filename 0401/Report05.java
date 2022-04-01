package Apr1st;

import java.util.Scanner;

public class Report05 {
	public static float inputNum = 0, result = 0;
	public static int beforeUnit = 0, afterUnit = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMenu();
		inputUnit();
		inputNumber();
		calUnit();
		System.out.println(result);
	}

	public static void printMenu() {
		System.out.println("# Unit");
		System.out.println("1. cm\n2. m\n3. mm\n4. km\n5. mile");
		System.out.println("Input two unit");
	}

	public static void inputUnit() {
		Scanner sc = new Scanner(System.in);
		beforeUnit = sc.nextInt();
		afterUnit = sc.nextInt();
	}

	public static void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		inputNum = sc.nextInt();
	}

	public static void calUnit() {
		if (beforeUnit == 1) {
			cmUnit(afterUnit);
		} else if (beforeUnit == 2) {
			mUnit(afterUnit);
		} else if (beforeUnit == 3) {
			mmUnit(afterUnit);
		} else if (beforeUnit == 4) {
			kmUnit(afterUnit);
		} else if (beforeUnit == 5) {
			mileUnit(afterUnit);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void cmUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = inputNum;
		} else if (afterUnit == 2) {
			result = inputNum / 100;
		} else if (afterUnit == 3) {
			result = inputNum * 10;
		} else if (afterUnit == 4) {
			result = inputNum / 100000;
		} else if (afterUnit == 5) {
			result = (float) (inputNum * 6.2137e-6);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void mUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = inputNum * 100;
		} else if (afterUnit == 2) {
			result = inputNum;
		} else if (afterUnit == 3) {
			result = inputNum * 1000;
		} else if (afterUnit == 4) {
			result = inputNum / 1000;
		} else if (afterUnit == 5) {
			result = (float) (inputNum * 0.000621);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void mmUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = inputNum / 10;
		} else if (afterUnit == 2) {
			result = inputNum / 1000;
		} else if (afterUnit == 3) {
			result = inputNum;
		} else if (afterUnit == 4) {
			result = (float) (inputNum * 1e-6);
		} else if (afterUnit == 5) {
			result = (float) (inputNum * 6.2137e-7);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void kmUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = inputNum * 100000;
		} else if (afterUnit == 2) {
			result = inputNum * 1000;
		} else if (afterUnit == 3) {
			result = inputNum * 1000000;
		} else if (afterUnit == 4) {
			result = inputNum;
		} else if (afterUnit == 5) {
			result = (float) (inputNum * 0.621371);
		} else {
			System.out.println("Wrong Number");
		}
	}

	public static void mileUnit(int afterUnit) {
		if (afterUnit == 1) {
			result = (float) (inputNum * 1690934.4);
		} else if (afterUnit == 2) {
			result = (float) (inputNum * 1609.344);
		} else if (afterUnit == 3) {
			result = inputNum * 1609344;
		} else if (afterUnit == 4) {
			result = (float) (inputNum * 1.609344);
		} else if (afterUnit == 5) {
			result = inputNum;
		} else {
			System.out.println("Wrong Number");
		}
	}

}
