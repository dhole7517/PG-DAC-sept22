import java.util.*;
class ArrayListtoArray
{
  public static void main(String [] args)
  {
    ArrayList<String> list=new ArrayList<String>();
	list.add("hello");
	list.add("java");
	list.add("Tpoint");
	
	String array []=new String [list.size()];
	
	for(int i=0;i<list.size();i++)
	{
		array[i]=list.get(i);
	}
	for(String k:array)
	{
		System.out.println(k);
	}
  }
  
  
  }

