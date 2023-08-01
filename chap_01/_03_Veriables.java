package chap_01;

public class _03_Veriables {
    public static void main(String[] args) {
        String name = "신동구";
        int hour = 11;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");


        double score = 90.5;
        char grade = 'A';
        name = "신동동구";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.1415121212;
        float f = 3.1412345678F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1000000000000L;
        System.out.println(l);

    }
}