import java.util.*;
class AddMat
{
	public static void main(String arg[])
	{
	Scanner in=new Scanner(System.in);
	int size;
	System.out.print("Enter size of matrix: ");
	size = in.nextInt();
	int a[][] = new int[size][size];
	int b[][] = new int[size][size];
	int c[][] = new int[size][size];

	System.out.println();
	for(int i=0; i<size; i++)
	{
		for(int j=0; j<size; j++)
		{
			System.out.print("Enter value for matrix 1: ");
			a[i][j] = in.nextInt();
		}
	}

	System.out.println();
	for(int i=0; i<size; i++)
	{
		for(int j=0; j<size; j++)
		{

			System.out.print("Enter value for matrix 2: ");
			b[i][j] = in.nextInt();
		
			c[i][j]= a[i][j] + b[i][j];
		}
	}
	
	System.out.println("\nResult:");
	for(int i=0; i<size; i++)
	{	
		
		for(int j=0; j<size; j++)
		{
			System.out.print(c[i][j] + " ");

		}
		System.out.println();
		
	}

	}
}

