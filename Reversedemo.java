class Reversedemo
{
	public static void main(String [] args)
	{
	
   int arr[]=new int []{4,5,67,5,9};
   System.out.println("the array print after swping ");
   for(int i=0;i<arr.length;i++)
   {
   System.out.print(arr[i]+" ");
   }
   System.out.println();
   System.out.println("the reverse array :");
   for(int i=arr.length-1;i>=0;i--)
   {
	   
   System.out.print(arr[i]+" ");
   }

	}



}