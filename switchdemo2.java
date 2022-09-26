 import java.util.*;
class switchdemo2
{
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter a alphabet");
	
	char alphabet =sc.next().charAt(0);
	//int i=sc.nextInt();
	//byte b=sc.nextByte();//when use scanner class than use this type of syntax
	//string s1=sc.next();
	
	switch (alphabet)
	{
	case 'a' :
 System.out.println("vowel : a ");
 break;
 case 'A' :
 System.out.println("vowel");
 break;
 case 'e' :
 System.out.println("vowel");
 break;
 case 'i' :
 System.out.println("vowel");
 break;
 case 'I' :
 System.out.println("vowel");
 break;
 case 'o' :
 System.out.println("vowel");
 break;
 case 'u' :
 System.out.println("vowel");
 break;
 case 'U' :
 System.out.println("vowel");
 break;
 default :
 System.out.println("not a VOWEL,But  PEOPLE call it a CONSONANT ");
 break;
 }
 }
 }
