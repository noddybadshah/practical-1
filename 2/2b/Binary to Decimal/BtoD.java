import java.util.*;
class BtoD
{public static void main(String arg[])
  {  Scanner obj=new Scanner(System.in);
     long b;
     int i=0, d=0, c;
     System.out.println("Enter binary number: ");
     b=obj.nextLong();
     while((int)b>0)
     {
       c=(int)b%10;
       d=d+c*(int)Math.pow(2,i);
       b=(int)b/10;
       i+=1;
     }
     System.out.println("Decimal is " + d);
  }
}
  