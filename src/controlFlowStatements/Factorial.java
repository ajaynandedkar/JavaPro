package controlFlowStatements;

public class Factorial {

	public static void main(String[] args) {

		int num=4;
		int fact=1;
//		for(int i=num;i>=1;i--) 	//1 method
//			fact=fact*i;

		for(int i=1;i<=num;i++)		//2 method
			fact=fact*i;
		
		System.out.println("Factorial of "+num+" is: "+fact);
	}

}
