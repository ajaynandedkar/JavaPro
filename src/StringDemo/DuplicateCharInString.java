package StringDemo;

public class DuplicateCharInString {

	public static void main(String[] args) {

		int flag=0;
		String str = "Java Progaramming";
		char[] str1 = str.toCharArray();
		System.out.println("Duplicate Characters in String:");
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str1.length; j++) {
				if (str.charAt(i) == str1[j]) {

					flag=1;
					str1[j] = '0';
					System.out.println(str.charAt(i));
					break;
				}
				/*
				 * if(flag==1) { System.out.println(str.charAt(i)); flag=0; }
				 */	
			}
			
			

		}
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]);
		}

	}

}
