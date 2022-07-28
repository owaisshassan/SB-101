package sprint1day2LambdaExpressions;

public class _2FunctionalInterfaceDemo {


	public static void main(String[] args) {
		
		//standard way:
		MyInterface2 standardWay=new Myclass2();
		standardWay.sayHello("owais");
		
		//anonymous inner class:
//		MyInterface2 anonymous= new Myclass2{
//			@Override
//			public void sayHello(String name) {
//				anonymous.sayHello("welcome ano- "+name);
//			}
//		};
		
		//lambda way:
		MyInterface2 lambdaWay=(String name) -> System.out.println("welcome lambda "+name);
		lambdaWay.sayHello("bhat");
		
	}
}


@FunctionalInterface
interface MyInterface2{
	abstract void sayHello(String name);
}

class Myclass2 implements MyInterface2{

	@Override
	public void sayHello(String name) {
		System.out.println("welcome "+name);
	}
	
}