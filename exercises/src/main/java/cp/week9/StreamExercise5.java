package cp.week9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamExercise5
{
	public static void main(String[] args){
		
		Path MyPath = Paths.get("exercises\\src\\main\\java\\cp\\week9\\text.txt");
		// Path MyPath = Paths.get("exercises\\src\\main\\java\\cp\\week9\\slovo.txt");

		try(Stream<String> MyStream = Files.lines(MyPath)) {
			
				
				/* ! (Exercises marked with ! are more difficult.)
				
				- Create a stream of lines for the file created in StreamExercise1.
				- Use Stream::map to map each line to a HashMap<String, Integer> that
				stores how many times each character appears in the line.
				For example, for the line "abbc" you would produce a map with entries:
					a -> 1
					b -> 2
					c -> 1
				- Use Stream::reduce(T identity, BinaryOperator<T> accumulator)
				to produce a single HashMap<String, Integer> that stores
				the results for the entire file.
				*/
				HashMap<Character,Integer> DocMap = new HashMap<>();
				
				MyStream.map(line -> {
						HashMap<Character,Integer> LineMap = new HashMap<>();					
						line.chars().forEach(ch-> {LineMap.merge((char) ch,1, (v,i) -> v+i);});
						return LineMap;
				}).reduce(DocMap,(res ,LinneMap )-> { 
							LinneMap.forEach((key,val)->res.merge(key, val,(a,b)-> a+b));
							return res;
						});
			System.err.println(DocMap);
			} 
		catch (Exception e) {
			System.err.println(e);
			System.err.println("Error ;(");
		}
	}
}
