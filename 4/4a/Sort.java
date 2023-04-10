import java.util.*;
class SortData
{
	Scanner obj= new Scanner(System.in);
	int temp, i, j;
	int a[]=new int[5];
	void get()
	{	
		for(i=0; i<5; i++)
		{
			System.out.print("Enter value: ");
			a[i]=obj.nextInt();
		}
	}
	
	void show()
	{	System.out.println();
		for(i=0; i<5; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	void asec()
	{
		for(i=0;i<5;i++)
		{
			for(j=i+1; j<5; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	void desc()
	{
		for(i=0;i<5;i++)
		{
			for(j=i+1; j<5; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
  
}


class Sort
{public static void main(String arg[])
  {
	SortData obj=new SortData ();

	obj.get();
	System.out.print("Array before sorting: ");
	obj.show();

	obj.asec();
	System.out.print("Ascending order array: ");
	obj.show();

	obj.desc();
	System.out.print("Descending order array: ");
	obj.show();
  }
}