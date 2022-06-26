package controlFlowStatements;

public class StarPattern3 {

	public static void main(String[] args) {
	
		int totalRow=7;
		
		for(int i=1;i<=totalRow;i++)
		{
			for(int j=1;j<=totalRow-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
