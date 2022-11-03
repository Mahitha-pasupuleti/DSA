import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();  // takes no duplicates, sorts the values
		s.add(1000);
		s.add(1);
		s.add(10000);
		s.add(10);
		s.add(100);
		s.add(1000);
		int k = 3, min=0;

		System.out.println(s);

		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {   // some condition to iterate the itr
		    System.out.println(itr.next());
		}

		Iterator<Integer> itr1 = s.iterator();
		while(k!=0) {           // some condition to iterate the itr
		  //  min = itr1.next();
		  //  System.out.println(min);
		    System.out.println(itr1.next());
		    k--;
		}
	}
}
