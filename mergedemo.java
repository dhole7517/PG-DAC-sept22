import java.util.*;
class mergedemo
{
  public static void main(String [] args)
  {
   int arr[]={23,60,94,3,102};
   int arr1[]={42,16,74};
   int  merge[] =new int[arr.length+arr1.length];
   int d=0;
   
   for(int i=0;i< arr.length;i++){
   merge[i]=arr[i];
   d++;}
   for(int j=0;j< arr1.length;j++){
   merge[d++]=arr1[j];}
   for(int i=0;i< merge.length;i++){
	   System.out.print(merge[i]+" ,");
	   
   }  
	   Arrays.sort(merge);
	   System.out.println("elements of array sorted  in ascending order:"+" ");
	   for(int k=0;k<merge.length;k++)
	   {
		   System.out.print(merge[k]+" ");
	   }
   
  
  
  }




}