class student1
{
    String name;
	int age;
	int id;
	
	student1()
	{
		
	}
	student1( int a,int b)
	{
		System.out.println(a);
		
	}
	void studentdetilas( String name ,int age,int id)
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("id="+id);
	}
public static void main(String []args)
{
    student1 f=new student1(20,30);
	f.studentdetilas("prashant ",25,4547);
	
}
}