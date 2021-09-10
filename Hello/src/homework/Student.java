package homework;

public class Student {
       int Rollno=10;
       String Name="Vaishali";
       float percentage=89.90f;
       String Branch= "CSE";
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student student1=new Student();
       Student student2=new Student();
       student1.studentInfoDisplay();
       student2.Name="Priyanka";
       student1.percentage	=student2.percentage;
       System.out.println("Diplay Name of student is:"+student1.Name );
       System.out.println("PErcentage of student2 is:"+student2.percentage);
       System.out.println("PErcentage of student1 is:"+student1.percentage);
       
       
	}
    public void studentInfoDisplay() {
    	System.out.println("Student information should be like this");
    }
}
