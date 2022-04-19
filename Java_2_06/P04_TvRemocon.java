package Java_2_06;

public class P04_TvRemocon {
	int k27_limit_up_vol = 30; // 최대 볼륨 선언과 대입
	int k27_limit_down_vol = 0; // 최소 볼륨 선언과 대입
	int k27_limit_up_channel = 999; // 최대 채널 선언과 대입
	int k27_limit_down_channel = 1; // 최소 채널 선언과 대입
	int k27_vol = 26; // 현재 볼륨 선언과 대입
	int k27_channel = 30; // 현재 채널 선언과 대입
	String k27_help; // 문자열 선언

	void k27_VolUp() { // 볼륨을 올리는 메소드 선언
		if (k27_vol == k27_limit_up_vol) { // 현재 볼륨이 최대치라면
			k27_help = "최대치볼륨입니다";
		} else { // 최대치가 아니라면
			k27_vol++; // 소리 1 키우기
			k27_help = String.format("소리 크기는 %d입니다", k27_vol); // 현재 볼륨과 메세지 출력
		}
	}

	void k27_VolDn() { // 볼륨을 내리는 메소드 선언
		if (k27_vol == k27_limit_down_vol) { // 현재 볼륨이 최소치라면
			k27_help = "음소거중입니다";
		} else { // 최소치가 아니라면
			k27_vol--; // 소리 1 내리기
			k27_help = String.format("소리 크기는 %d입니다", k27_vol); // 현재 볼륨과 메세지 출력
		}
	}

	void k27_ChannelUp() { // 채널을 올리는 메소드 선언
		if (k27_channel == k27_limit_up_channel) { // 현재 채널이 최대치라면
			k27_help = "마지막 채널 입니다";
		} else { // 최대치가 아니라면
			k27_channel++; // 채널번호 1 올리기
			k27_help = String.format("%d번 채널 입니다", k27_channel); // 현재 채널과 메세지 출력
		}
	}

	void k27_ChannelDown() { // 채널을 내리는 메소드 선언
		if (k27_channel == k27_limit_down_channel) { // 현재 채널이 최소치라면
			k27_help = "처음 채널 입니다";
		} else { // 최소치가 아니라면
			k27_channel--; // 채널번호 1 내리기
			k27_help = String.format("%d번 채널 입니다", k27_channel); // 현재 채널과 메세지 출력
		}
	}

}
