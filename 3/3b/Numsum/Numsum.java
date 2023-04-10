import java.util.*;
class Sum
{
	String a;
	Scanner obj= new Scanner(System.in);
	long sum=0, l;

	void get()
	{
		System.out.print("Enter a string: ");
		a=obj.nextLine();
	}
	
	void show()
	{
		l=a.length();
		char c[] = a.toCharArray();
		for(int i=0; i<l; i++)
		{
			if(Character.isDigit(c[i]))
				{
					sum+=Character.getNumericValue(c[i]);
				}
		}
		System.out.println("Sum = " + sum);
	}
	
}

class Numsum
{public static void main(String arg[])
  {
	Sum obj=new Sum();
	obj.get();
	obj.show();
  }
}