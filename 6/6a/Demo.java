import calculator.*;
class Demo
{	
	public static void main(String arg[])
	{
		Add obj = new Add(15, 20);
		obj.sum();

		Sub obj2 = new Sub(150, 20);
		obj2.sub();

		Mul obj3 = new Mul(150, 20);
		obj3.mul();

		Div obj4 = new Div(140, 20);
		obj4.div();
	}
}