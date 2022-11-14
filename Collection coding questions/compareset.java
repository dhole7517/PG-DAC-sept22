
import java.util.*;
public class compareset {

	public static void main(String[] args) {
		TreeSet<Integer> sc1=new TreeSet<Integer>();
		sc1.add(34);
		sc1.add(67);
		sc1.add(89);
		sc1.add(87);
		
		TreeSet<Integer> sc2=new TreeSet<Integer>();
		sc2.add(34);
		sc2.add(67);
		sc2.add(89);
		sc2.add(87);
		
		
		boolean t=sc2.equals(sc1);
		System.out.println(sc1);
		System.out.println(t);

	}

}
