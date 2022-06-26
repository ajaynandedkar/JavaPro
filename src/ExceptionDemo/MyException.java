package ExceptionDemo;

public class MyException extends RuntimeException {
	
	//We can write out own exceptions to throw explicitly.
	public MyException(String str) {
		
		super(str);
	}

}
