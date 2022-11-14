import java.util.*;
class Arrayequaledemo
{
  public static void main(String [] args)
  {
	  
	  //object of array 
   int [] d1=new int[]{1,2,3,4,5,6,7};
   int [] d2=new int []{1,2,3,4,5,6,7};
   
   if( Arrays.equals(d2,d1))
   {
    System.out.println("Array is equals");
   }
   else
   { 
   System.out.println("Array are not equals");
   }  
  }


}