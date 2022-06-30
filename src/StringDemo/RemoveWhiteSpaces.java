package StringDemo;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// WAP to remove all white spaces in string
		
		String str="Remove White Spaces";

		System.out.println("String before removing white spaces: "+str);

		str=str.replaceAll("\\s+", "");         // \s+ multiple occurrences of spaces
		
		System.out.println("String after removing white spaces: "+str);
		
		
		
	}

}
