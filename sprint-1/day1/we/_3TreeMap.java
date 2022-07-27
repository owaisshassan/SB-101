package sprint1day1we;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _3TreeMap {

	
	public static void main(String[] args) {
		
		//TreeMap:
		//sorted Map
		
		Map<String, Integer> map= new TreeMap<>();
		
		//will sort it according to the keys
		map.put("bahubali", 4);
		map.put("rrr", 5);
		map.put("aaa", 6);
		map.put("shamshera", 3);
		
		System.out.println(map);
		
		Map<Integer, Student1> marksToStudent= new TreeMap<>();
		Student1 s1= new Student1(10, "one");
		
		marksToStudent.put(10, s1);
		marksToStudent.put(3, new Student1(9, "two"));
		marksToStudent.put(3, new Student1(8, "three"));
		System.out.println(marksToStudent);
		
		Map<Student1, Integer> StudentToMarks= new TreeMap<>(new StudentComparator());
		StudentToMarks.put(s1, 10);
		StudentToMarks.put(new Student1(9, "two"),3);
		StudentToMarks.put( new Student1(8, "three"),3);
		System.out.println(StudentToMarks);
	}
}


class StudentComparator implements Comparator<Student1>{

	//marks in ascending order

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if(o1.marks>o2.marks) {
			return 1;
		}
		else if(o1.marks<o2.marks) {
			return -1;
		}
		else return 0;
	}

	

	
	
}


class Student1{
	Integer marks;
	String name;
	
	public Student1(Integer marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
	
	
}