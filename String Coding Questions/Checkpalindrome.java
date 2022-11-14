class Checkpalindrome
{

   static boolean sentencepa(String str)
   {
    int l=0;
	int h=str.length()-1;
	
	str=str.toLowerCase();
	while(1<= h)
	{
	  char getAT1 =str.charAt(l);
	  char getAth=str.charAt(h);
	  
	  if(!(getAT1 >='a'  && getAT1 <='z'))
	  l++;
	  
	  else if(!(getAth >='a' && getAth <='Z'))
		  h--;
	  
	  else if(getAT1  == getAth)
	  {
		  l++;
	  h--;}
		  else 
		  
			  return false;
	  }
	  return true;
	
	
	
   }
	public static void main(String [] args)
	{
		String str ="Too hot to hoot.";
		if(sentencepa (str))
			System.out.println("sentence is palindrome");
		else
			System.out.println("sentence is not " + " "+ "palindrome");
		
		
	}
   
   
   }




