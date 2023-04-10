import java.util.*;
class Sum
{public static void main(String m[])
  {int a, sum, temp, digit;
   Scanner obj = new Scanner(System.in);
   System.out.println("Enter a number: ");
   a = obj.nextInt();
   temp=a;
   sum=0;
   while(temp!=0)
   {
     digit=temp%10;
     sum=sum+digit;
     temp=temp/10;
   }
     System.out.println("Result = " + sum);
  }
}