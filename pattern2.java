class pattern2
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
			for(int j=4;j>=i;j--)
			{
				System.out.print("");//not run try after sam time
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		System.out.println(" ");	
	}
}
