import java.util.*;
class concatenate
{
  public static void main(String args[])
   {
        concatenate obj = new concatenate();
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1 = ob.nextInt();
        System.out.println("enter the second number");
        int n2 = ob.nextInt();
        System.out.println("enter the first string");
        String s1 = ob.next();
        System.out.println("enter the second string");
        String s2 = ob.next();
        obj.con(n1,n2);
        obj.con(s1,s2);
        
   }
   
   void con(int a,int b)
   {
     System.out.println(a+""+b);
   }  
   void con(String a,String b)
   {
     String cat =a.concat(b);
     System.out.println(cat);
   }
}     
