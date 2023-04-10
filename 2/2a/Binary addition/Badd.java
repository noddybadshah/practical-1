import java.util.*;
class Badd
{public static void main(String arg[])
  {  long b1, b2;
     int i=0, carry=0;
     int[] sum= new int[10];
     Scanner obj=new Scanner(System.in);
     System.out.print("Binary number 1: "); 
     b1=obj.nextLong();
     System.out.print("Binary number 2: ");
     b2=obj.nextLong();
     while(b1!=0||b2!=0)
     {
       sum[i++]=(int)((b1%10 + b2%10 + carry)%2);
       carry=(int)((b1%10 + b2%10 + carry)/2);
       b1=b1/10;
       b2=b2/10;
     }
     if(carry!=0)
     {sum[i++]=carry;}
     --i;
     System.out.println("Result: ");
     while(i>=0)
     {
       System.out.print(sum[i--]);
     }

  }
}
   