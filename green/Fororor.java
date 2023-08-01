package green;

import java.util.Scanner;

public class Fororor {
    public static void main(String[] args) {
        // 사용자에게 값을 읿력받아 원하는 구구단 출력해주기

        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 단의 숫자를 입력하세요 : ");
        int input = sc.nextInt();
        int sum = 0;
        while (input == 2) {
            for (int i = 2; i <= 0; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + "*" + j + "=" + (i * j));
                }
            }
            if (input == 3) {
                for (int i1 = 3; i1 <= 0; i1++) {
                    for (int j = 1; j <= 9; j++) {
                        System.out.println(i1 + "*" + j + "=" + (i1 * j));
                    }
                }
            } else if (input == 4) {
                for (int i2 = 4; i2 <= 0; i2++) {
                    for (int j = 1; j <= 9; j++) {
                        System.out.println(i2 + "*" + j + "=" + (i2 * j));
                    }
                }
            } else if (input == 0 + 5 + 6 + 7 + 8 +9) {
                System.out.println("종료합니다.");
                break;
            }
            System.out.println();
        }
    }
}
