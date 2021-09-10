package example;

public class CountforArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//12. count number of digit,lowercaseletter,uppercase letter in char array = {'a','2','B','q','4','F'};
		
		char ch[]={'a','2','B','q','4','F','@'};
		   int upper = 0, lower = 0, number = 0, special = 0;
		   for(int i=0;i<ch.length;i++)
		   {
			   if(ch[i]>='A' && ch[i]<='Z' )
				   upper ++;
			   else if(ch[i]>='a' && ch[i]<='z')
				   lower++;
			   else if (ch[i]>='0' && ch[i]<='9')
				   number++;
			   else
				   special++;
		   }
		   System.out.println("Upper case letters : " + upper);
		   System.out.println("Lower case letters : " + lower);
		   System.out.println("Numbers  : " + number);
		   System.out.println("Special characters: " + special);
	}

}
