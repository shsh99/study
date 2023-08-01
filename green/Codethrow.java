package green;
class MyException extends Exception { // Exception 클래스를 상속받는 클래스 만듭니다.
    // MyException 은 사용자가 만든 예외 클래스 입니다.
    int x;
    MyException(int x) {
        this.x = x;
    }
    public String toString() {
        return  "I am " + x + " in MyException class";
    }
}
public class Codethrow {
    public static void main(String[] args) {
        MyException me = new MyException(10); // me 는 예외 객체 참조 변수입니다.
        try {
            System.out.println("before throw MyException");
            throw me; // 예외를 발생시킴
        }
        catch (MyException e) {
            System.out.println(e);
        }
        System.out.println("main ends");
    }
}
