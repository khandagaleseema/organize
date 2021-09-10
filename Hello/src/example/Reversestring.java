package example;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 16. Reverse given string str = "India is my country";
		
		String string = "India is my country";    
        //Stores the reverse of given string    
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr);    
	}

}
