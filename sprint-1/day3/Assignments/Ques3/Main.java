package sprint1day3assignments.Ques3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//With the help of stream, map each Student object to the Employee object
//roll should become empId, and marks*1000 should become the salary of the Employee and get a
//List of Employee from the List of Students.

public class Main {

	public static void main(String[] args) {
		
		List<Student> stuList= Arrays.asList(
				new Student(2,"owais",253),
				new Student(3,"bhat",837),
				new Student(4,"hassan",945),
				new Student(1,"ovee",123),
				new Student(5,"owaiss",323)
		);
		

		List<Employee> empList=stuList
			.stream()
			.map(student -> new Employee(student.rollNo,student.name,student.marks*1000))
			.collect(Collectors.toList());
			
			System.out.println(empList);

		
		
	}
}
