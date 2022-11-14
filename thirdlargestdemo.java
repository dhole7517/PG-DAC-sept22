class thirdlargestdemo
{

  static void thirdLargest(int arr[],int arr_size)
{
	
	if (arr_size < 3)
	{
		System.out.printf(" Invalid Input ");
		return;
	}

	//  first largest element
	int first = arr[0];
	for (int i = 1;i < arr_size ; i++)
		if (arr[i] > first)
	       first = arr[i];

	//  second largest element
	int second = Integer.MIN_VALUE;
	for (int i = 0;i < arr_size ; i++)
		if (arr[i] > second &&arr[i] < first)
			second = arr[i];

	//  third largest element
	int third = Integer.MIN_VALUE;
	for (int i = 0;i < arr_size ; i++)
		if (arr[i] > third &&arr[i] < second)
			third = arr[i];

	System.out.printf("The first Largest " +"element is %d\n", first);
	System.out.printf("The second Largest " +"element is %d\n", second);
	System.out.printf("The third Largest " +"element is %d\n", third);
}

// Driver code
public static void main(String []args)
{
	int arr[] = { 24,54,31,16,82,45,67};
	int n = arr.length;
	thirdLargest(arr, n);
}
}


		
		
		
		
		
		
		
		
		
		
		
		
	
       
 
    
	