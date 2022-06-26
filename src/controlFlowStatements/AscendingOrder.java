package controlFlowStatements;

public class AscendingOrder {

	public static void main(String[] args) {

		int number[]= {40,20,100,70,80,50};
		
		int min=0;
		
		
		for(int i=0;i<number.length;i++)
		{
			for(int j=i;j<number.length;j++)
			{
				if(number[i]>number[j])
				{
					min=number[i];
					number[i]=number[j];
					number[j]=min;
				}	
			}
				
		}
		
		System.out.println("Ascending order Array: ");
		for(int i=0;i<number.length;i++)
			System.out.print(number[i]+", ");

	}

}
