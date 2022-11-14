class  removeDuplicate
{
    static String remove(char str[],int n)
	{
	  int index=0;
	  for(int i=0;i<n;i++)
	  {
	  int j;
	  for(j=0; j<i;j++)
	  {
	   if(str[i] == str[j])
	   {
	    break;
		}
       }
	   if(j == i)
	   {
	    str[index++] =str[i];
	   }
	   }
	   return String.valueof(Array.copyOf(str,index));
	}
	public static void main(String [] args)
	{
	 char str[]="implemented".toCharArray();
	 int n=str.length;
	 System.out.println(remove(Str,n));
	
	
}
	}