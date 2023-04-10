class Bank
{
	int getRateOfInsterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateOfInsterest()
	{
		return 8;
	}
}

class ICICI extends Bank
{
	int getRateOfInsterest()
	{
		return 7;
	}
}

class AXIS extends Bank
{
	int getRateOfInsterest()
	{
		return 9;
	}
}

class Test2
{
	public static void main(String args[])
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInsterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInsterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInsterest());
	}
}