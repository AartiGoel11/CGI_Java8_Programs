import java.util.ArrayList;
import java.util.Collections;

class Employee 
{
	String name;
	int eno;
	
	public Employee(String name , int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	public String toString()
	{
		return name+":"+ eno;
	}
}
public class LamdaExample {

	public static void main(String[] args) {
   ArrayList<Employee> l = new ArrayList<Employee>();
   l.add(new Employee("Durga",637467));
   l.add(new Employee("Aarti",87677));
   l.add(new Employee("Shubham",124467));
   l.add(new Employee("Onkar",99997));

   System.out.println("employee list.."+l);
   
//   Collections.sort(l, ((e1,e2) -> (e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0));
   Collections.sort(l, ((e1,e2) -> e1.name.compareTo(e2.name)));


 System.out.println("sorted list.."+l);
	}

}
