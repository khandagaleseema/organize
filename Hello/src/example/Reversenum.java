package example;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversenum obj=new Reversenum();
		obj.reverse();
		 int num=123456789;
	      int reversenum =0;
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of specified number is: "+reversenum);
	   }
	
	public void reverse() {
		int num=123456;
		int reversenumber;
		String reversenum="";
		String str=Integer.toString(num);
		for (int i=str.length()-1;i>=0;i--)
		{
			String restr = reversenum+str.charAt(i);
			 reversenumber = Integer.parseInt(restr);
			 System.out.print(reversenumber);
			
		}
		 System.out.println("");
	}
}


