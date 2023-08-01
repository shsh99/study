package chap_06;

public class Quiz_06 {
    public static String getHiddenData(String data, int index) {
       String hiddenData = data.substring(0, index); // 나코딩 -> 나**
       // for (int i = index; i < data.length(); i++)
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*"; // 나**
        }
        return  hiddenData;
    }

    // 개인정보를 비공개로 전환하는 메소드 작성
    // 하나의 메소드에서 모든 동작 처리
    // 각 정보는 아래 위치부터 비공개 적용
    // 이름 : 2번째
    // 주민등록번호 : 9번째
    // 전화번호 : 10번째
    // substring() 사용하면 문자열 일부를 자를 수 있음
    // length() 사용하면 문자열 길이를 알 수 있음
    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "990529-1234567"; // 주민등록번호
        String phone = "010-7772-6729"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8) ); // 개인정보, 비공개 시작 위치
        System.out.println("전화번호 : " + getHiddenData(phone, 9)); // 개인정보, 비공개 시작 위치

    }
}
