package calculator;
public class Add extends Number
{
	public Add(int m, int n)
	{
		super(m, n);
	}

	public void sum()
	{
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}