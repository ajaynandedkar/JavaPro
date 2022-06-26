package controlFlowStatements;

public class StarPattern {

	public static void main(String[] args) {
		
		int totalRows=5;
		
		
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
