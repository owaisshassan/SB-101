package sprint3.Evaluation.Ques2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentDB implements Serializable{
	LinkedHashSet<Student> studentsData=new LinkedHashSet<Student> ();
	public void addStudent(Student student) {
		studentsData.add(student);
	}
}
