package controlFlowStatements;

public class GradingSystem {

	public static void main(String[] args) {

		int Marks=60;
		
		if(Marks<35)
			System.out.println("Marks="+Marks+" and grade is F");
		else if(Marks>=35 && Marks<=40)
			System.out.println("Marks="+Marks+" and grade is D");
		else if(Marks>41 && Marks<=60)
			System.out.println("Marks="+Marks+" and grade is C");
		else if(Marks>=61 && Marks<=70)
			System.out.println("Marks="+Marks+" and grade is B");
		else if(Marks>=71 && Marks<=80)
			System.out.println("Marks="+Marks+" and grade is A");
		else if(Marks>=81 && Marks<=100 )
			System.out.println("Marks="+Marks+" and grade is A+");

	}

}
