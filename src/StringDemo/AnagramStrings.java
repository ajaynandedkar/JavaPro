package StringDemo;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
//Two strings are anagram if they contains same characters. However sequence of char can be different
		
		String str1="Brag";
		String str2="Grab";
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Strings are not anagram.");
		}
		else
		{
			//convert this strings to lower-case
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			
			//convert to char arrays
			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();
			
			
			//sort this char arrays using built-in function of Array
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			//compare using in-built function of Array  
			if(Arrays.equals(str1Array, str2Array))
				System.out.println("These are anagram strings!");
			else
				System.out.println("These are not anagram strings!");
			
		}	
	}
}
