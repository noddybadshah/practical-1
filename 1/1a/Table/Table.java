import java.util.*;
class Table
{public static void main(String m[])
  {int a, i, b;
   Scanner obj = new Scanner(System.in);
   System.out.println("Enter a number: ");
   a = obj.nextInt();
   for(i = 1; i<11; i++)
   {
     b = a*i;
     System.out.println(a + " x " + i + " = " + b);
   }
  }
}