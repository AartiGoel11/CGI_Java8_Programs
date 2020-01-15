import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {

String[] str = {"Nag","Chiranjeevi","Aarti","Shubham","Balaiah","Sunny"};

Predicate<String> p = s -> s.length()>5;

for(String s1 : str)
{
	if(p.test(s1))
	{
		System.out.println(s1);
	}
}

	}

}
