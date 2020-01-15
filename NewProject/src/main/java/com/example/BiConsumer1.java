package com.example;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee
{
	String name;
	double salary;
	
	Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
public class BiConsumer1 {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<>();
		populate(l);
		
		BiConsumer<Employee, Double> c = (e,d) -> e.salary=e.salary+d;
		for(Employee e :l)
			
		{
			c.accept(e, 500.00);
		}
		
		for(Employee e1 : l)
		{
			System.out.println(e1.name+" "+e1.salary );
		}
		
	}
	public static void populate(ArrayList<Employee> l)
	{
		l.add(new Employee("Aarti",60000));
		l.add(new Employee("Jhonny",70000));
		l.add(new Employee("Aman",34588));
		l.add(new Employee("Shreya",59999));
		l.add(new Employee("Shruti",65789));

	}

}
