package ch09;

public class Book {

	private String title;
	private String author;


	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, int totalPage) {
		this(title, author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	public void showInfo() {
		System.out.println(">>> 책 정보 <<<" );
		System.out.println("제목 : " + this.title );
		System.out.println("작가 : " + this.author );
		System.out.println("--------------------");
	}

}
