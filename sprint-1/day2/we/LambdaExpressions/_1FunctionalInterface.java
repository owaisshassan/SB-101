package sprint1day2LambdaExpressions;

@FunctionalInterface

//Functional Interface:must contain only one abstract method
interface _1FunctionalInterface {

	void fun1(String name); //abs method
	
	
}

class Impl1 implements _1FunctionalInterface{

	

	@Override
	public void fun1(String name) {
		System.out.println("welcome: "+name);
		
	}
	
}


