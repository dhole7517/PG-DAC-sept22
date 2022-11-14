import java.util.*;
class insertdemo
{

  public static void main(String [] args)
  {
  LinkedList<String> list=new LinkedList<String>();
  list.add("south africa");
  list.add("india");
  list.add("bangladesh");
  list.add("pakistan");
  list.add("zimbabwe");
  list.add("england");
  list.add("ireland");
  list.add("australia");
  list.add("netherlands");
  list.add("sri lanka");
  System.out.println(list);
  // linked list first index number and second is elements
  list.add(0,"india");
  System.out.println(list);
  
  
  
  }


}