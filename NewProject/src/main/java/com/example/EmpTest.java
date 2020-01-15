package com.example;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class Student
{
	String name;
	int marks;
	
	Student(String name , int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}
public class EmpTest {

	public static void main(String[] args) {
	
		ArrayList<Student>  l= new ArrayList<>();
		
		l.add(new Student("Aarti",70));
		l.add(new Student("Shubham",90));
		l.add(new Student("Amit",50));
		l.add(new Student("Sonu",60));
		l.add(new Student("Naman",20));

		
		Function<Student,String> f = s -> {
			if(s.marks > 80)
				return "A";
			else if(s.marks>60)
				return "B";
			else if(s.marks>50)
				return "C";
			else if(s.marks>35)
				return "D";
			else if(s.marks<35)
				return "E";
			return null;
						
		};
		
		Predicate<Student> p = i -> i.marks >60;
		Consumer<Student> c = s ->
		{
			System.out.println("Student Name  " +s.name);
			System.out.println("Student Marks  " +s.marks);
			System.out.println("Student Grade   " +f.apply(s));
			System.out.println();

		};
		System.out.println("Output..........");

		/*for(Student s1 : l)
		{
			System.out.println(s1.name+":" + f.apply(s1));
		}*/
		
		for(Student s : l)
		{
			if(p.test(s))
			{
				c.accept(s);
			}
		}
	
	}

}
