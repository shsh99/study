package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 체온이 38도 이상인 사람은 코로나 의심환자이므로 동행이 불가능 합니다.
        // 체온이 38도 이하인 사람은 코로나 의심환자가 아니므로 동행이 가능 합니다.

        // 삼항 연산자 이용
        int Bodytemperature = 38;
        String result = (Bodytemperature >= 38) ? "동행이 불가능합니다" : "동행이 가능합니다";
        System.out.println("체온이 " + Bodytemperature + "인 사람은 " + result);

    }
}