class Intersection
{
  public static void main(String [] args)
  {
    int arr1[]={2,3,4,5,6,7,8};
	int arr2[]={4,9,8,57,34,11};
	System.out.println("intersection");
	for(int i=0;i<arr1.length;i++)
	{
	  for(int j=0;j<arr2.length;j++)
	  {
	    if(arr1[i]==arr2[j])
		{
		System.out.println(arr2[j]);
		}
		}
	}
  
  
  }


}


