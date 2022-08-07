package sprint2Day3.we.FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _2FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("E://abc.txt");
		fileWriter.write(100);  //int -> char -->ascii value: d
		fileWriter.write("Hey");
		fileWriter.write("\n");
		fileWriter.write("i'm Here");
		
		fileWriter.flush();
		fileWriter.close();
		
		//File Reader:
		FileReader fileReader= new FileReader("E://abc.txt");
		int index= fileReader.read();
		//when there is no character left in file, this ,method internally returns -1, therefor:
		while(index!=-1) {
			System.out.println((char) index);
			index = fileReader.read();   //reading next character -> incrementing index
		}
	}
}
