import java.util.*;

public class Barcode implements Comparable<Barcode>{
	
	private String zip;
	
	private static final String[] converter = {"||:::", ":::||", "::|:|", "::||:",  ":|::|",   ":|:|:",  ":||::",  "|:::|",   "|::|:",  "|:|::", };
	
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
			temp += Integer.parseInt(zip.charAt(i) + "");
		}
		zip += (temp % 10);
	}
	public String getZip(){
		return zip;
	}
	
	public int compareTo(Barcode code){
		return (this.getZip().compareTo(code.getZip()));
	}
	
	private static boolean checkSum(String a){
		int b = 0;
		for(int i = 0; i < 5; i++){
			b += Integer.parseInt(a.charAt(i) + "");
		}
		if(b % 10 == Integer.parseInt(a.charAt(5) + "")){
			return false;
		}
		else{
			return true;
		}
	}
	
	public static String toZip(String code){
		if(code.length() != 32){
			throw new IllegalArgumentException("Must be length 32");
		}
		if (code.charAt(0) != '|' || code.charAt(31) != '|'){
			throw new IllegalArgumentException("Need guard caps");
		}
		for(int i = 0; i < 32; i++){
			if(code.charAt(i) != ':' && code.charAt(i) != '|'){
				throw new IllegalArgumentException("Bad character");
			}
		}
		String product = "";
		String temp = code.substring(1,31);
		for(int i = 0; i < 6; i++){
			String hold = temp.substring(i * 5, i * 5 + 5);
			int a = Arrays.asList(converter).indexOf(hold);
			if(a == -1){
				throw new IllegalArgumentException("Invalid translation");
			}
			product += a;
		}
		//checking the checksum
		if (checkSum(product)){
			throw new IllegalArgumentException("Checksum not satisfied");
		}
		return product;
	}
	
	public static String toCode(String zip){
		if(zip.length() != 5){
			throw new IllegalArgumentException("Wrong length");
		}
		try{
			Integer.parseInt(zip);
		}	
		catch(NumberFormatException e){
			throw new IllegalArgumentException("A char is not a digit");
		}
		String temp = "|";
		int z = 0;
		for(int i = 0; i < 5; i++){
			int a = Integer.parseInt(zip.charAt(i) + "");
			temp += converter[a];
			z += a;
		}
		temp += (converter[z % 10] + "|");
		return temp;
	}
	
	public String toString(){
		return this.zip + " " + toCode(zip.substring(0,5));
	}
	
	public static void main(String[]args){
	
	Barcode a = new Barcode("41824");
	System.out.println(a);
	Barcode b = new Barcode("18249");
	System.out.println(b);
	
	System.out.println(a.compareTo(b));
	System.out.println(b.compareTo(a));
	
	System.out.println(toCode("47162"));
	System.out.println(toCode("41828"));
	System.out.println(toZip("||||||||||||||||||||||||||||||||"));
    }

	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
