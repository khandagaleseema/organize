package example;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumber pr=new Primenumber();
		pr.primenumber();
		//to find prime number
		int num=13;
		int temp=0;
		boolean isPrime = true;
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		  
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	}

	
	
void primenumber() {
	int num=13;
	int temp=0;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			temp=temp+1;
		}
	}
	if(temp==0)
		System.out.println("Given number is  a prime number. ");
	else
		System.out.println("Given number is not a prime number.");
}
}
