package controlFlowStatements;

public class MaxNumber {

	public static void main(String[] args) {

		int number[]= {10,20,50,30,40};
		int maxNumber=number[0];
		
		for(int i=1;i<number.length;i++)
		{
			if(maxNumber<number[i])
				maxNumber=number[i];
		}
		System.out.println("Maximum Number is :"+maxNumber);

	}

}
