package green;

public class Forfor {

    final static int N = 5;

    // N 이라는 상수를 정의
    public static void main(String[] args) {
        // 원을 출력해보기
        // x^2 + y^2 = r^2 = 원의 방정식
        for (int i = -N; i <= N; i++) {
            for (int j = -N; j < N; j++) {
                if (i * i + j * j <= N * N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}