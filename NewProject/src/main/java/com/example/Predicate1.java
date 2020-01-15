package com.example;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {

 int[] x = {0,23,45,33,44,66,56,78};
 
 Predicate<Integer> p1 = i -> i%2==0;
 
 Predicate<Integer> p2 = j -> j>10;
 System.out.println("AND OUTPUT");
 for(int t : x)
 {
 if(p1.and(p2).test(t))
 {
	 System.out.println(t);
	
 }
 
	}
 System.out.println("==================================================");
 
 System.out.println("OR OUTPUT");
 
 for(int t : x)
 {
 if(p1.or(p2).test(t))
 { 
	 System.out.println(t);
	
 }
	}
 System.out.println("=================================================");
 
 System.out.println("NEGATE OUTPUT");
 
 for(int t : x)
 {
 if(p1.negate().test(t))
 { 
	 System.out.println(t);
 }
	}
 System.out.println("===================================================");

	}

}
