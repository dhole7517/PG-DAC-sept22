class Removechar
{
  

  public static void main(String [] args)
  {
  String s1="i am prashant dhole";
  System.out.println(charRemoveAt(s1,3));
  }
  public static String charRemoveAt(String s1,int p)
  {
  return s1.substring (0,p) +s1.substring(p+1);
  
  
  
  }
}