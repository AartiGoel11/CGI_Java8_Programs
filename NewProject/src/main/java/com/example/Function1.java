package com.example;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {

Function<Integer, Integer> f = i -> i*i;

System.out.println(f.apply(4));

System.out.println(f.apply(5));

System.out.println("==========================================================");

// String Example
/**
 * Example : Send a string and display the length of the string........
 */

Function<String, Integer> f1 = s -> s.length();

System.out.println("String length.."+ f1.apply("Aarti"));
System.out.println("String length.."+ f1.apply("Shubham"));

System.out.println("========================================================");

/**
 * Convert the String to upper case
 * 
 */

Function<String,String> f2 = s -> s.toUpperCase();
System.out.println("String length.."+ f2.apply("Aarti"));
System.out.println("String length.."+ f2.apply("Shubham"));
	}

}
