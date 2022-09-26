class methoddemo1_18
{
		static void add()
	{
		int x=10;
		int y=30;
		int z=x+y;
		System.out.println(z);
	}
	static void show(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static boolean num1 (String name,int pin)
	{
		//String ='s1';
		//zint ='o1';
		if(name == "prashant" && pin ==7517)
		{
			System.out.println( true);
		}
		else
		{
			System.out.println( false);
		}
	}
	//show(10,30);
public static void main(String []args)
{
	add();
	show(19,30);
	num1("prashant",7517);
}
}