import java.util.*;
class Compare
{public static void main(String arg[])
	{
		int a[]=new int[10], b, s;
		Scanner in=new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			System.out.print("Enter value: ");
			a[i]=in.nextInt();
		} 
		b=a[0];
		s=a[0];
		for(int i=1; i<10; i++)
		{
			if(b<a[i])
			{b=a[i];}
			if(s>a[i])
			{s=a[i];}
		}
		System.out.println("Largest= " + b + "\t Smallest=" + s);
	}
}