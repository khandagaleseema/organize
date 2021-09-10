package task;

public class PrimeNumber {
				public static void main(String[] args) {
					PrimeNumber obj=new PrimeNumber();
					int n=45;
					obj.primeNumberMethod(n);
				}
				
				public void primeNumberMethod(int n) {
					int a,b,flag;
					System.out.println("Print all the number with 1 and :"+n +"are");
					for(a=1;a<=n;a++) {
						if(a==1 ||a==0)
							continue;
						flag=1;
						for(b=2;b<=a/2;++b) {
							if(a%b==0) {
								flag=0;
								break;
								
							}
						}
						if(flag==1)
							System.out.println("a is prime number: "+a);
						
					}
				}
				
				
}
