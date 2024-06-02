package coding.practice51;

public class Book {
    private String title;
    private String author;
    
    public Book() {
    	System.out.println("printing book details");
    } 
    public Book(String title,String author) {
    	this.title=title;
    	this.author=author;
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
	public void Display() {
		System.out.println("title of book is "+title+" and author is "+author);
	}
    
}
