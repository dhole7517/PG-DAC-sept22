import java.util.*;
class highest_occurred_character
{
public static void mani(String [] args)
{
   Scanner sc=new Scanner(System.in);
    String t=sc.nextLine();
    char tempAray[]=t.toCharArray();
     Array.sort(tempAray);
     String s=new String (tempAray);
    int n=s.length();
   int max_count =0;
   int count =1;
   char ans  =  '-';
   for(int i =1; i<=n; i++){
	   
   if((i==n) || (s.charAt(i)) != s.charAt(i-1)))
  {
   if(max_count <count )
  {
   max_count =count;
   ans =s.charAt(i-1);
  
  }
  count =1;
  }
  else
  {
   count++;
  }
   }
  System.out.println(ans);
}
}