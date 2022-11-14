class q21
{
  static void remove(String str,String word)
  {
    String msg[]=str.split(" ");
	String newstr="";
	
	for(String words :msg){
	 if(!word.equals(word)){
	 newstr +=word +"";
	 }
	 }
	 System.out.println(newstr);
  }
 public static void main(String [] args)
 {
  String str ="this is the Cdac for cdac";
  
  String word ="the";
  
  remove (str,word);
  remove (str,word);
 }
 

}