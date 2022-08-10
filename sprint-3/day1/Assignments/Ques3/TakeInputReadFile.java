package sprint3.Day1.Assignments.Ques3;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TakeInputReadFile {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName= sc.next();
		
		Path p=Paths.get(fileName);
		try {
			if(Files.exists(p)) {
				System.out.println("File exists");
			}else {
				Files.createFile(p);
				System.out.println(p+" file created successfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		Files.write(p, "write using NIO".getBytes());
		//StandardOpenOption.APPEND: will make sure that previous data isn't changed/deleted.
		Files.write(p, Arrays.asList("one","two"),StandardOpenOption.APPEND);
		
		Path p2=Paths.get("newfile.txt");
		Files.createFile(p2);
		List<String> list=Files.readAllLines(p);
		list.forEach(item -> item.toUpperCase());
			
		
	}
}
