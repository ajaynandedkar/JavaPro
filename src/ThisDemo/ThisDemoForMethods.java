package ThisDemo;

public class ThisDemoForMethods {
	
	void m1()
	{
		this.m2(); //no need to use this keyword explicitly.
		System.out.println("This is m1");
	}
	
	void m2()
	{
		m3(); // same as this.m3()
		System.out.println("This is m2");
	}
	void m3()
	{
		System.out.println("This is m3");
	}
	

	public static void main(String[] args) {

		ThisDemoForMethods demo=new ThisDemoForMethods();
		demo.m1();
	}

}
