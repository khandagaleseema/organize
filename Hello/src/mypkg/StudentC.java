package mypkg;

public class StudentC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentConstructor tt = new StudentConstructor();
		StudentConstructor ob = new StudentConstructor(45);

		StudentConstructor obj2 = new StudentConstructor(12, "sdfsf", 15);

		obj2.studentInfo();
		System.out.println(ob.rollnumber);
		System.out.println(ob.weight);
		System.out.println(ob.name);
		System.out.println(obj2.rollnumber);
	}

}
