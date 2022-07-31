package sprint1day3assignments.Ques2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import sprint1day3assignments.Ques1.Students;

public class Main {

	
	//create List of Student and add 5 student object in this List with all the details(roll,name,marks)
	//from the above List of Student filter those student using stream api in a separate List whose marks
	//is less than 800
	public static void main(String[] args) {
		
		List<Student> stuList= Arrays.asList(
				new Student(2,"owais",253),
				new Student(3,"bhat",837),
				new Student(4,"hassan",945),
				new Student(1,"ovee",123),
				new Student(5,"owaiss",323)
		);
		
		List<Student> studentsMarksLessThan800=stuList
			.stream()
			.filter(student -> student.marks<800)
			.collect(Collectors.toList());
		
		System.out.println(studentsMarksLessThan800);
			
		
	}
}
