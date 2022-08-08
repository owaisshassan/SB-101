package sprint2.Evaluation.Ques3;

public class Student {

	 private int roll;
	    private String name;
	    private int marks;
	    public Student(int roll, String name, int marks) {
	        super();
	        this.setRoll(roll);
	        this.setName(name);
	        this.setMarks(marks);
	    }
	    @Override
	    public String toString() {
	        return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	    }
	    public int getRoll() {
	        return roll;
	    }
	    public void setRoll(int roll) {
	        this.roll = roll;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getMarks() {
	        return marks;
	    }
	    public void setMarks(int marks) {
	        this.marks = marks;
	    }
}
