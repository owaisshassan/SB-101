package sprint1day2Generics;

import java.util.ArrayList;
import java.util.List;

//wildcards: unknown values
//UpperBounds WildCards: <? extends something>
//LowerBounds WildCards: <? super something>
public class _4UpperBoundsWildCards {

	public static void main(String[] args) {
		
		List<Integer> l1= new ArrayList<>();
		l1.add(2);
		
		List<? extends Number> l2= new ArrayList<>();
		l2.add(3, null);
		
		
	}
	
	
}
