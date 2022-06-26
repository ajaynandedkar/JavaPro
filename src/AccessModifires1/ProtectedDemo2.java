package AccessModifires1;
import ProtectedDemo.ProtectedDemo1;
public class ProtectedDemo2 extends ProtectedDemo1{

	public static void main(String[] args) {

		ProtectedDemo2 obj = new ProtectedDemo2();
		
		System.out.println(obj.am);
		obj.mm();

	}

}
