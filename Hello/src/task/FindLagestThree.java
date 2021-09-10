package task;

public class FindLagestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 65;
		int c = 90;
		if (a >= b && a >= c) {
			
			System.out.println("a is greater number and value of a is:" + a);
		} 
		
		else if (b >= a && b >= c) {
			System.out.println("b is greater number and value of a is:" + b);
		} 
		
		else
			System.out.println("c is greater number and value of c is:" + c);

		System.out.println("**********************************");
		
		FindLagestThree l =new FindLagestThree();
	l.largestnumber(1,10,100);
	
	}
	
	
public void largestnumber(int a,int b, int c) {
	
	if(a>=b && a>=c) {
		System.out.println("a is largest number");
		
	}
	else if (b>=a && b>=c) {
		System.out.println("b is largest number");
		
	}
	if (c>=a && c>=b) {
		System.out.println("c is largest number");
	}
	else 
		System.out.println("no one value is largest");
}
}
