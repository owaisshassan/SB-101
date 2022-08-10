package sprint3.Day1.We.Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _2WriteUsingNIO {

	public static void main(String[] args) throws IOException {
		Path p= Paths.get("E://newFile.txt");
		Files.write(p, "write using NIO".getBytes());
		//StandardOpenOption.APPEND: will make sure that previous data isn't changed/deleted.
		Files.write(p, Arrays.asList("one","two"),StandardOpenOption.APPEND);
		
		Files
			.readAllLines(p)
			.stream()
			.forEach(line -> System.out.println(line));
		
		//same as:
		List<String> list=Files.readAllLines(p);
		list.forEach(item ->System.out.println(item));
		
		//find and replace: "using"
		//REPLACE: "with the help of"
		Stream<String> str=Files.lines(p);
		str
		 	.map(
		 			line ->{
		 				if(line.contains("using"))
		 					return line.replace("using", "with the help of");
		 				else
		 					return line;
		 			}
		 	).forEach(newLine -> System.out.println(newLine));
	}
}
