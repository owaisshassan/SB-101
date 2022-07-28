package sprint1day2Generics;

public class _YourOwnGenerics {

	public static void main(String[] args) {
		
		MyGenerics<String> myG= new MyGenerics<>();
		myG.add("hello");
		System.out.println(myG.get());
		
		MyGenerics<Number> myG2= new MyGenerics<>();
		myG2.add(12);
		myG2.add(13.44);
		System.out.println(myG2.get());
		
		
	}
	
}

//type parameters:
//K,V,T,E,N
class MyGenerics<T>{
	T t;
	void add(T obj) {
		this.t= obj;
	}
	
	 T get(){
		return t;
	}
	
}