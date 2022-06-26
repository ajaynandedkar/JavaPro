package controlFlowStatements;

public class MinNumber {

	public static void main(String[] args) {

		int number[]= {20,90,40,50,60,10};
		int minNumber=number[0];
		
		for(int i=1;i<number.length;i++)
		{
			if(minNumber>number[i])
				minNumber=number[i];
		}
		System.out.println("Minimum Number is "+minNumber);

	}

}
