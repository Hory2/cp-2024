package cp.week9;

import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExercise2
{

public static void main(String[] args){

	Path MyPath = Paths.get("exercises\\src\\main\\java\\cp\\week9\\text.txt");
	try(Stream<String> MyStream = Files.lines(MyPath)) {
		// String ll =new String("hej");
		// System.err.println(ll.charAt(ll.length()-1));	
		
			/*
			- Create a stream of lines for the file created in StreamExercise1.
			- Use Stream::filter and Stream::collector (the one with three parameters)
			to create an ArrayList of all lines that start with a "C".
			- Suggestion: look at https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#collect-java.util.function.Supplier-java.util.function.BiConsumer-java.util.function.BiConsumer-
			*/
		// Files.lines(MyPath).filter(s -> {return s.charAt(1) == 'C';});
		ArrayList<String> Cline =MyStream.filter(line ->{return line.charAt(0)=='C';})
		.collect( ArrayList<String>::new ,
		(res,line) -> res.add(line),(a,b)-> a.addAll(b));
		
		System.err.println(Cline);
		
		
	} catch (Exception e) {
		System.err.println(e);
		System.err.println("Error ;(");
	}
}
}
	

