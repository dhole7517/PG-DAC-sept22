
import java.util.*;

class ArraytoTreeset
{
	public static void main (String[] args)
	{
		String[] arr = {"Rahul", "rohit","Shubham", "kohli"};

		List<String> list =Arrays.asList(arr);
		TreeSet<String> treeset=new TreeSet<String>(list);
		for(String str : treeset)
		{
		System.out.println(str);
		}
	}
}

