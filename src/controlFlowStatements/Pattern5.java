package controlFlowStatements;

public class Pattern5 {

	public static void main(String[] args) {

		int TotalRow=5;
		
		for(int row=1;row<=TotalRow;row++) 
		{
			for(int space=1;space<=row-1;space++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=2*(TotalRow-row)+1;star++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
				

	}

}
