import java.util.Scanner;
 class switchdemo4 {
	
	//static int x=10;

	public static void main(String[] args) {
		
	
		
		    System.out.println("enter the marks");
		    Scanner sc =new Scanner(System.in);
			int a=sc.nextInt();
			//System.out.println("enter the marks");
			
			a=((a>80)? 'A' :( a>=60)? 'B' :(a>=50) ? 'C':(a>=40) ? 'D': 'E');
			
			switch(a)
			{
			case 'A':
				
			System.out.println("with distinction !!");
			case 'B':
			System.out.println("first class with dist");
			break;
			case 'C':
			System.out.println("second class ");
			break;
			case 'D' :
			System.out.println("third class");
			break;
			case 'E':
			System.out.println("faile ");
			break;
			}
			
			
		}
		

}
