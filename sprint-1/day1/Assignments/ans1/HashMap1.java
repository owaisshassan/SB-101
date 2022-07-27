package sprint1day1assignmentsQues1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
//Add 5 Indian state and their capital into this map and print all the
	//entries one by one from this map.
	
	public static void main(String[] args) {
		
		Map<String, String> indianState= new HashMap<>();
		
		indianState.put("J&K", "Srinagar");
		indianState.put("Delhi", "Agra");
		indianState.put("Bihar", "Patna");
		indianState.put("karnataka", "Kerala");
		indianState.put("Mumbai", "Maharashtra");
		
		Set<Map.Entry<String, String>> capitals =indianState.entrySet();
		
		for(Map.Entry<String, String> s : capitals) {
			System.out.println(s);
		}
		
		
		
		
	}
}
