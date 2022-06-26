package AccessModifires1;

public class DefaultDemo {

	int a=90; //by default all elements in class are default 
	void m1()
	{
		System.out.println("This is default method m1");
	}
	
	public static void main(String[] args) {
	
		DefaultDemo dm = new DefaultDemo();
		System.out.println(dm.a);
		dm.m1();
		DefaultDemo1 dm1 = new DefaultDemo1();
		dm1.m3();
		
			
		}
		

	

}
