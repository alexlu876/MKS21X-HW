import java.util.*;
public class SuperArrayIterator implements Iterator<String>{
	    
	int start;
	SuperArray a;
	
	public SuperArrayIterator(SuperArray a){
		this.a = a;
		start = 0;
	}
	
	public boolean hasNext(){
		return start < a.size();
	}
	
	public String next(){
		if(hasNext()){
			start++;
			return a.get(start - 1);
		}
		else{
			throw new NoSuchElementExcpetion();
		}
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}
	
}
