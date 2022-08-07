package sprint2Day3.we.FileIO;

import java.io.FileReader;

import java.io.IOException;

public class _3FileReader {

	public static void main(String[] args) throws IOException {
		
		FileReader fileReader= new FileReader("E://abc.txt");
		System.out.println(fileReader);
		int index= fileReader.read();
		//when there is no character left in file, this ,method internally returns -1, therefor:
		while(index!=-1) {
			System.out.println((char) index);
			index = fileReader.read();   //reading next character -> incrementing index
		}
	}
}
