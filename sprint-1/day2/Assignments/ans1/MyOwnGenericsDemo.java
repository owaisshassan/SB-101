package sprint1day2assignmentsQues1;

public class MyOwnGenericsDemo {

	
	public static void main(String[] args) {
		
		MyOwnGenericsClass<Integer> mg1=new MyOwnGenericsClass<>();
		mg1.add(2);
		System.out.println(mg1.get());
		
		MyOwnGenericsClass<String> mg2=new MyOwnGenericsClass<>();
		mg2.add("str1");
		mg2.add("str2");
		System.out.println(mg2.get());
		
	}
}
