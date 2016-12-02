public class CirculatingBook extends LibraryBook{
	
	public String currentHolder;
	public String dueDate;
	
	public CirculatingBook(String author, String title, String ISBN, String callNumber){
		super(author, title, ISBN, callNumber);
		currentHolder = null;
		dueDate = null;
	}
	
	public String getCurrentHolder(){
		return currentHolder;
	}
	
	public void setCurrentHolder(String currentHolder){
		this.currentHolder = currentHolder;
	}
	
	public String getDueDate(){
		return dueDate;
	}
	
	public void setDueDate(String dueDate){
		this.dueDate = dueDate;
	}
	
	public void checkout(String patron, String due){
		setCurrentHolder(patron);
		setDueDate(due);
	}
	
	public String circulationStatus(){
		if(dueDate.equals(null)){
			return("book available on shelves");
		}
		return("book checked out by " + currentHolder + ", will be returned by " + dueDate);
	}
	
	public void returned(){
		currentHolder = null;
		dueDate = null;
	}
}