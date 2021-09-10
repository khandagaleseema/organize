package homework;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student s2=new Student();
		s2.studentInfoDisplay();
		
		Student s1;
		s1=s2;
		
		System.out.println("Branch of student is:"+s2.Branch);
		System.out.println("Branch of student is:"+s1.Branch);
		
	}

}
