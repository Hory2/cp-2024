package cp.week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Fabrizio Montesi
 */
public class LambdaExercise3
{
	/*
	NOTE: When I write Class::methodName, I don't mean to use a method reference (lambda expression), I'm simply
	talking about a particular method.
	*/
	
	/*
	- Create a Box that contains an ArrayList<String> with some elements of your preference.
	- Now compute a sorted version of your list by invoking Box::apply, passing a lambda expression that uses List::sort.
	*/
	interface BoxFunction<I,O> {
		O apply(I input);
	}
	public static class Box<T> {
		final T content;
		
		public Box(T data){
			// if(data == null)
			// {
			// 	System.out.println("error ;-(");
			// 	//throw new Exception("IllegalArgumentException");
			// }
			
				content = data;
			
		}
		public T content(){
			return this.content;
		}
		public<a> a apply(BoxFunction<T,a> bf ){
			return bf.apply(this.content());
		}
	}
	
	static public void main (){
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("uz");
		arr1.add("funguje");
		arr1.add("mrdki");
		System.out.println(arr1);
		Box<ArrayList<String>> box1 = new Box<ArrayList<String>>(arr1);
		
		
		
		// BoxFunction<ArrayList<String>,Object> lambdapp= (d)-> {d.sort(Comparator.naturalOrder());; return d;};
		// box1.apply(lambdapp);
		//v2 - better
		box1.apply((box3) -> {box3.sort(Comparator.naturalOrder()); return box3;});
		System.out.println(box1.content());

	}
}
