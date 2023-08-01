package green;

import java.util.Random;
import java.util.Scanner;

public class Exexex {
    public static void main(String[] args) {
        Random random = new Random();
        int resultRandom = random.nextInt(5) + 1;
        int i = 0, s = 3;
        while (i < 3) {
            i++;
            s--;
            System.out.print("숫자를 입력하세요: ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            if (resultRandom == x) {
                System.out.println("랜덤 숫자는 : " + resultRandom);
                System.out.println("성공");
                break;
            } else {
                System.out.println("랜덤 숫자는 : " + resultRandom);
                System.out.println("실패");
                System.out.println("남은횟수 : " + s);
            }

            if (s == 0) {
                System.out.println("다음 기회에");
            }
        }
    }
}
