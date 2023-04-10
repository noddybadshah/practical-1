import java.util.*;
class DtoB
{public static void main(String arg[])
  {  Scanner obj=new Scanner(System.in);
     int rem=0, num=0, bin=0, a=1;
     System.out.println("Enter decimal number: ");
     num=obj.nextInt();
     while(num>0)
     {
       rem=num%2;
       num=num/2;
       bin=bin+(rem*a);
       a=a*10;
     }
     System.out.println("Binary is " + bin);
  }
}
  