package sprint1day1assignmentsQues2;

import java.util.Comparator;
import java.util.Map;

import java.util.TreeMap;

public class Main {

	
	public static void main(String[] args) {
		
		Map<Student2, String> StuToMarks=new TreeMap<>(new StudentComparator());
		
		StuToMarks.put(new Student2(1, "Owais", 100), "J&K");
		StuToMarks.put(new Student2(2, "Hassan", 90), "Delhi");
		StuToMarks.put(new Student2(3, "bhat", 80), "UK");
		StuToMarks.put(new Student2(4, "ovee", 70), "Mumbai");
		
		System.out.println(StuToMarks);
		
//		Set<Map.Entry<Student2, String>> stuEntry= StuToMarks.entrySet();
//		
//		for(Map.Entry<Student2, String> e: stuEntry) {
//			System.out.println(e);
//		}
		
	}
}

class StudentComparator implements Comparator<Student2>{

	//marks in ascending order

	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.marks>o2.marks) {
			return 1;
		}
		else if(o1.marks<o2.marks) {
			return -1;
		}
		else return 0;
	}

	

	
	
}
