package AbstractClass;

public class Demo1 {

	public static void main(String[] args) {
		
		
		B b = new B();
		b.m();
		b.m1();
		b.m2();
		b.m3();
		

	}

}

//When we have partial implementation details, then we can go for abstract class concept
//1. abstract class can be declared by using abstract keyword
//2. It can have abstract as well as non-abstract methods
//3. It is not possible to create object of the abstract class. So to call abstract class constructor 
// we can invoke by using super keyword in child class constructor

abstract class A 
{
	A(){
		System.out.println("This is class A constructor");
	}
	void m()
	{
		System.out.println("This is m");
	}
	abstract void m1();
	abstract void m2();
	abstract void m3();
}

class B extends A
{
	
	B()		//This is by default added by JAVA 
	{
		super();   //super is used to call immediate parent class constructor
	}
	
	void m1()
	{
		System.out.println("This is m1");
	}
	void m2()
	{
		System.out.println("This is m2");
	}
	void m3() {
		System.out.println("This is m3");
	}
	
}