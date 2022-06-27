package ThisDemo;

public class Student {
	
	String name;
	int age;

	Student(String name, int age){
		
		this.name=name;
		this.age=age;
	}
	
	void getStudInfo()
	{
		System.out.println("Name="+name+" Age="+age);
	}
	
	public static void main(String[] args) {

		Student stud=new Student("Ajay",30);
		stud.getStudInfo();
		Student stud1=new Student("Vijay",31);
		stud1.getStudInfo();
		System.out.println("Git Testing");
	}
	

}
