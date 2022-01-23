import java.util.*;
class employ
{
  int e,p;
  String s; 
  
  public static void main(String args[])
  { 
     int i;
    
     Scanner obb = new Scanner(System.in);
     employ obj[] = new employ[20];
     System.out.println("how many number of employs");
     int n = obb.nextInt();
     for(i=0;i<n;i++)
     {
      obj[i]= new employ();
      System.out.println("enter the empno");
      obj[i].e =obb.nextInt();
      System.out.println("enter name of employs");
      obj[i].s=obb.next();
      System.out.println("enter the phone number");
      obj[i].p=obb.nextInt();
     }
       System.out.println("empno  name   phone number");
      for(i=0;i<n;i++)
       System.out.println(+obj[i].e+" "+obj[i].s+" "+obj[i].p);
   }
}
   
