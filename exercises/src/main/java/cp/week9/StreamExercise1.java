package cp.week9;
<<<<<<< HEAD
import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream; 
=======

>>>>>>> 8c33d7aa2f6387148532c3e6016e7c26d1ec13b9
public class StreamExercise1
{
	/*
	- Create a file with many (>100) lines of text.
	  For example, you can use this website: loremipsum.io
	- Use Files.lines to get a stream of the lines contained within the file.
	- Use Stream::filter and Stream::forEach to print on screen each line that ends with a dot.
	*/
	public static void main(String[] args) {
		Path MyPath = Paths.get("exercises\\src\\main\\java\\cp\\week9\\text.txt");
		try(Stream<String> MyStream =Files.lines(MyPath)) {

			MyStream.filter(s -> {return s.charAt(s.length()-1) == '.';}).forEach(System.out::println);
					
		} catch (Exception e) {
			System.err.println("Error ;(");
		}
	}
	

}
