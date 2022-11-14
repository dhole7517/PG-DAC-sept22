import java.util.*;
class Arrayretrivedemo
{

  public static void main(String [] args)
  {
  
  ArrayList<String> array=new ArrayList<String>();
  array.add("red");
  array.add("green");
  array.add("white");
  array.add("orange");
  array.add("Black");
  
  System.out.println(array);
  
  //Retrive elements
  String elements=array.get(0);
  System.out.println("first elements:"+elements);
  elements=array.get(2);
  System.out.println("third elements:"+elements);
  
  }



}