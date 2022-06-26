package controlFlowStatements;

public class Pattern4 {

	public static void main(String[] args) {
		
		int TotalRow=5;
		
		for(int row=1;row<=TotalRow;row++)
		{
			for(int space=1;space<=TotalRow-row;space++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=2*row-1;star++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
