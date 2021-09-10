package mypkg;

public class StudentConstructor {
	int rollnumber;
	String name;
	float weight;
	public StudentConstructor() {
		
	}
	public StudentConstructor(int a){
		rollnumber=10;
		name="Vaidehi";
		weight=15;
		System.out.println("inside constuctor");
	}

	
	public StudentConstructor(int a,String fname,float b) {
		rollnumber=a;
		name=fname;
		weight=b;
		this.studentInfo();
		//System.out.println(name);
	}
	
	
	public void studentInfo() {
		System.out.println("Rollno"+rollnumber+" name is "+name +"weight is:"+weight);
	}
}
