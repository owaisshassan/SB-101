package sprint1day1we;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		//Map(Interface): java.util package
		//HashMap(Class): implemented class of Map Interface
		//LinkedHashMap(class): extended(child) class of HashMap Class
		
		HashMap<Integer,String> hm= new HashMap<>();
		//same key will be treated as duplicate elements, nod added
		//entry is inner interface of Map interface
		//variable of Map: Map m=
		//Entry: 
		//1.public K getKey();
		//2.public V getValue();
		//3.public V setValue();
		//Entry variable:  Map.Entry me=
		hm.put(1, "one"); //entry
		hm.put(3, "three");
		hm.put(2, "two");
		hm.put(5, "five");
		hm.put(4, "four");
		hm.put(null, "null");
		
		System.out.println(hm);//{}
		System.out.println(hm.size());
		
		//to get all the keys:
		Set<Integer> set=hm.keySet();
		
		System.out.println(set);
		
		//to get all the values:
		Collection<String> col=hm.values();
		
		for(String s: col) {
			System.out.println(s);
		}
		
		
		//to iterate all the key-value pair:
		Set<Map.Entry<Integer, String>> set2= hm.entrySet();
		System.out.println(set2); //[]
		
		//to iterate all key-value pair:
		for(Map.Entry<Integer, String> me:set2) {
			System.out.println(me.getKey()+"====="+me.getValue());
		}
		
		
		
		
		
		
	}
	
	
	
}
