package sprint1evaluation.Ques2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	  HashMap<String, ArrayList<String>> mobiles = new HashMap<>();


	    public String addMobile(String company, String model){
	        ArrayList<String> al = new ArrayList();
	        al.add(model);
	        mobiles.put(company,al);
	        return "Mobile added successfully";
	    }
	    

		 public List<String> getModels (String company) throws InvalidMobileException{

		        return (List<String>) mobiles.keySet();

		        
		    }


	    public static void main(String[] args) {

	   Mobile m =new Mobile();
	   m.addMobile("apple","iphone13");
	   m.addMobile("samsung","iphone12");
	   m.addMobile("ipnoe","iphone11");
	   m.addMobile("galaxy","iphone10");

	        System.out.println(m.mobiles);
	        
	        
	        try {
				System.out.println(m.getModels("apple"));
			} catch (InvalidMobileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}

	    }

	   
	
}
