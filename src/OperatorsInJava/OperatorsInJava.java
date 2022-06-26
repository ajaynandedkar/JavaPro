package OperatorsInJava;

public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=30;
		int b=40;
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		int c=++a; //Pre-increment  initially value of 'a' will incremented and then assign to c i.e a=31
		System.out.println("Value of C="+c);
		
		c=a++; //Post-increment initially value of 'a' (31) will get assign to c and then will be incremented by 1.
		System.out.println("Value of c="+c); //Now a=32
		
		c=a--;  //Value of 'a' will get assign to 'c' and then decremented by '1'
		System.out.println("Value of C="+c);

	}

}
