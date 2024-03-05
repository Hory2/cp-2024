package cp.week9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

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
