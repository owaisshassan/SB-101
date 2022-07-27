package sprint1day1we;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMain {

	
	public static void main(String[] args) {
		
		HashMap<String,Student> hm= new HashMap<>();
		
		hm.put("sgr", new Student(10,"owais",344));
		hm.put("kmr", new Student(20,"hassan",224));
		hm.put("delhi", new Student(30,"bhat",444));
		
		Set<Map.Entry<String,Student>> set=hm.entrySet();
		
		for(Map.Entry<String, Student> me:set) {
			
			
			System.out.println("city name: "+me.getKey());
			Student stu=me.getValue();
			
			System.out.println("name: "+stu.getName());
			System.out.println("roll: "+stu.getRoll());
			System.out.println("marks: "+stu.getMarks());
			System.out.println("=======");
			
		}
		
	}
}
