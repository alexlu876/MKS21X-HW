abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
	
	private String callNumber;
	
	public LibraryBook(String author, String title, String ISBN, String callNumber){
		super(author, title, ISBN);
		this.callNumber = callNumber;
	}
	
	public String getCallNumber(){
		return callNumber;
	}
	
	public int compareTo(LibraryBook a){
		return callNumber.compareTo(a.getCallNumber());
	}
	
	abstract void checkout(String patron, String due);
	abstract void returned();
	abstract String circulationStatus();
	
	public String toString(){
		return (super.toString() + " and has a call number of" + callNumber);
	}


}