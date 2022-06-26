package controlFlowStatements;

public class FactorialWithDoWhileLoop {

	public static void main(String[] args) {

		int num=5;
		int fact=1;
		int i=num;
		
		do 
		{
			fact=fact*i;
			i--;
		}while(i>=1);
		
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
