package StringDemo;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "This is java program!!!";
		
		int len = str.length();
		
		String revStr=new String();
		
		for(int i=len-1; i>=0; i--)
		{
			revStr=revStr+str.charAt(i);
		}
		
		System.out.println(revStr);

	}

}
