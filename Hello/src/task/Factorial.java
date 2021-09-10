package task;

public class Factorial {

	public static void main(String[] args) {
		Factorial fact=new Factorial();
		int c=fact.factorial(5);
		System.out.println("Factorial of 5 is: "+c);
		Factorial f=new Factorial();
		
	    System.out.println("factorial of 4 is : "+f.fact(4));
	    f.fac(4);
	    System.out.println(f.fact(4));
	    
	}
	public int factorial(int n)
    {
        if (n == 0)
          return 1;
          
        return n*factorial(n-1);
    }
	 public  int fact(int n)
	    {
	        int res = 1, i;
	        for (i=2; i<=n; i++)
	            res =res* i;
	        return res;
	    }
	 
	 public  void fac(int n)
	    {
	        int res = 1, i;
	        for (i=2; i<=n; i++)
	            res =res* i;
	       // System.out.println(res);
	    }
}
