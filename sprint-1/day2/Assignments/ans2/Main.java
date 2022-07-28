package sprint1day2assignmentsQues2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> city =new ArrayList<>();
		city.add("delhi");
		city.add("Mumbai");
		city.add("Srinagar");
		
		
		PrintList pl=(cities) -> {for(String s:city) {
			System.out.println(s);
		}};
		pl.display(city);
	}	
}

interface PrintList{
	void display(List<String> city);
}