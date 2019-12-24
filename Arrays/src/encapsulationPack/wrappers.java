package encapsulationPack;

import java.util.Arrays;

public class wrappers {

	public static void main(String[] args) {
		
		
		
//		String st=String.valueOf((90)+1);            //this method help's use number with string
//		System.out.println(st);
		
		
//		int i = 10;
//		Integer in= 9;
//		System.out.println(in.max(i, in));
//		String string="89";
//		System.out.println(Integer.parseInt(string)+1);       //this two methods are  help's if number is string you can change to int..
//		System.out.println(Integer.valueOf(string)+1);         //#
		
		
		
		//anagram meaning
		
		String str= "Listen";
		String str1="Silent";
		
	}
		
	

		    public boolean isAnagram(String str,String str1) {
		    	char ch[]=str.toCharArray();
		    	char ch1[]=str1.toCharArray();
		    	Arrays.sort(ch);
				Arrays.sort(ch1);
				return Arrays.equals(ch, ch1);
		    	                                                //Anagram
		    }                                                  //you can convert array to string with this function
//		
}
		
		
		
		
//		String string="hello";
//		char [] ch1=new char[string.length()];
//		for (int i = 0; i < string.length(); i++) {
//			ch1 [i]=string.charAt(i);
//			
//		}
//		
//	}
//	public boolean isAnagram(String str,String str1) {
//		char ch []=str.toCharArray();
//		char ch1 []=str1.toCharArray();
//		Arrays.sort(ch);
//		Arrays.sort(ch1);
//		return Arrays.equals(ch, ch1);
	
	

