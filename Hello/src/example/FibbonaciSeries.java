package example;

public class FibbonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibonacci Series Program
		int num1=0,num2=1,num3;
		int count=10;
		System.out.print("Fibonacci Series is: "+num1+"  "+num2);
		for(int i=0;i<count;i++)
		{
			num3=num1+num2;
			System.out.print("  "+num3);
			num1=num2;
			num2=num3;
		}
	}

}
