class minandmax
{

  public static void main(String [] args)
  {
   int arr[]=new int []{2,4,5,67,8,9,8};
   
   int smallest =arr[0];
   int largetst =arr[0];
   
   for(int i=1;i<arr.length;i++){
   if(arr[i]>largetst)
   largetst=arr[i];
   else if(arr[i]<smallest)
   smallest=arr[i];
     }
  System.out.println("largest number :"+largetst);
  System.out.println("smallest number:"+smallest);
  
  
  }


}