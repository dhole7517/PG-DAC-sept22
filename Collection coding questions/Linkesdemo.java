

import java.util.HashMap;
import java.util.LinkedList;

public class Linkesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(89);
		list.add(90);
		list.add(34);
		list.add(67);
		list.add(78);
		System.out.println(list);
		list.add(0, 90);
		System.out.println(list);
		int s=list.indexOf(4);
		
		System.out.println(s);
		System.out.println(list.indexOf(4));
		HashMap<String, Integer> ha=new HashMap<String, Integer>();
		boolean d=ha.isEmpty();
		System.out.println(d);
	}

}
