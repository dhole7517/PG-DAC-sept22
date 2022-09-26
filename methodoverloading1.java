class overloading1
{
	

    void show( int x)
	{
	 System.out.println(x);
	}
	void show(String name,double salary )
	{
	  System.out.println("name="+name);
	  System.out.println("salary="+salary);
	//  System.out.println("")
	}
	void show(float temp1)
	{
		System.out.println(temp1);
	}
	void show(double num)
	{
		System.out.println(num);
	}
public static void main(String[]args)
{
	overloading1 ov=new overloading1();
	ov.show(67);
	ov.show("vaibhav",56747.7);
	ov.show(4.6537);
	ov.show(878447.9);
	//float  f=(float ) d;
}

}