package sprint1day2LambdaExpressions;

public class _1FunctionalInterfaceDemo {

	//2 ways to write a program:
	//1. declarative: --> functional programming
	//2. imparative: --> how/details? --> OOP
	
	public static void main(String[] args) {
		
		MyInterface myInterface=new Myclass();
		myInterface.sayHello("owais");
		
		
		
		
	}
	
}

@FunctionalInterface
interface MyInterface{
	abstract void sayHello(String name);
}

class Myclass implements MyInterface{

	@Override
	public void sayHello(String name) {
		System.out.println("welcome "+name);
	}
	
}
