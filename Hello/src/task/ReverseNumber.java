package task;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ori=123456;
		String rev="";
		String strori=Integer.toString(ori);
		for(int i=strori.length()-1;i>=0;i--)
		{
			
			String revnumber=rev+strori.charAt(i);
		
		
		int revnum=Integer.parseInt(revnumber);
		
		System.out.print(revnum);
	}
	}

}
