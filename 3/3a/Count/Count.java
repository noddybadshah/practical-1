import java.util.*;
class Count
{public static void main(String arg[])
  {
	String a;
	Scanner obj= new Scanner(System.in);
	System.out.print("Enter a string: ");
	a=obj.nextLine();
	int digit=0, letter=0, space=0, other=0, l=0;
	l=a.length();
	char c[] = a.toCharArray();
	for(int i=0; i<l; i++)
	{
		if(Character.isLetter(c[i]))
		{
			letter++;
		}
		else
		{
			if(Character.isDigit(c[i]))
			{
				digit++;
			}
			else
			{
				if(Character.isSpace(c[i]))
				{
					space++;
				}
				else
				{
					other++;
				}
			}
		}
	}
	System.out.println("Digit= " + digit + "\t Letter= " + letter + "\t Space= " + space + "\t Other= " + other);
  }
}