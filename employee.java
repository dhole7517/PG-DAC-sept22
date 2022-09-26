class employee
{
  String name;
  String compname;
  int idnumber ;
  long date;
  float salary;

   
public static void main(String[]args)
 
 {
	 employee e1=new employee();
  
  e1.name="S.S.yadav";
  e1.compname="g.s.moze.college";
  e1.idnumber=7575;
  e1.date=12-5-2012;
  e1.salary=56420.45f;
  
  System.out.println("name="+e1.name);
  System.out.println("compname="+e1.compname);
  System.out.println("idnumber="+e1.idnumber);
  System.out.println("date="+e1.date);
  System.out.println("salary="+e1.salary);
  
 }
}