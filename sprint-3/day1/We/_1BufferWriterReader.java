package sprint3.Day1.We;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//limitations of Buffered reader and writer:
//printWriter  (to-do)-->notes
public class _1BufferWriterReader {

	public static void main(String[] args) throws IOException {
//		FileWriter fw=new FileWriter("buffer.txt");
//		BufferedWriter bw= new BufferedWriter(fw);
		//same as:
		BufferedWriter bw= new BufferedWriter(
				new FileWriter("E://abc.txt")
		);
		
		bw.write('c');
		bw.write("buffered writer");
		bw.newLine();   //next line
		bw.write("next line");
		char[] chars= {'a','b'};
		bw.write(chars);
		bw.flush();
		bw.close();
		
		BufferedReader br= new BufferedReader(
			new FileReader("E://abc.txt")	
		);
		br
			.lines()
			.forEach(System.out::println);
		
		br.close();
		
//		String line=br.readLine();
//		while(line!=null) {
//			System.out.println(line);
//		}
		
	}
}
