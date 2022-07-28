package sprint1day2Generics;

public class _3GenericMethods {

	//method- to print an array
	//DRY - "don't repeat yourself"
	public static <E> void printArrayGeneric(E[] ele) {
		for(E element: ele) {
			System.out.println(element);
		}
	}
//	public printArray(int[] a) {
//		
//	}
	public static void main(String[] args) {
		
		Integer[] intArr= {1,2,3,4,5};
		Character[] charArr= {'a','b','c'};
		
		printArrayGeneric(intArr);
		printArrayGeneric(charArr);
		
		
	}
	
}
