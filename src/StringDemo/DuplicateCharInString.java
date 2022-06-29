package StringDemo;

public class DuplicateCharInString {

	public static void main(String[] args) {

		/*
		 * int flag=0; String str = "Java Progaramming"; char[] str1 =
		 * str.toCharArray(); System.out.println("Duplicate Characters in String:"); for
		 * (int i = 0; i < str.length() - 1; i++) { for (int j = i + 1; j < str1.length;
		 * j++) { if (str.charAt(i) == str1[j]) {
		 * 
		 * flag=1; str1[j] = '0'; System.out.println(str.charAt(i)); break; }
		 * 
		 * if(flag==1) { System.out.println(str.charAt(i)); flag=0; }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * } for(int i=0;i<str1.length;i++) { System.out.print(str1[i]); }
		 */
		
		
		String str = "Java Programming";
		int count;
		
		System.out.println("Given string: "+str);
		char[] string = str.toCharArray();
		
		System.out.println("Duplicate characters in given string");
		
		for(int i=0;i<string.length;i++)
		{
			count=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j] && string[i]!=' ') 
				{
					string[j]='0';
					count++;
			
				}
				
			}
			if(count>1 && string[i]!='0')
				System.out.println(string[i]);
			
			
		}
		
		
	}

}
