package cp.week8;
<<<<<<< HEAD

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
=======
>>>>>>> 8c33d7aa2f6387148532c3e6016e7c26d1ec13b9

/**
 * 
 * @author Fabrizio Montesi
 */
public class LambdaExercise5
{
	interface BoxFunction<I,O> {
		O apply(I input);
	}
	public class Box<T> {
		final T content;
		
		public Box(T data){
			if(data == null)
			{
				throw new Exception("IllegalArgumentException");
			}
			content = data;
		}
		public T content(){
			return this.content;
		}
		public<a> a apply(BoxFunction<T,a> bf ){
			return bf.apply(this.content());
		}
		public int jebe(){
			return 3;
		}
		
		/*
		- Write a static method Box::applyToAll that, given
		  a list of Box(es) with the same type and a BoxFunction with compatible type,
		  applies the BoxFunction to all the boxes and returns a list
		  that contains the result of each BoxFunction invocation.
		*/
		
		public static<p,c> List<c> applyToAll(List<Box<p>> Boxes,BoxFunction<p,c> bf){
			List<c> res;
			Boxes.forEach(box2 ->{				
				c tmp = bf.apply(box2.content);				
				res.add(tmp);
			});
		
		}
	}
	
}
