package sprint1day1we;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _2MapDemo {

	public static void main(String[] args) {
		//Map(Interface): java.util package
		//HashMap(Class): implemented class of Map Interface
		//LinkedHashMap(class): extended(child) class of HashMap Class
	
		Map<String,Integer> movieNameToRating= new HashMap<>();
		//put:hashing(key), points a particular bucket , stores "entry"(key-value pair) in a bucket.
		//Time complexity of insertion(put):  O(1)
		movieNameToRating.put("bahubali", 4);
		movieNameToRating.put("RRR", 5);
		movieNameToRating.put("RRR", 5);
		movieNameToRating.put("shamshera", 3);
       //movieNameToRating.remove("RRR");  --> to remove a particular key
		System.out.println("size is: "+movieNameToRating.size());
		
		//Searching(.get): hashing(key), particular bucket will be targeted containing that hashCode, .equals
		//TC: O(1)
		
		//collision case: when hashcode for different keys is same, (equals method comes into work)
		//linkedList gets formed on that particular bucket
		
		
		//hashCode: gives address of room
		//equals: gives exact person
		System.out.println("value of key 'RRR' : "+movieNameToRating.get("RRR"));  //.get: to get values
		
		System.out.println("key set: "+movieNameToRating.keySet());
		System.out.println("values : "+movieNameToRating.values());
		
		
		//iteration over the Map:
		Set<String> keySet= movieNameToRating.keySet();
		for(String key: keySet) {
			System.out.println(key +": "+ movieNameToRating.get(key));
		}
		
		System.out.println(movieNameToRating.entrySet());
		
		//enhanced for-loop
		Set<Map.Entry<String, Integer>> entrySet=movieNameToRating.entrySet();
		for(Map.Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey()+"==="+entry.getValue());
			
		}
		
		//forEach
		entrySet.forEach(entry -> System.out.println(entry.getKey()+"-->"+entry.getValue()));
		
	}
}
