package cp.week9;
<<<<<<< HEAD

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
=======
>>>>>>> 8c33d7aa2f6387148532c3e6016e7c26d1ec13b9

public class StreamExercise4
{
	
	public static void main(String[] args){
		
		Path MyPath = Paths.get("exercises\\src\\main\\java\\cp\\week9\\text.txt");
		try(Stream<String> MyStream = Files.lines(MyPath)) {
			
			/*
			- Create a stream of lines for the file created in StreamExercise1.
			- Use Stream::mapToInt and IntStream::sum to count how many times
			  the letter "C" occurs in the entire file.
			*/
			int sum =MyStream.mapToInt(s->(int) s.chars().filter(ch-> ch =='C').count()).sum();
			System.err.println(sum);			

			
		} catch (Exception e) {
		System.err.println(e);
		System.err.println("Error ;(");
	}
}
}
