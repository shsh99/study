package green;
class Book1 {
    private String title;
    private int price;
    public String getTitle() {
        return title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    Book1(){}
    Book1(String title, int price) {
        this.title = title;
        this.price = price;
    }
    void printBook1() {
        System.out.println("title : " + title);
        System.out.println("price : " + price);
    }
}
public class code11 {
    public static void main(String[] args) {
        Book1 bk = new Book1("JAVA",27000);
        bk.printBook1();
        //bk.price = 27000;
        bk.setPrice(310000);
        bk.setTitle("Good JAVA");
        System.out.println("title : " + bk.getTitle());
        System.out.println("price : " + bk.getPrice());
    }
}
