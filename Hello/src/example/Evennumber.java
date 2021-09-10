package example;
public class Evennumber {
	public static void main(String[] args) {
			//Find even numbers between 0 to 100.
		System.out.println("To print even number from 0 to 100: ");
		int  n=100;
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
			System.out.print(i+" ");
			}
		}
System.out.println("££££££££££££££££££££££££££££££££££££££££££££££££££££££");
		Evennumber even= new Evennumber();
		even.EvenWhile();
	}
	
	public void EvenWhile() {	
		int n=0;
		while(n<=100)
		{
			if (n%2==0)
			{System.out.println(n);
			
			}
			n=n+1;
		}
		
	}

}

