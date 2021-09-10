package task;



public class EvenOdd {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenOdd ob1=new EvenOdd();
		
    int num=10;
    if (num%2==0) {
    	System.out.println("Number is Even number"+num);
    	
    }
    else {
       
       System.out.println("Number is odd number"+num);
	}
    
    
    EvenOdd.evenmethod();
    ob1.oddmethod();
}
	public static void  evenmethod() {
		int a=12;
		if(a%2==0) {
			System.out.println("This number is even number:"+a);
			
		}
		
		
	}
	public void  oddmethod() {
		int a=11;
		if(a%2==0) {
			System.out.println("This number is even number:"+a);
			
		}
		System.out.println("This number is odd number:"+a);
		
	}
}
