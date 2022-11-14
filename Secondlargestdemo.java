class Secondlargestdemo
{
   static int getSecondLargest(int []a1,int total)
   {
     int temp;
	 for(int i=0;i<total;i++)
	 {
	    for(int j=i-1;j<total;j++)
		 {
		   if(a1[i]>a1[j])
		   {
		    temp=a1[i];
			a1[i]=a1[j];
			a1[j]=temp;
		   }
		 }
	 }
	 return a1[total-2];
   
   }
   public static void main(String [] args)
   {
	   int a[]={1,2,3,4,5,6};
	  // int b[]={22,33,55,66,77,88};
	   System.out.println("second largest" + getSecondLargest(a,6));
	   //System.out.println("second largest"+getSecondLargest(b,7));
	   
	   
	   
   }





}