class thisdemo1_18
{
     thisdemo1()
	 {
	 this();
	 System.out.println("first const ");
	 }
	 thisdemo1(int x ,int y)
	 {
	 System.out.println("");
	 }
     thisdemo1()
	 {
	 }
	public static void main(String []args)
{
thisdemo1 d1=new thisdemo1();
}
}