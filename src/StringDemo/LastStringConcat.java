package StringDemo;

public class LastStringConcat {

	public static void main(String[] args) {
		
		String str = "Ajay Suresh Nandedkar";
		//Output: Nandedkar Ajay Suresh
		
		String splitStr[] = str.split(" ");
		int len = splitStr.length;
		
		String revStr = new String(splitStr[len-1]);
		for(int i=0;i<len-1;i++)
		{
			revStr=revStr+" "+splitStr[i];
		}
		System.out.println(revStr);
		
		
		
		
	}

}
