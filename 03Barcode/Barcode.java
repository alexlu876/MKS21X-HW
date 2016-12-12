import java.util.*;

public class Barcode {//implements Comparable<Barcode>{
	
	private String zip;
	
	private final String[] values = {"||:::", ":::||", "::|:|", "::||:",  ":|::|",   ":|:|:",  ":||::",  "|:::|",   "|::|:",  "|:|::", };
	
	public Barcode(String zip){
		if (zip.length() != 5){
			throw new IllegalArgumentException();
		}
		try{
			Integer.parseInt(zip);
		}
		catch (NumberFormatException e){
			throw new IllegalArgumentException();
		}
		this.zip = zip;
		int temp = 0;
		for(int i = 0; i < 5; i++){
			temp += zip.charAt(i);
		}
		zip += (temp % 10);
	}
	public String getZip(){
		return zip;
	}
	
	public int compareTo(Barcode code){
		return (this.getZip().compareTo(code.getZip()));
	}
	
}