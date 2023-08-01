package green;
class Person {
    private String name; // 이름
    private String phone; // 전화번호
    // class Person
    // 부모 클래스(parent class)
    // 기본 클래스 (base class)
    // class Student
    // 자식 클래스 (child class)
    // 유도 클래스 (derived class)
    Person(){}
    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    void printPerson() {
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
    }
}
class Student extends Person {
    private int score;
    Student(){}
    Student(String name, String phone, int score) {
        super(name, phone); // super 는 부모 생성자를 호출하는 키워드입니다.
        this.score = score;
    }
    void printStudent() {
        printPerson(); // 부모 클래스의 printPerson() 메소드를 사용할 수 있습니다.
        System.out.println("score : " + score);
    }
}
public class code123123 {
    public static void main(String[] args) {
        Student s = new Student("Alice", "010-1111-1111",90);
        s.printStudent();
    }
}
