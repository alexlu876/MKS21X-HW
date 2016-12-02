public class Book{
	
	private String author;
	private String title;
	private String ISBN;
	
	public Book(){
		author = "anon";
		title = "who knows";
		ISBN = "00000";
	}
	
	public Book(String author, String title, String ISBN){
		this.author = author;
		this.title = title;
		this.ISBN = ISBN;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getISBN(){
		return ISBN;
	}
	
	public String toString(){
		return "The book " + title + " by " + author + " has the ISBN number of " + ISBN;
	}
	
	public static void main(String[] ARGS){
		Book a = new Book("Alex", "Wow", "12345");
		System.out.println(a);
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}

}

