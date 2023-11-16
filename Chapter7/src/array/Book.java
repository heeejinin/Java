package array;

public class Book {
	private String bookName; // private은 get set 필요함
	private String author; //멤버변수

	public Book() { //생성자 초기에 인스턴스를 실행할 때
		bookName = "이름없음"; //기본 생성자
		author = "저자없음";
		
	}

	public Book(String bookName, String author) {//만든 생성자
		this.bookName = bookName;
		this.author = author;
		//this.인스턴스 자신
	}

	public void showInfo() {//메서드
		System.out.println(bookName + "," + author);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
