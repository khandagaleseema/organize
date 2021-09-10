package thispkg;

public class This {
	int a=10;
	int b=20;
	String str="Vaidehi";
	This(){
		System.out.println(this.str);
	}
	This(int i,int j){
		
	}
	public void m1() {
		int a=50;
		System.out.println(a);
		System.out.println(this.a);
	}
}
