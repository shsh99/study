package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String x = "901231-1434567";
        String y = "030708-4567890";
        System.out.println(x.substring(x.indexOf("9"),x.indexOf("4")));
        System.out.println(y.substring(y.indexOf("0"),y.indexOf("5")));

        // 답
        String id = "901231-1234567"; // 주민번호 13자리
        System.out.println(id.substring(0,8)); // 0 위치부터 8 위치 직전까지
        id = "030708-4567890";
        System.out.println(id.substring(0, id.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지




    }
}
