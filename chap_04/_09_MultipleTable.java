package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2
        // 2 * 2 = 4
        // ...
        // int j = 1;
        // System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 1 = 2
        // j++;
        // System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 2 = 4
        // j++;
        // System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 3 = 6
        //
        for (int i = 2; i <10 ; i++) { // 2 부터 9 까지)
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j)); // 2 * 1 = 2
            }
            System.out.println();

        }
    }
}
