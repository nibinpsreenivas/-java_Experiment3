import java.util.*;
class student1
{
  public static void main(String args[])
  { 
    student1 obj= new student1();
     obj.read();
   
  }
 
  void read()
   {
     Scanner ob = new Scanner(System.in);
     int m[] = new int[5];
      System.out.println("enter the name");
      String s = ob.next();
     System.out.println("enter the roll number");
      int r = ob.nextInt();
     for(int i = 0;i<5;i++)
       {
         System.out.println("enter the mark of subject "+(i+1));
            m[i] = ob.nextInt();
        }
      display(m,r,s);
    }
   void display(int m[],int r,String s)
   {
     System.out.println("name : "+s);
     System.out.println("roll number : "+r);
     
     for(int i = 0;i<5;i++)
       {
         System.out.println("mark of subject "+(i+1)+" is "+m[i]);
            
        }
    }
}
