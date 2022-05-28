class Calculator
{
int a, b;
int sum;

Calculator()
{
}
Calculator(int dosa, int boost)
{
a = dosa;
b = boost;
}
public void add()

{
	sum = a+b;
System.out.println("sum = "+sum);
}
}

class CalcManager
{
public static void main(String args[])
{
Calculator calc = new Calculator(35, 18);
calc.add();
}
}

