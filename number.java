import java.util.Scanner;

public class number {
	

	
	public static void main(String[] args) {
		Scanner f=new Scanner(System.in);
		int number;
		System.out.println("enter the number ");
		number=f.nextInt();
		if(number%2==0)
		
			System.out.println("number is even ");
		else
			System.out.println("number is odd");
		

	}

}