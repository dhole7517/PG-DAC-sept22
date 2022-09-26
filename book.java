class book
{
	//instance variable
int page ;
String name ;
int price ;
public static void main(String []args)
{
    book b1=new book();//object
	
	b1.page=45;
	b1.name="R.S.AGGARWAL";
	b1.price=450;
	
	System.out.println("page"+b1.page);
	System.out.println("name"+b1.name);
	System.out.println("price"+b1.price);
}


}