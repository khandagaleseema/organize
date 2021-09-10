package example;

public class OccurrenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//21. Calculate number of time character occurs in String
		 String str= "vaishali";
	        char c = 'a';
		
		 int res = 0,count=0;
		 
	        for (int i=0; i<str.length(); i++)
	        {
	            // checking character in string
	            if (str.charAt(i) == c)
	            res++;
	            else if(str.charAt(i)== 'l') {
	            	count++;
	            }
	            	
	        }
	        System.out.println("Occurrence of characters in String:  "+res);
	        System.out.println(count);
	}

}
