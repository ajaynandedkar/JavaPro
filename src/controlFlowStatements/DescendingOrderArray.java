package controlFlowStatements;


public class DescendingOrderArray {

	public static void main(String[] args) {

		int numberArray[]= {50,30,40,10,80,90,100};
		
		int max=0;
		
		System.out.println("Original Array: ");
		for(int i=0;i<numberArray.length;i++) {
			System.out.print(numberArray[i]+", ");
		}
		System.out.println();
		
		for(int i=0;i<numberArray.length;i++) //To check each element of array with every other element need 2 for loops.
		{
			
			for(int j=i;j<numberArray.length;j++)  //starting j with i because for 2nd iteration of i previous element
			{										//must be already sorted.
				if(numberArray[i]<numberArray[j])	//checking if 1st element is greater than 2nd. if so then swap
				{
					max = numberArray[j];
					numberArray[j]=numberArray[i];
					numberArray[i]=max;
					
				}
			}
		}
		System.out.println("Descending order:");
		for(int i=0;i<numberArray.length;i++)
		{
			System.out.print(numberArray[i]+", ");
		}

	}

}
