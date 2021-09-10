package example;

public class SwapTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Swap two numbers without third variable.
		SwapTwoNo sp= new SwapTwoNo();
		sp.operatorswap();
		int a=100,b=200;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping value of a and b is :a is: "+a+"  Value of b is: "+b);
	}

	void operatorswap()
	{
		int a=100;
		int b=200;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a+"   "+b);
	}
}
