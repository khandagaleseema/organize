package mypkg;

public class ArithmeticOperator {
	int a=12;
	int b=24;
	
    int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     ArithmeticOperator a= new ArithmeticOperator();
     a.swap(35,100);
     a.swapp(140,159);
     a.add();
	}
//With third variable
public void swap(int a,int b) {
	c=a;
	a=b;
	b=c;
	System.out.println("value of a is:"+a);
	System.out.println("Value of b is:"+b);
}


//Without third variable
public void swapp(int a,int b) {
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("value of a is:"+a);
	System.out.println("Value of b is:"+b);
}

public void add() {
	
String str1="Hello";
String str2="Welcome";
System.out.println(a+b+c+str1+' '+str2);

}



}
