package Java_2_07_1;

import java.util.ArrayList; // ArrayList�� ����ϱ� ���� ����Ʈ

public class P07_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList k27_iAl = new ArrayList();
		// ArrayList ����
		k27_iAl.add("abc"); // ArrayList�� abc �߰�
		k27_iAl.add("abcd"); // ArrayList�� abcd �߰�
		k27_iAl.add("egag"); // ArrayList�� egag �߰�
		k27_iAl.add("������0"); // ArrayList�� ������0 �߰�
		k27_iAl.add("1234"); // ArrayList�� 1234 �߰�
		k27_iAl.add("12rk34"); // ArrayList�� 12��34 �߰�
		// k27_iAl.add(356); ��̸���Ʈ�� ��Ʈ������ ������ �ϴµ� �߰��� ���ڳ����� ����

		System.out.println("********************************");
		System.out.printf(" ���� ArraySize %d \n", k27_iAl.size()); // k27_iAl�� ũ�� ���
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl��ŭ�� for��
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// �ε����� �� ���� ���� ���
		}

		k27_iAl.set(3, "������"); // 3�� ArrayList ���� ����
		System.out.println("********************************");
		System.out.printf(" ���뺯�� ArraySize %d \n", k27_iAl.size()); // k27_iAl�� ũ�� ���
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl��ŭ�� for��
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// �ε����� �� ���� ���� ���
		}

		k27_iAl.remove(4); // 4�� ArrayList ����
		System.out.println("********************************");
		System.out.printf(" ���뺯��2 ArraySize %d \n", k27_iAl.size()); // k27_iAl�� ũ�� ���
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl��ŭ�� for��
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// �ε����� �� ���� ���� ���
		}

		k27_iAl.sort(null); // ArrayList ��������
		System.out.println("********************************");
		System.out.printf(" ����ƮSort ArraySize %d \n", k27_iAl.size()); // k27_iAl�� ũ�� ���
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl��ŭ�� for��
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// �ε����� �� ���� ���� ���
		}

		k27_iAl.clear(); // ArrayList ��� ����
		System.out.println("********************************");
		System.out.printf(" ���λ��� ArraySize %d \n", k27_iAl.size()); // k27_iAl�� ũ�� ���
		for (int k27_i = 0; k27_i < k27_iAl.size(); k27_i++) { // k27_iAl��ŭ�� for��
			System.out.printf(" ArrayList %d = %s\n", k27_i, k27_iAl.get(k27_i));
			// �ε����� �� ���� ���� ��� ����� 0 ������ ���� ������ ���� for���� ���� �ȳ��´�(���ð� �����ϱ�)
		}
	}

}
