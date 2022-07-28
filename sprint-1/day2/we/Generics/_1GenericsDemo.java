package sprint1day2Generics;

import java.util.ArrayList;
import java.util.List;
//Generics:
//type safety
//error detection at compile time: fail fast
//no need to do downcasting
public class _1GenericsDemo {

	public static void main(String[] args) {
		
		//type unsafe example:
		List l = new ArrayList();
		
		l.add(5);
		l.add("hi");
		
		//int n= (int) l.get(1); //classCast Exception
		//System.out.println(n);
		
		
		List<Integer> l2= new ArrayList<>();
		l2.add(2);
		l2.add(3);
//		l2.add("hi");  //compile time error check: fail fast
		
		int n2= l2.get(1);
		System.out.println(n2);
		
	
	}	
}

//ArrayListWithoutGenerics
class ArrayListWithoutGenerics{
	public boolean add(Object obj) {
		return true;
	}
	
	public Object get(int index) {
		return 0;
	}
	
}

//ArrayListWithGenerics
class ArrayListWithGenerics<T>{
	public boolean add(T t) {
		return true;
	}
	
	public T get(int index) {
		T t =null;
		return t;
	}
	
}