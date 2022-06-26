package StringDemo;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String str = "NitiN";
		
		int len = str.length();
		
		String revStr=new String();
		
		for(int i=len-1; i>=0; i--)
		{
			revStr=revStr+str.charAt(i);
		}
		
		if(str.equals(revStr))
			System.out.println("This String is Palindrom!");
		else
			System.out.println("This String is not Palindrom!");
	}

}
