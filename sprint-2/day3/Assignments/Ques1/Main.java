package sprint2Day3.Assignments.Ques1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		File f= new File("E://sprint2day3.txt");  //file creation
		try {
			boolean b= f.createNewFile();
			if(b) {
				System.out.println("new file created successfully!");
			}else {
				System.out.println("file already exists!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		FileWriter fw= new FileWriter(f);  //writing in the file
		fw.write("I'm ");
		fw.write("22");
		fw.write(" years old");
		fw.write("\n");
		fw.write(" I am");
		fw.write(" Awesome!");
		
		fw.flush();
		fw.close();
	
		FileReader fr= new FileReader(f);  //reading the file character wise
		int index=fr.read();
		while(index!=-1) {
			System.out.println((char)index);
			index= fr.read();
		}
		
		
		 //reading the file line (String) wise:
		StringBuilder builder = new StringBuilder();
		 
        // try block to check for exceptions where
        // object of BufferedReader class is created
        // to read filepath
        try (BufferedReader buffer = new BufferedReader(
                 new FileReader(f))) {
 
            String str;
 
            // Condition check via buffer.readLine() method
            // holding true upto that the while loop runs
            while ((str = buffer.readLine()) != null) {
 
                builder.append(str).append("\n");
            }
        }
 
        // Catch block to handle the exceptions
        catch (IOException e) {
 
            // Print the line number here exception occurred
            // using printStackTrace() method
            e.printStackTrace();
        }
        System.out.println(builder.toString());
	}
}
