import java.util.*;
public class SuperArrayIterator{

    private String[] data;
    private int size;

    public SuperArray(){
	data = new String[10];
	size = 0;
    }

    public SuperArray(int capacity){
	data = new String[capacity];
	size = 0;
    }

    public SuperArray(String [] ary){
	data = ary;
	size = ary.length;
    }

    public int size(){
	return size;
    }

    public void grow(){
	String[] temp = new String[data.length * 2];
	for (int i = 0; i < size; i++){
	    temp[i] = data[i];
	}
	data = temp;
    }

    public boolean add(String n){
	if  (size == data.length){
	    grow();
	}
	data[size] = n;
	size++;
	return true;
    }

    public String toString(){
	String j = "[";
	for (int i = 0; i < size - 1; i++){
	    j += data[i] + ", ";
	}
	return (j + data[size - 1] + "]");
    }

    public String toStringDebug(){
       	String j = "[";
	for (int i = 0; i < size; i++){
	    j += data[i] + ", ";
	}
	for (int i = size; i < data.length - 2; i++){
	    j += "_, ";
	}
	return (j + "_]");
    }

    public String get(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException("STOOOOOOOOOOOPID");
	}
	return data[index];
	
    }

    public void clear(){
	size = 0;
    }

    public boolean isEmpty(){
	return (size == 0);
    }

    public String set(int index, String element){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException("STOOOOOOOOOOOPID");
	}
	String x = data[index];
	data[index] = element;
	return x;
    }

    public void add(int index, String element){
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException("STOOOOOOOOOOOPID");
	}
	size++;
	if (size == data.length){
	    grow();
	}
	for (int i = size; i > index; i--){
	    data[i] = data[i - 1];
	}
	data[index] = element;
    }

    public String remove(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException("STOOOOOOOOOOOPID");
	}
	String x = data[index];
	for (int i = index; i < size; i++){
	    data[i] = data[i + 1];
	}
	size--;
	return x;
    }

    public String[] toArray(){
        String res[] = new String[size];
	for (int i = 0; i < res.length; i++){
	    res[i] = data[i];
	}
	return res;
    }

    public int indexOf(String index){
	int i;
	for (i = 0; index != data[i]; i++){
	    if (i == data.length - 1){
		return -1;
	    }
	}
	if (i < data.length){
	    return i;
	}
	else{
	    return -1;
	}
    }

     public int lastIndexOf(String index){
	int i;
	for (i = size; index != data[i]; i--){
	    if (i == 0){
		return -1;
	    }
	}
	if (i > -1){
	    return i;
	}
	else{
	    return -1;
	}
    }

    public void trimToSize(){
	String[] use = new String[size];
	for (int i = 0; i < size; i++){
	    use[i] = data[i];
	}
	data = use;
    }

    
	      
    

}
