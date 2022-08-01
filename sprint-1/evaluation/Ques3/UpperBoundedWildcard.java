package sprint1evaluation.Ques3;


import java.util.ArrayList;

import java.util.List;

public class UpperBoundedWildcard {

   //wildcards are unknown values.
    //we can use an upper bounded wildcard to relax the restrictions on a variable.
     //For example, if someone want to write a method that works on List<Integer>, List<Double>, and List<Number>;
    // he or she  can achieve this by using an upper bounded wildcard.
     
   

public static void main(String[] args) {
		
		List<Integer> l1= new ArrayList<>();
		l1.add(2);
		
		List<? extends Number> l2= new ArrayList<>();
		l2.add(3, null);
		System.out.println(l2);
		
		List<? extends String> l3 =new ArrayList<>();
		l3.add(0, null);
		System.out.println(l3);
		
	}
}
