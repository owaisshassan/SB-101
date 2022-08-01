package sprint1evaluation.Ques1;


import java.util.HashMap;



public class Main {

	public static void main(String[] args) {
		
		HashMap<Employee,Integer> hm= new HashMap<>();
		
		hm.put(new Employee(10,"owais","sgr"),10000);
		hm.put(new Employee(20,"hassan","kmr"),12000);
		hm.put(new Employee(30,"bhat","delhi"),15000);
		
		System.out.println(hm);
		
		
	}
}

class EmployeeComparator implements Comparable<Employee>{

	

	@Override
	public int compareTo(Employee o) {
		if(o.getName().compareTo(o.getName())<0) {
			return 1;
		}
		return 0;
	}

	
	
}