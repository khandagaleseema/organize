package example;
import java.text.DecimalFormat;
public class Percentage {
	public static void main(String[] args) {
		Percentage p=new Percentage();
		p.percentage();
		System.out.println("***********************************************************8");
		 // 14. percentage of digit,lowercaseletter,uppercase letter in string str = "india is my country 3454564 dfghrtherth 567678 drfhft BBCH"
		String str = "india is my country 3454564 dfghrtherth 567678 drfhft BBCH #@";
		//String str ="India is my country 100%";
		 int totalChar = str.length(); 
		 System.out.println(totalChar);
	        int upperCase = 0;  
	        int lowerCase = 0;  
	        int digits = 0;  
	        int others = 0;  
	        for (int i = 0; i < str.length(); i++) {  
	            char ch = str.charAt(i);  
	            if (Character.isUpperCase(ch)) {  
	                upperCase++;  
	            }  
	            else if (Character.isLowerCase(ch)) {  
	                lowerCase++;  
	            }  
	            else if (Character.isDigit(ch)) {  
	                digits++;  
	            }  
	            else {  
	                others++;  
	            }  
	        }  
	        double upperCaseLetterPercentage = (upperCase * 100) / totalChar;  
	        double lowerCaseLetterPercentage = (lowerCase * 100) / totalChar;  
	        double digitsPercentage = (digits * 100) / totalChar;  
	        double otherCharPercentage = (others * 100) / totalChar;  
	        DecimalFormat format = new DecimalFormat("##.##");  
	        System.out.println("In '" + str + "' : ");  
	        System.out.println("Uppercase letters are " + format.format(upperCaseLetterPercentage) + "% ");  
	        System.out.println("Lowercase letters are " + format.format(lowerCaseLetterPercentage) + "%");  
	        System.out.println("Digits Are " + format.format(digitsPercentage) + "%");  
	        System.out.println("Other Characters Are " + format.format(otherCharPercentage) + "%");  
	}
	void percentage() {
String str = "india is my country 3454564 dfghrtherth 567678 drfhft BBCH #@";
//String str = "india is my country 3454564 dfghrtherth 567678 drfhft BBCH";
        int upper = 0, lower = 0, number = 0, other = 0;
        	char[] ch = str.toCharArray();
        	int totalcha = ch.length;
        for(int i = 0; i < ch.length; i++)
        {
           // char ch = str.charAt(i);
            if (ch[i] >= 'A' && ch[i]<= 'Z')
                upper++;
            else if (ch[i] >= 'a' && ch[i] <= 'z')
                lower++;
            else if (ch[i]>= '0' && ch[i] <= '9')
                number++;
            else 
                other++;
        }
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + other);
      
         int upperCaseLetterPercentage = (upper * 100) / totalcha ;  
         int lowerCaseLetterPercentage = (lower * 100) / totalcha ;  
        int digitsPercentage = (number * 100) / totalcha ;  
         int specialpercentage = (other * 100) / totalcha ; 
         
         
         System.out.println("Upper Case letters are:"+upperCaseLetterPercentage +"%");
 		System.out.println("Lower  Case letters are:"+lowerCaseLetterPercentage +"%");
 		System.out.println("Digits are :"+digitsPercentage +"%");
 		System.out.println("Special characters are :"+specialpercentage +"%");
	}
}
