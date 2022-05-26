package Java_2_07_1;

public class P03_CsvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] k27_OneRec = {
				"번호,설치장소명,설치장소상세,설치시도명,설치시군구명,설치시설구분,서비스제공사명,와이파이SSID,설치연월,소재지도로명주소,소재지지번주소,관리기관명,관리기관전화번호,위도,경도,데이터기준일자",
				"1,미아동복합청사,4F 주차관리과,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk,2012-01,서울특별시 강북구 솔매로49길 14,서울특별시 강북구 미아동 197-1,강북구청,02-901-7212,37.6270597,127.0270449,2020-06-15",
				"2,보건소,1F 진료실,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk,2012-01,서울특별시 강북구 한천로 897,서울특별시 강북구 번동 232,강북구청,02-901-7212,37.6322163,127.0387405,2020-06-15",
				"3,보건소,3F 지역보건과 앞 복도,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk,2012-01,서울특별시 강북구 한천로 897,서울특별시 강북구 번동 232,강북구청,02-901-7212,37.6322163,127.0387405,2020-06-15",
				"4,보건소,4F 보건위생과,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk,2012-01,서울특별시 강북구 한천로 897,서울특별시 강북구 번동 232,강북구청,02-901-7212,37.6322163,127.0387405,2020-06-15",
				"5,삼각산보건분소,1F 진료실,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk,2012-01,서울특별시 강북구 삼양로19길 154,서울특별시 강북구 미아동 1353-8,강북구청,02-901-7212,37.6170342,127.0156591,2020-06-15",
				"6,삼각산보건분소,2F 방문간호사실,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk_Secure,2012-01,서울특별시 강북구 삼양로19길 154,서울특별시 강북구 미아동 1353-8,강북구청,02-901-7212,37.6170342,127.0156591,2020-06-15",
				"7,강북구의회,본관 1F 의회사무국,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk,2012-01,서울특별시 강북구 삼각산로 89,서울특별시 강북구 인수동 605-328,강북구청,02-901-7212,37.6406393,127.0140761,2020-06-15",
				"8,강북구의회,본관 2F 제1위원회실,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk,2012-01,서울특별시 강북구 삼각산로 89,서울특별시 강북구 인수동 605-328,강북구청,02-901-7212,37.6406393,127.0140761,2020-06-15",
				"9,강북구의회,본관 2F 제2위원회실,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk,2012-01,서울특별시 강북구 삼각산로 89,서울특별시 강북구 인수동 605-328,강북구청,02-901-7212,37.6406393,127.0140761,2020-06-15",
				"10,삼양동주민센터,1F 민원실,서울특별시,강북구,관공서,강북구청,PublicWiFi@Gangbuk,2012-01,서울특별시 강북구 삼양로 268,서울특별시 강북구 미아동 791-350,강북구청,02-901-7212,37.6273366,127.0183347,2020-06-15" };
		// 문자열 배열 생성과 값을 대입
		String[] k27_field_name = k27_OneRec[0].split(","); // 헤더 부분 쉼표단위로 끊기
		for (int k27_i = 1; k27_i < k27_OneRec.length; k27_i++) {
			// 배열 0 은 헤더이므로 배열의 1 부터 끝까지 for문
			String[] k27_field = k27_OneRec[k27_i].split(","); // 내용 부분 쉼표단위로 끊기
			System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
			for (int k27_j = 0; k27_j < k27_field_name.length; k27_j++) {
				// 각 항목을 출력하기 위해 k27_field_name 의 길이 만큼 for문
				System.out.printf(" %s : %s\n", k27_field_name[k27_j], k27_field[k27_j]);
				// 헤더와 각 항목별 내용을 출력
			}
			System.out.printf("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
		}

	}

}
