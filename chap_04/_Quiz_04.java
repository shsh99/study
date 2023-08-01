package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차요금 정산 프로젝트 퀴즈
        // 일반 차량 5시간 주차 시 20000원 (주차 요금은 20000 원입니다.
        // 경차 5시간 주차 시 10000원 (주차 요금은 10000 원입니다.)
        // 장애인 차량 10시간 주차 시 15000원 (주차 요금은 15000 원입니다.)

        // 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인
        
        // 실행결과 : 주차 요금은 xx 원입니다.

        int hour = 10; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부
        
        int fee = hour * 4000; // 시간당 4000 원 곱하기
        
        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }
        
        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + " 원 입니다.");
    }
}
