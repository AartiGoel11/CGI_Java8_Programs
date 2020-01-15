package com.example;

import java.util.function.BiFunction;

class Employee2
{
	int eno;
	String name;
	
	Employee2(int eno,String name)
	{
		this.eno=eno;
		this.name=name;
	}
	
	public String toString()
	{
		return eno+":"+name;
	}
}
public class BiFunction1 {

	public static void main(String[] args) {

BiFunction<Integer, String, Employee2> f = (eno, name) -> new Employee2(eno,name);

System.out.println(f.apply(23,"Aarti"));

	}

}
