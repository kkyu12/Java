package Java_2_07_1;

import java.util.ArrayList; // ArrayList�� ���� ���� ����Ʈ

public class P08_ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k27_iTestMAX = 100000;	// ������ ���� ����, ���ϴ� �� �Է�
		// ū ���� �ð��� �ɸ����� �� ���ĵȴ�
		ArrayList k27_iAL = new ArrayList(); // ArrayList ���
		for(int k27_i = 0; k27_i < k27_iTestMAX; k27_i++) {
			// ���ϴ� ������ ���� for�� ����
			k27_iAL.add((int)(Math.random()*1000000)); // Math.random()�� ����Ͽ� ���� �߰�
			// 0 ~ 1000000 ���� �� �� ����
		}
		
		for(int k27_i = 0; k27_i < k27_iTestMAX; k27_i++) {
			// ���ϴ� ������ ���� for�� ����
			System.out.printf(" ArrayList %d = %d\n", k27_i, k27_iAL.get(k27_i));
			// ArrayList�� �ε����� �� ���� ���� ���
		}
		
		System.out.println("*********************************");
		k27_iAL.sort(null); // sort�� ����

		for(int k27_i = 0; k27_i < k27_iAL.size(); k27_i++) {
			// ���ϴ� ������ ���� for�� ����
			System.out.printf(" ArrayList %d = %d\n", k27_i, k27_iAL.get(k27_i));
			// ���ĵ� �� �������� �ε����� �� ���
		}
	}

}
