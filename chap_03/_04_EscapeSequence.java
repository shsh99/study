package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭 효과
        // 페페로니 피자 9000
        // 고구마 피자 8000
        // 불고기 피자 10000
        System.out.println("페페로니피자\t9000원");
        System.out.println("고구마피자\t8000원");
        System.out.println("불고기피자\t10000원");

        // \ 출력 하려면 \\ 두번
        System.out.println("C:\\program Filse\\Java");

        // \" : 큰따옴표 출력
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\"이라고 했어요");
        
        // \' : 작은따옴표 출력
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
