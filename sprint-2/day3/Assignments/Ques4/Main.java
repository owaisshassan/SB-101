package sprint2Day3.Assignments.Ques4;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void copyContent(File a,File b) throws IOException {
		FileWriter fw= new FileWriter(b);
		FileReader fr= new FileReader(a);
		int index;
		while((index=fr.read())!=-1) {
			fw.write(index);
		}
		fw.flush();
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input file name");
		String fName1=sc.next();
		System.out.println("Enter the output file name");
		String fName2=sc.next();
		
		File fileName1= new File("E://"+fName1+".txt");
		
		FileWriter fw= new FileWriter(fileName1);
		fw.write("i am");
		fw.write(" copied");
		fw.write(" from");
		fw.write(" input");
		fw.write(" file");
		fw.flush();
		
		
		File fileName2= new File("E://"+fName2+".txt");
		fileName2.createNewFile();
		
		copyContent(fileName1,fileName2);
	}
}
