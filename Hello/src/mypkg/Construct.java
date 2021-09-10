package mypkg;

public class Construct {
 int id=2;
 String name="Vaidehi";
Construct()
{
	System.out.println(id+"  "+name);
}
Construct(int n,String m){
	id=n;
	name=m;
	
	//System.out.println(this.id);
	System.out.println(n+"  "+m);
}

Construct(String m,int n)
{   name=m;

id=n;

	System.out.println(m+" "+n);
}

public void sample() {
	System.out.println("value for method:  "+id+"  "+name);
}
	public static void main(String[] args) {
		Construct con =new Construct();
		Construct con2=new Construct(10,"vaishali");
		//Construct con3=new Construct("Digvijay",35);
		
		con.sample();
		con2.sample();
	}
	
	
	
	
}
