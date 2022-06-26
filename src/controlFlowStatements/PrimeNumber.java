package controlFlowStatements;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number=18;
		
		boolean flag=true;
		
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				flag=false;
				break;
			}
			else
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println(number+" is prime number.");			
		}
		else
		{
			System.out.println(number+" is not a prime number");
		}
		
	}

}
