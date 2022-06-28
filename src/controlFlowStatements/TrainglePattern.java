package controlFlowStatements;

public class TrainglePattern {

	public static void main(String[] args) {
		
		int totalRow=5;
		
		for(int row=1;row<=totalRow;row++)
		{
			for(int space=1;space<=totalRow-row;space++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=2*row-1;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
