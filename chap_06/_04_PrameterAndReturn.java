package chap_06;

public class _04_PrameterAndReturn {
//    public static void power(int number) { // Parameter, 매개변수
//        int result = number * number;
//        System.out.println(number + " 의 2 승은 " + result);
//    }

    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }


//    public static void powerByExp(int number, int exponent) {
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        System.out.println(number + " 의 " + exponent + " 승은 " + result);
//    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int retVal = getPower(2); // 2 * 2 = 4;
        System.out.println(retVal); // 2 * 2 = 4;

        retVal = getPower(3);
        System.out.println(retVal); // 3 * 3 = 9

        retVal = getPowerByExp(3,3);
        System.out.println(retVal); // 3 * 3 * 3 = 27

        System.out.println(getPowerByExp(2,4)); // 16
    }
}

