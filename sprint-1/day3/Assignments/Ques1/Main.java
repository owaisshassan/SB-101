package sprint1day3assignments.Ques1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
//Using java 8 functionality sort them according to their RollNo. and
//filter out the students getting marks below 250 out of 500. And display them.
	public static void main(String[] args) {
		List<Students> stuList= Arrays.asList(
				new Students(2,"owais",253),
				new Students(3,"bhat",137),
				new Students(4,"hassan",445),
				new Students(1,"ovee",123)
		);
		
		Collections.sort(stuList, new SortByRoll());
	
	 	stuList
			.stream()
		    .filter(student -> student.marks<250)
			.forEach(student -> System.out.println(student));
		
		
		
		
	}
}

class SortByRoll implements Comparator<Students> {

	

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.rollNo-o2.rollNo;
	}
	
	
}
