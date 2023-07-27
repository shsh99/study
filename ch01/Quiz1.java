package ch01;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 1번 버스 도착 정보를 출력하는 프로그램
		  
		 버스 번호는 "1234", "부산 51번" 과 같은 형태
		 남은 시간은 분 단위 (3분, 5분)
		 남은 거리는 km 단위 ( 1.5km, 0.8km)
		 
		 결과 값
		 부산 51번 버스
		 약 3분 후 도착
		 남은 거리 1.2km
		 */
		String busNo = "부산 51번";
		int min = 7;
		double distance = 4.6;
		
		System.out.println(busNo + " 버스 \n약 " + min + "분 후 도착 \n남은 거리 " + distance + "km" );
		System.out.println("===================================");
		System.out.println(busNo + " 버스");
		System.out.println(min +"분 후 도착");
		System.out.println("남은 거리는 " + distance +"km");
		
		/*
		 2번 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램
		 
		 키가 120cm 이상인 경우에만 탑승 가능
		 삼항 연산자 이용
		 
		 결과 값
		 키가 115cm 이므로 탑승 불가능합니다.
		 키가 121cm 이므로 탑승 가능합니다.
		 */
		
		int height = 115;
		int low = 123;
		String result = (height > 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
		String result1 = (low > 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
		
		System.out.println("키가 " + height +"cm 이므로 " + result);
		System.out.println("키가 " + low +"cm 이므로 " + result1);
		
		/*
		 3번 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램
		 
		 주민등록번호는 13자리 숫자로 구성
		 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
		 입력 데이터는 - 을 포함한 14자리 문자열 형태
		 
		 결과 값
		 "101010-1121211" 인 경우 101010-1 까지 출력
		 "030708-4567890" 인 경우 030708-4 까지 출력
		 */
		
		String id = "101010-1121211";
		System.out.println(id.substring(0, 8));

		String id1 = "030708-4567890";
		System.out.println(id1.substring(0, id.indexOf("-") + 2));
		
		/*
		4번 조건문을 활용해서 주차 요금 정산 프로그램
		
		주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
		경차 또는 장애인 차량은 최종요금에서 50% 할인
		
		결과 값
		일반 차량 5시간 주차시 20000원
		주차 요금은 20000원 입니다.
		
		경차 5시간 주차시 10000원
		주차 요금은 10000원 입니다.
		
		장애인 차량 10시간 주차 시 15000원
		주차 요금은 15000원 입니다.
		*/
		
		int hour = 10; // 주차 시간
		boolean isSmallCar = false; // 경차 여부
		boolean isDisabledCar = true; // 장애인 여부
		
		int fee = hour * 4000; // 주차 정산 요금 (시간당 4000원 곱하기)
		
		// 30000원 초과시 일일 최대 요금으로 수정
		if (fee > 30000) {
			fee = 30000; // 일일 최대 요금 적용
		}
		
		// 경차 또는 장애인 차량인 경우 50% 할인
		if (isSmallCar || isDisabledCar) {
			fee /= 2; // 50% 할인 적용
		}
		
		// 실행결과 출력
		System.out.println("주차 요금은 " + fee + " 원 입니다.");
		
		
		
		
		
	}

}
