package cp.week8;

/**
 * 
 * @author Fabrizio Montesi
 */

public class LambdaExercise1
{
	
	/**
	 * Box
	 */
	public class Box<T> {
		 final T content ;

	public Box( T data)
	{
		 content = data;
	}
	public T content(){
		return this.content;
	}	
	}/*
	Create a class Box<T> with a single final field of type T called "content".
	Its constructor must take the content as parameter and set it.
	
	Add a public method called "content()" that returns the content of the box.
	*/
}
