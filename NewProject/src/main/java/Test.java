import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class MyComparator implements Comparator<Integer>
{
	
	public int compare(Integer I1, Integer I2)
	{
		return (I1<I2 ? -1 : (I1>I2)? +1 :0);
	
	/*	if(I1<I2)
			return -1;
		else if(I1>I2)
			return +1;
		else
			return 0;*/
	}
}

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(34);
		l.add(54);
		l.add(4);
		l.add(89);
		l.add(77);
		l.add(12);
		l.add(234);
		l.add(39);
		
		System.out.println("list.."+l);
		
		Comparator<Integer> c = (I1,I2) ->  (I1<I2 ? -1 : (I1>I2)? +1 :0);
		//Collections.sort(l,new MyComparator());
		
		Collections.sort(l,c);
		
		System.out.println("sorted list "+l);


	}

}
