import java.util.*;
class switchdemo1 {
 
 public static void main(String[] args) {
	 System.out.println("enter the number");
    Scanner sc =new Scanner (System.in);
	int  c1=sc.nextInt();
	//int number c1=sc.next();
	// System.out.println("enter the number");



// int weekday =1;
 
 switch (c1 ) {
 case 1: 
 System.out.println("Sunday"); 
 //break;
 case 2: 
 System.out.println("Monday"); 
 //break;
 case 3: 
 System.out.println("Tuesday"); 
 //break;
 case 4: 
 System.out.println("Wednesday"); 
 //break;
 case 5: 
 System.out.println("Thursday"); 
 //break;
 case 6: 
 System.out.println("Friday"); 
 //break;
 case 7: 
 System.out.println("Saturday"); 
 break;
 
 default: 
 System.out.println("Not in week!! ");
 break;
 }
 }
 }