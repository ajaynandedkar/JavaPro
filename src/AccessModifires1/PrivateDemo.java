package AccessModifires1;

public class PrivateDemo {

	private int a = 30;
	private void m() {
		System.out.println("This is private method m()");
	}
	public static void main(String[] args) {
		//With private access modifier we can access within the class.
		
		PrivateDemo pd = new PrivateDemo();
		System.out.println(pd.a); 
		pd.m();

	}

}
