package chap_05;

public class Quiz_05 {
    public static void main(String[] args) {
        // 신발 사이즈 옵션 출력하는 프로그램 작성
        // 신발 사이즈 250 ~ 295 까지 5 단위로 증가
        // 신발 사이즈 수는 총 10가지
        // 실행결과 사이즈 250 (재고 있음)
        String[][] size = {
                {"250", "255", "260", "265", "270",},
                {"275", "280", "285", "290", "295"}
        };

        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i].length; j++) {
                System.out.println("사이즈 " + size[i][j] + " (재고 있음)");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        String[] size2 = {"250", "255", "260", "265", "270", "275", "280", "285", "290", "295"};
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + size2[i] + " (재고 있음)");
        }
        System.out.println();

        System.out.println("-----------------------------");

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int size3 :
                sizeArray) {
            System.out.println("사이즈 " + size3 + " (재고 있음)");
        }
    }
}
