public class ReferenceBook extends LibraryBook{
	
	private String collection;
	
	public ReferenceBook(String author, String title, String ISBN, String callNumber, String collection){
		super(author, title, ISBN, callNumber);
		this.collection = collection;
	}
	
	public String getCollection(){
		return collection;
	}
	
	public void setCollection(String collection){
		this.collection = collection;
	}
	
	public void checkout(String patron, String due){
		System.out.println("Sorry, reference books may not be checked out");
	}
	
	public void returned(){
		System.out.println("How did you even check the book out");
	}
	
	public String circulationStatus(){
		return("Non-circulating reference book");
	}
	
	public String toString(){
		return (super.toString() + " and is part of the " + collection + " collection.");
	}
}