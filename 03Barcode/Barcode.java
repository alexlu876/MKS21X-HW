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
		for(char a : zip){
			temp += a;
		}
		zip += (temp % 10);
	}
	public String getZip(){
		return zip;
	}
	
	
}