package mypkg;

public class ThisInJava {
	
	int rollnumber;
	String name;
	float weight;
	
	 public void studentInfo(int rollnumber,float b) {
		 this.rollnumber=rollnumber;
		 weight=b;
		 System.out.println(this.rollnumber);
		 System.out.println(b);
	 }

	public void studentInfo(int rollnumber) {
		// TODO Auto-generated method stub
		this.rollnumber=rollnumber;
		System.out.println(this.rollnumber);
	}
public ThisInJava() {
	System.out.println("Inside constuctor");
}



}
