package sprint2Day3.Assignments.Ques3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void countNumOfCharacters(String fileName, char target) throws IOException {
		try {
			FileReader fr= new FileReader(fileName);
			int index=fr.read();
			int count=0;
			while(index!=-1) {
				char ch = Character.toLowerCase((char)index);  //char to lowerCase
				if(ch==target) {
					count++;
				}
				index=fr.read();
			}
			System.out.println("File '"+fileName+"' has "+count+" instances of letter '"+target+"'");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the file name");
		String fName =sc.next();
		System.out.println("Enter the character to be counted");
		char cChar=sc.next().charAt(0);
		
		
		countNumOfCharacters(fName,cChar);
	}
}
