package controlFlowStatements;

public class IfElseIf {

	public static void main(String[] args) {

		//Find big number among 3 numbers
		int a=50;
		int b=20;
		int c=30;
		
		if(a>b && a>c)
		{
			System.out.println("A="+a+" is big number among 3. ");
		}
		else if(b>a && b>c)
		{
			System.out.println("B="+b+" is big number among 3.");
		}
		else
		{
			System.out.println("C="+c+" is big number among 3.");
		}
		
		//to find smaller number among 3
		
		if(a<b && a<c)
		{
			System.out.println("a is smaller among 3 numbers! "+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smaller among 3 numbers! "+b);
		}
		else
		{
			System.out.println("c is smaller among 3 numbers! "+c);
		}

	}

}
