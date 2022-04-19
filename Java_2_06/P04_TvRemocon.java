package Java_2_06;

public class P04_TvRemocon {
	int k27_limit_up_vol = 30; // �ִ� ���� ����� ����
	int k27_limit_down_vol = 0; // �ּ� ���� ����� ����
	int k27_limit_up_channel = 999; // �ִ� ä�� ����� ����
	int k27_limit_down_channel = 1; // �ּ� ä�� ����� ����
	int k27_vol = 26; // ���� ���� ����� ����
	int k27_channel = 30; // ���� ä�� ����� ����
	String k27_help; // ���ڿ� ����

	void k27_VolUp() { // ������ �ø��� �޼ҵ� ����
		if (k27_vol == k27_limit_up_vol) { // ���� ������ �ִ�ġ���
			k27_help = "�ִ�ġ�����Դϴ�";
		} else { // �ִ�ġ�� �ƴ϶��
			k27_vol++; // �Ҹ� 1 Ű���
			k27_help = String.format("�Ҹ� ũ��� %d�Դϴ�", k27_vol); // ���� ������ �޼��� ���
		}
	}

	void k27_VolDn() { // ������ ������ �޼ҵ� ����
		if (k27_vol == k27_limit_down_vol) { // ���� ������ �ּ�ġ���
			k27_help = "���Ұ����Դϴ�";
		} else { // �ּ�ġ�� �ƴ϶��
			k27_vol--; // �Ҹ� 1 ������
			k27_help = String.format("�Ҹ� ũ��� %d�Դϴ�", k27_vol); // ���� ������ �޼��� ���
		}
	}

	void k27_ChannelUp() { // ä���� �ø��� �޼ҵ� ����
		if (k27_channel == k27_limit_up_channel) { // ���� ä���� �ִ�ġ���
			k27_help = "������ ä�� �Դϴ�";
		} else { // �ִ�ġ�� �ƴ϶��
			k27_channel++; // ä�ι�ȣ 1 �ø���
			k27_help = String.format("%d�� ä�� �Դϴ�", k27_channel); // ���� ä�ΰ� �޼��� ���
		}
	}

	void k27_ChannelDown() { // ä���� ������ �޼ҵ� ����
		if (k27_channel == k27_limit_down_channel) { // ���� ä���� �ּ�ġ���
			k27_help = "ó�� ä�� �Դϴ�";
		} else { // �ּ�ġ�� �ƴ϶��
			k27_channel--; // ä�ι�ȣ 1 ������
			k27_help = String.format("%d�� ä�� �Դϴ�", k27_channel); // ���� ä�ΰ� �޼��� ���
		}
	}

}
