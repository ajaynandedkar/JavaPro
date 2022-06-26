package AccessModifires1;

public class DefaultDemo1 {

	DefaultDemo dm = new DefaultDemo();
	
	void m3() {
		System.out.println("This is m3 method in DefaultDemo1 "+dm.a);
		dm.m1();
	}
}
