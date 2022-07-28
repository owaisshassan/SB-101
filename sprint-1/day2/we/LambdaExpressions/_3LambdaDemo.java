package sprint1day2LambdaExpressions;

public class _3LambdaDemo {

	
	public static void main(String[] args) {
		
		LambdaInterface l1 = (n1,n2) -> System.out.println(n1+n2);
		l1.add(2, 3);
		
		
		//how to return:
		LambdaInterfaceWithReturn l2 = (n1,n2) -> {return n1+n2;};
		System.out.println(l2.add(2, 4));
		//another way:
		LambdaInterfaceWithReturn l3 = (n1,n2) -> n1+n2;
		System.out.println(l3.add(6, 4));
		
		
		
	}
}

@FunctionalInterface
interface LambdaInterface{
	void add(int n1, int n2);
}

@FunctionalInterface
interface LambdaInterfaceWithReturn{
	int add(int n1, int n2);
}