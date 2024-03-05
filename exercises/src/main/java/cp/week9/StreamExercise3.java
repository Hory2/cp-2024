package cp.week9;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExercise3
{
	
public static void main(String[] args){

	Path MyPath = Paths.get("exercises\\src\\main\\java\\cp\\week9\\text.txt");
	try(Stream<String> MyStream = Files.lines(MyPath)) {
		
		
		/*
		- Create a stream of lines for the file created in StreamExercise1.
		- Use Stream::filter and Stream::count to count how many lines
		  contain the letter "L".
		*/
		long num = MyStream.filter(line -> line.contains("L")).count();
		
			
		
		System.err.println(num);
		
		
		
	} catch (Exception e) {
		System.err.println(e);
		System.err.println("Error ;(");
	}
}
}

