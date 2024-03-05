package cp.week8;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 
 * @author Fabrizio Montesi
 */
public class LambdaExercise4
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
	}
	/*
	- Create a list of type ArrayList<String> with some elements of your preference.
	- Create a Box that contains the list.
	- Now compute the sum of the lengths of all strings in the list inside of the box,
	  by invoking Box::apply with a lambda expression.
	*/
	
	static public void mainn (){
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("ja");
		arr1.add("jedu");
		arr1.add("dal");
		Box<ArrayList<String>> box1 = new Box(arr1);
		//Box Sorted = box1::apply();
		
		//BoxFunction<ArrayList<String>,Object> lambdapp= (d)-> {Collections.sort(d); return d;};
		BoxFunction<ArrayList<String>,Object> lambdapp= (d)-> {
			int sum = 0;
			d.forEach(i->sum+=i.length());
			; return sum;};
		box1.apply(lambdapp);
	}
		
}
