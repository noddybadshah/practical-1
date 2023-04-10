import java.util.*;
class Rev
{public static void main(String args[])
  { Scanner obj=new Scanner(System.in);
    String a,b;
    int l;
    System.out.println("Enter a string: ");
    a=obj.nextLine();
    l=a.length();
    b="";
    for(int i=l-1;i>=0;i--)
    {
      b+=a.charAt(i);
    }
    System.out.println("Original string: " + a);
    System.out.println("Reverse string: " + b);
  }
}
