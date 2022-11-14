import java.util.*;
class indexnumber
{

  public static void main(String [] args)
  {
  ArrayList<String> list=new ArrayList<String>();
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
  String a=list;
 // System.out.println(list.index);
    for (int i = 0; i < a.length; i++) {  
            System.out.println(a[i] + " ");  
        }  



  }

}