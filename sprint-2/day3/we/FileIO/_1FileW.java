package sprint2Day3.we.FileIO;

import java.io.File;
import java.io.IOException;

public class _1FileW {

	public static void main(String[] args) {
		
		File file = new File("E://abc.txt");  //path name+fileName
		try {
			boolean b=file.createNewFile();  //File creation
			if(b) {
				System.out.println("new file created");
			}else {
				System.out.println("file is already there");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		System.out.println(file.exists());  //true
		
		//Create a Folder:
		File folder = new File("E://MyFolder");  //path name+folderName
		folder.mkdir();   
		System.out.println(folder);
		System.out.println(folder.exists()); //true
		
	}
}
//java.io:

/*
 * byte oriented 000101010  --->classes
 * 1. Input Stream 2. Output Stream
 * char oriented "cab"		--->classes
 *  1.reader(1.Input Stream Reader 2. Buffer Reader) 2. writer (1. Output Stream writer 2. Buffer writer
 * 
 * 
*/