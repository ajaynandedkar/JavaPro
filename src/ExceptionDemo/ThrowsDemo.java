package ExceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	void readFile(String str) throws FileNotFoundException
	{
		File f = new File(str);
		FileInputStream fs  = new FileInputStream(f);
		
		
	}
	//We can either use throws or try-catch block to handle the exception explicitly
	public static void main(String[] args) throws FileNotFoundException, InterruptedException{
		
		ThrowsDemo td = new ThrowsDemo();
		td.readFile("c://data.txt");
		
		Thread.sleep(100);
		

	}

}
