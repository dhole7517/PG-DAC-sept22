public class ByteArraytoString
{  
public static void main(String[] args)   
{  
byte[] byteArray = { 'T', 'E', 'C', 'H', 'N', 'O','L','O','G','Y'}; //byte array of characters  
byte[] byteArray1 = { 84, 69, 67, 72, 78, 79, 76, 79, 71, 89};    //array of ASCII values   
String s = new String(byteArray);               //converts byteArray to String  
String str = new String(byteArray1);  
System.out.println(s);  
System.out.println(str);  
}  
}  