package example;
public class PercentageofCountArray {
	public static void main(String[] args) {
			//	13. percentage of digit,lowercaseletter,uppercase letter in char array = {'a','2','B','q','4','F'}; 
				char ch[]={'a','2','B','q','4','F','@'};
		     int totalchar = ch.length;
		     System.out.println("Total number of Character in array is: "+totalchar);
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
		      
		int uppercasepercentage = (upper*100)/totalchar;
		int lowercasepercentage = (lower*100)/totalchar;
		int numberpercentage = (number*100)/totalchar;
		int specialpercentage = (special*100)/totalchar;
		
		System.out.println("Upper Case letters are:"+uppercasepercentage +"%");
		System.out.println("Lower  Case letters are:"+lowercasepercentage +"%");
		System.out.println("Digits are :"+numberpercentage +"%");
		System.out.println("Special characters are :"+specialpercentage +"%");
	}

}
