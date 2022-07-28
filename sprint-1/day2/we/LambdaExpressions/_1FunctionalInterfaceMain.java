package sprint1day2LambdaExpressions;

public class _1FunctionalInterfaceMain {

	public static void main(String[] args) {
		//using external class approach
		_1FunctionalInterface obj1= new Impl1();
		obj1.fun1("owais");
		
		//anonymous inner-class approach
		_1FunctionalInterface obj2= new _1FunctionalInterface() {

			@Override
			public void fun1(String name) {
				System.out.println("hello "+name);
				
			}
			
		};
		
		obj2.fun1("owais");
		
		
		
		//using lambda expression approach
		
//		_1FunctionalInterface obj3=(String name) -> {
//			System.out.println("Good Morning "+name);
//		};
		_1FunctionalInterface obj3=(n) -> {
			System.out.println("Good Morning "+n);
		};
		
		
		//when we have only one method, we can remove brackets also:
//		_1FunctionalInterface obj3= n -> System.out.println("Good Morning "+n);
		
		
		
		
	}
}
