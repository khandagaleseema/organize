package task;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 reverseString("vaishali");
		 System.out.println("$$$$$$$$$$$$$$$$$$$$$");
		String str="Vaidehi";
		
		 char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev=rev+ch[i];  
		    }  
		    System.out.print(rev);
	}
	

		public static String reverseString(String str){  
		    char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    System.out.print(rev);

		    return rev;  
		}  
		

}
