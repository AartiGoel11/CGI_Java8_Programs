import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1
{
	String name;
	double salary;
	
	Employee1(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return name+":"+salary;
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		
		ArrayList<Employee1> l = new ArrayList<>();
		l.add(new Employee1("Aarti", 60000.00));
		l.add(new Employee1("Shubham", 900000.00));
		l.add(new Employee1("Anil", 1000.00));
		l.add(new Employee1("Sonu", 20000.00));
		l.add(new Employee1("Amit", 120000.00));

		Predicate<Employee1> p = e -> e.salary <5000 ;
		
		for(Employee1 e1 : l)
		{
			if(p.test(e1))
			{
				System.out.println(e1);
			}
		}
		
	}

}
