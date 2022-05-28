class Calculator
{
	static int a, b;
	public static void add()
	{
		System.out.println(a+b);
	}
	public static void sub()
	{
		System.out.println(a-b);
	}
	public static void div()
	{
		System.out.println(a/b);
	}
	public static void mul()
	{
		System.out.println(a*b);
	}
}

class CalcManager
{
	public static void main(String args[])
	{
		Calculator.a = 5;
		Calculator.b = 2;
		Calculator.add();
		Calculator.sub();
		Calculator.div();
		Calculator.mul();
	}
}
