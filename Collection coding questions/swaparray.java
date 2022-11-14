import java.util.*;
public class swaparray
{
  public static void main(String [] args)
  {
  
  ArrayList<Integer> list=new ArrayList<Integer>();
  list.add(12);
  list.add(78);
  list.add(45);
  list.add(64);
  list.add(89);
  System.out.println(list);
  Collections.swap(list,3,1);
  System.out.println(list);
  
  
  
  }




}