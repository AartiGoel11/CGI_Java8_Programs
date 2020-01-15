package com.example;

import java.util.function.Consumer;

class Movie
{
	String name;
	
	Movie(String name)
	{
		this.name=name;
	}
}
public class MovieTest {

	public static void main(String[] args) {

Consumer<Movie> c1 = c -> System.out.println(c.name +" ready to release");
Consumer<Movie> c2 = c -> System.out.println(c.name +" released but it is big fault");
Consumer<Movie> c3 = c -> System.out.println(c.name +" storing in the database");

Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

/*c1.accept(new Movie("test"));
c2.accept(new Movie("test"));
c3.accept(new Movie("test"));
*/

cc.accept(new Movie("testtttttttt"));
	}

}
