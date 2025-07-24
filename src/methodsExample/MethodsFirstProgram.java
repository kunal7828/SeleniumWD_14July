package methodsExample;

public class MethodsFirstProgram {
	
	
	void show() //Instance method
	{
		System.out.println("It is a show method.");
	}
	
	static void show2() //static method
	{
		System.out.println("Its show 2 method.");
	}
	
	void enterName(String mapvalue)
	{
		System.out.println(mapvalue);
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsFirstProgram methodsFirstProgram= new MethodsFirstProgram();
		methodsFirstProgram.show();
		methodsFirstProgram.show2();
		methodsFirstProgram.enterName("Map Quality Solutions");

	}

}
