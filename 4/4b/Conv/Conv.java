import java.util.*;
class Time
{
 int a;
 Scanner obj=new Scanner(System.in);
 void get()
 {
   System.out.print("Enter seconds: ");
   a=obj.nextInt();
 }

 void show()
 { 
   System.out.println("Hours: " + (a/3600));
   System.out.println("Minutes: " + (a/60));
   System.out.println("Seconds: " + (a));   
 }
}

class Conv
{
public static void main(String arg[])
 {
  Time t= new Time();
  t.get();
  t.show();
 }
}