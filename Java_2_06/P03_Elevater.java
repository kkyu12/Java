package Java_2_06;

public class P03_Elevater {
	int k27_limit_up_floor = 10; // ������ ���� ����, �ֻ������� ����
	int k27_limit_down_floor = 0; // ������ ���� ����, ���������� ����
	int k27_floor = 1; // ������ ���� ����, ���� ���� ����
	String k27_help; // ���ڿ� ���� ����

	void k27_up() { // �ö󰡴� �޼ҵ� ����
		if (k27_floor == k27_limit_up_floor) { // ���� �������� �ֻ����̶��
			k27_help = "���������Դϴ�"; // ���������Դϴ� ���
		} else { // �������� �ֻ����� �ƴ϶��
			k27_floor++; // �� �� �ö�
			k27_help = String.format("%d���Դϴ�", k27_floor); // �ö� ���� �������� ���
		}
	}

	void k27_down() { // �������� �޼ҵ� ����
		if (k27_floor == k27_limit_down_floor) { // ���� �������� �������̶��
			k27_help = "ó�����Դϴ�"; // ó�����Դϴ� ���
		} else { // �������� �������� �ƴ϶��
			k27_floor--; // �� �� ������
			k27_help = String.format("%d���Դϴ�", k27_floor); // ������ ���� �������� ���
		}
	}

}
