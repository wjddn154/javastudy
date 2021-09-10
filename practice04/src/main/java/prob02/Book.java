package prob02;

public class Book {
	private int bookNo;
	private String name;
	private String author;
	private int stateCode;

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.name = title;
		this.author = author;
		this.stateCode = 1;
	}
	

	//대여기능 메소드
	public void rent() {
		this.stateCode = 0;
		System.out.println(name + "이(가) 대여됐습니다.");
	}
	
	
	//Book 객체의 정보를 출력
//	public void displayBookInfo(Book[] books) {
//		for(int i=0; i<books.length; i++) {
//			System.out.println("책 제목:" + name + ", 작가:" + author + ", 대여 유무:" + stateCode);
//		}
//	}
	
	
	
	public int getStateCode() {
		return stateCode;
	}


	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}


	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
}