package chap_06;

public class _05_Overloading {
    // 똑같은 이름의 메소드를 여러번 선언 가능
    // 1. 전달값의 타입, 갯수가 다를 때 가능
    public static int getPower(int number) { // "4"
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        System.out.println(getPower(3)); // 3 * 3
        System.out.println(getPower("4")); // 4 * 4
        System.out.println(getPower(3,3)); // 27

    }
}
