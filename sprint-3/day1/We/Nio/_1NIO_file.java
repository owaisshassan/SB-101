package sprint3.Day1.We.Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _1NIO_file {

	public static void main(String[] args) throws IOException {
		Path p= Paths.get("E://newFile.txt");
		Path p2;
		if(Files.exists(p)) {
			System.out.println("file exists");
		}else {
			p2=Files.createFile(p);
			System.out.println("created a new File succesfully at: "+p2);
		}
		
	}
}
