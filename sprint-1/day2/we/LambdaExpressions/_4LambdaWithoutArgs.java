package sprint1day2LambdaExpressions;

public class _4LambdaWithoutArgs {

	
	public static void main(String[] args) {
		
		NoArgs n1= () -> System.out.println("hello there");
		n1.hello();
		
		
	}
}

@FunctionalInterface
interface NoArgs{
	void hello();
}