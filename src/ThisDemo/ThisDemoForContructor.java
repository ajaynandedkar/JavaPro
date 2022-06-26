package ThisDemo;

public class ThisDemoForContructor {
	
	ThisDemoForContructor() {		
		this(10);
	}
	ThisDemoForContructor(int a)
	{
		this(10,20);    //Rule 1: this keyword should be used on 1st line of the constructor
		System.out.println("This is 1 args contructor");
	}

	ThisDemoForContructor(int a, int b)
	{
		this(10,20,30);
		System.out.println("This is 2 args contructor");
	}
	ThisDemoForContructor(int a, int b, int c){
		
		System.out.println("This is 3 args construcor");
	}
	
	//Rule 2: Constructor chaining is not allowed. Means it should not create loop while calling constructor in
	//other constructor
	public static void main(String[] args) {

		ThisDemoForContructor demo = new ThisDemoForContructor();
	}

}
