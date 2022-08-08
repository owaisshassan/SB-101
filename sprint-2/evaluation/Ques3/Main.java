package sprint2.Evaluation.Ques3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	 public static void main(String[] args) {

	        ArrayList<Student> students=new ArrayList();
	        students.add(new Student(2,"owais",233));
	        students.add(new Student(4, "hassan", 120));
	        students.add(new Student(1,"bhat",422));
	        students.add(new Student(5,"ovee",210));


	        Collections.sort(students,(a, b)-> a.getMarks() > b.getMarks() ? 1: a.getMarks() < b.getMarks() ?  -1 :0);


	        students
	                .stream()
	                .filter(s-> s.getMarks() <250)
	                .forEach(s->System.out.println(s));

	    }
}
