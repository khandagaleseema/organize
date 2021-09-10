package task;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap ob = new Swap();

		ob.withoutthirdvariable(12, 45);
		withthirdvariable(99,45);
		Swap.withthirdvariable(98,100);
	}

	public void withoutthirdvariable(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping the value of a  is:"+a);
		System.out.println("After swapping the value of  b is:"+b);
		System.out.println("******************");
	}

	public static void withthirdvariable(int a, int b) {
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping the value of a  is:"+a);
		System.out.println("After swapping the value of  b is:"+b);
		System.out.println("-----------------------------");
	}

}
