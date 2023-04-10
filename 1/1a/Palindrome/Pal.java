import java.util.*;
class Pal
{public static void main(String m[])
  {int a, rev, temp, digit;
   Scanner obj = new Scanner(System.in);
   System.out.println("Enter a number: ");
   a = obj.nextInt();
   temp=a;
   rev=0;

   while(temp!=0)
   {
     digit=temp%10;
     rev=rev*10+digit;
     temp=temp/10;
   }

   if(a==rev)
   {
     System.out.println(a + " is Palindrome");
   }
   else
   {
    System.out.println(a + " is not Palindrome");
   }

  }
}